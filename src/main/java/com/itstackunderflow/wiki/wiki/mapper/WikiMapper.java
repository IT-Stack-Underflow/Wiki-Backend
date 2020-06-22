package com.itstackunderflow.wiki.wiki.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.itstackunderflow.wiki.wiki.dto.WikiDto;

@Mapper
public interface WikiMapper {
	List<WikiDto> selectTest(); 
}
