package com.repaskys.web.services;

import java.util.List;

import com.repaskys.web.domain.Media;

public interface MediaService {
	boolean saveMedia(Media media);
	List<Media> findAll();
}
