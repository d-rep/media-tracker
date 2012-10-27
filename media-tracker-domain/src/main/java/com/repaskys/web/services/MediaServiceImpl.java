package com.repaskys.web.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.repaskys.web.data.MediaDao;
import com.repaskys.web.domain.Media;

public class MediaServiceImpl implements MediaService {
	private static final Logger LOGGER = LoggerFactory.getLogger(MediaServiceImpl.class);
	
	@Autowired
	private MediaDao mediaDao;

	@Override
	public boolean saveMedia(Media media) {
		LOGGER.trace("called into MediaServiceImpl#saveMedia");
		
		boolean success = false;
		try{
			success = mediaDao.save(media);
		} catch(RuntimeException ex) {
			LOGGER.error("Problem happened while saving Media items", ex);
		}
		
		return success;
	}

	@Override
	public Iterable<Media> findAll() {
		LOGGER.trace("called into MediaServiceImpl#findAll");
		Iterable<Media> results = null;
		try{
			results = mediaDao.findAll();
		} catch(RuntimeException ex) {
			LOGGER.error("Problem happened while retrieving all Media items", ex);
		}
		return results;
	}
	
}