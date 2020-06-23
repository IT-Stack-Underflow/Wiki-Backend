package com.itstackunderflow.wiki.wiki.dto;

import java.util.List;

import lombok.Data;

@Data
public class CommentWrapperDto {
	
	private int commentLikeCount;
	private CommentDto comment; 
	//private List<UserDto> commentLike;//TODO :
	private int attachFileCount;
	private List<AttachFileDto> attachFiles;
}
