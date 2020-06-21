package com.itstackunderflow.wiki.wiki.dto;

import lombok.Data;

@Data
public class WikiRevisionDto {
	private int revId;
	private int wikiId;
	private int userId;
	private String wikiTitle;
	private String wikiBody;
	private java.sql.Timestamp revDate;
	
}
