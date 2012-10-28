package com.repaskys.web.actions;

import java.util.List;

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
	
	private List<Media> mediaList;
	private Media media;
	
	public List<Media> getMediaList() {
		return mediaList;
	}

	public void setMediaList(List<Media> mediaList) {
		this.mediaList = mediaList;
	}
	
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
			
			this.mediaList = mediaService.findAll();
		}
		
		return returnCode;
	}

	@Override
	public void prepare() throws Exception {
		this.media = new Media();
	}
}
