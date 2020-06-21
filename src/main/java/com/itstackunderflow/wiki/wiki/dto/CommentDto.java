package com.itstackunderflow.wiki.wiki.dto;

import lombok.Data;

@Data
public class CommentDto {
	private int commentId;
	private int userId;
	private String commentBody;
	private java.sql.Timestamp commentCreate;
	private int commentParent;
	private int wikiId;
}
