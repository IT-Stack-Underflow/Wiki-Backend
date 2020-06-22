package com.itstackunderflow.wiki.wiki.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itstackunderflow.wiki.wiki.dto.WikiDto;
import com.itstackunderflow.wiki.wiki.mapper.WikiMapper;

@Service
public class WikiServiceImpl implements WikiService{
	@Autowired
	private WikiMapper wikiMapper;
	
	@Override
	public List<WikiDto> selectAll() throws Exception {
		// TODO Auto-generated method stub
		return wikiMapper.selectTest();
	}

}
