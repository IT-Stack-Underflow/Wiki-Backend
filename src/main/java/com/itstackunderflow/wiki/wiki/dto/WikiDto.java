package com.itstackunderflow.wiki.wiki.dto;

import lombok.Data;

@Data
public class WikiDto {
	private int wikiId;
	private String wikiTitle;
	private java.sql.Timestamp wikiCreate;
	private java.sql.Timestamp wikiModify;
	private int wikiCount;
	private int wikiHidden;
	private int wikiParent;
	private int wikiCurrent;
	private String wikiShort;
	
}
