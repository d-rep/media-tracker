package com.repaskys.web.data;

import java.util.List;

import com.repaskys.web.domain.Media;

public interface MediaDao {
	void store(Media media);
	void delete(Long mediaId);
	Media findById(Long mediaId);
	List<Media> findAll();
}
