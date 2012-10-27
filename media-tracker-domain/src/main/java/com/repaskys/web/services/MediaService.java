package com.repaskys.web.services;

import com.repaskys.web.domain.Media;

public interface MediaService {
	boolean saveMedia(Media media);
	Iterable<Media> findAll();
}
