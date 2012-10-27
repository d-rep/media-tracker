package com.repaskys.web.actions;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.Preparable;
import com.repaskys.web.domain.Media;
import com.repaskys.web.services.MediaService;

public class MediaAction implements Preparable {
	private static final Logger LOGGER = LoggerFactory.getLogger(MediaAction.class);
	
	@Autowired
	private MediaService mediaService;
	
	private Media media;
	
	public Media getMedia() {
		return media;
	}

	public void setMedia(Media media) {
		this.media = media;
	}
	
	public String execute() {
		LOGGER.trace("called into MediaAction#execute");
		String returnCode = "ERROR";
		
		if(media != null) {
			LOGGER.debug("creating new media instance: " + media.toString());
			
			if(mediaService.saveMedia(media)) {
				returnCode = "SUCCESS";
			}
		}
		
		return returnCode;
	}

	@Override
	public void prepare() throws Exception {
		this.media = new Media();
	}
}
