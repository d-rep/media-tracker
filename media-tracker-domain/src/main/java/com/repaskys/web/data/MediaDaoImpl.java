package com.repaskys.web.data;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.repaskys.web.domain.Media;

public class MediaDaoImpl implements MediaDao {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(MediaDaoImpl.class);
	
	@Override
	public boolean save(Media media) {
		LOGGER.trace("called into MediaDaoImpl#saveMedia");
		// TODO implement me
		return false;
	}

	@Override
	public Iterable<Media> findAll() {
		LOGGER.trace("called into MediaDaoImpl#findAll");
		// TODO implement me
		return null;
	}
}
