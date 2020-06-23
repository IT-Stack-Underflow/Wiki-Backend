package com.itstackunderflow.wiki.wiki.dto;

import java.util.List;

import lombok.Data;

@Data
public class WikiWrapperDto {

	private WikiDto wiki;
	private int revisionCount;
	private List<WikiRevisionDto> revision;
	private int wikiLikeCount;
	//private List<UserDto> wikiLikes;// TODO: user after make userDto
	private List<TagDto> tags;
	private int commentsCount;
	private List<CommentWrapperDto> comments;
	private int attachFileCount;
	private List<AttachFileDto> attachFiles;
	private int contributorCount;
	//private List<UserDto> contributors;// TODO: user after make userDto

}
