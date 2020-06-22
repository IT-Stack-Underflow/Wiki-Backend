package com.itstackunderflow.wiki.wiki.service;

import java.util.List;

import com.itstackunderflow.wiki.wiki.dto.WikiDto;

public interface WikiService {
	List<WikiDto> selectAll() throws Exception;	// Exception 처리 해야됨
}
