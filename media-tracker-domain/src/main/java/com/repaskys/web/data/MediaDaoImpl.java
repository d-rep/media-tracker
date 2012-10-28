package com.repaskys.web.data;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.repaskys.web.domain.Media;

/**
 * Hibernate implementation, which persists objects with Hibernate XML mappings
 * (and not with JPA).
 * 
 * This will rethrow any database runtime exceptions back up to be handled in
 * the service layer.
 */
public class MediaDaoImpl implements MediaDao {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(MediaDaoImpl.class);
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void store(Media media) {
		LOGGER.trace("called into MediaDaoImpl#store");
		
		Session session = sessionFactory.openSession();
		Transaction tx = session.getTransaction();
		
		try {
			tx.begin();
			session.saveOrUpdate(media);
			tx.commit();
		} catch(RuntimeException e) {
			tx.rollback();
			LOGGER.error("Problem while storing Media, so rolled back transaction", e);
			throw e;
		} finally {
			session.close();
		}
	}

	@Override
	public List<Media> findAll() {
		LOGGER.trace("called into MediaDaoImpl#findAll");
		Session session = sessionFactory.openSession();
		try {
			Query query = session.createQuery("from Media");
			return query.list();
		} finally {
			session.close();
		}
	}

	@Override
	public void delete(Long mediaId) {
		LOGGER.trace("called into MediaDaoImpl#delete");
		Session session = sessionFactory.openSession();
		Transaction tx = session.getTransaction();
		try {
			tx.begin();
			Media media = (Media) session.get(Media.class, mediaId);
			session.delete(media);
		} catch(RuntimeException e) {
			tx.rollback();
			LOGGER.error("Problem while deleting Media, so rolled back transaction", e);
			throw e;
		} finally {
			session.close();
		}
	}

	@Override
	public Media findById(Long mediaId) {
		LOGGER.trace("called into MediaDaoImpl#findById");
		Session session = sessionFactory.openSession();
		try {
			return (Media) session.get(Media.class, mediaId);
		} finally {
			session.close();
		}
	}
}
