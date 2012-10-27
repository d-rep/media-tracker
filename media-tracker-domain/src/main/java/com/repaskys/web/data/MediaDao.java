package com.repaskys.web.data;

import com.repaskys.web.domain.Media;

public interface MediaDao {
	boolean save(Media media);
	Iterable<Media> findAll();
}
