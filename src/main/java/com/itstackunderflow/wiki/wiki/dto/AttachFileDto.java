package com.itstackunderflow.wiki.wiki.dto;

import lombok.Data;

@Data
public class AttachFileDto {
	private int fileId;
	private String fileName;
	private int fileOwner;
	private String fileOriginal;
	private int fileSize;
	private String fileType;
	private java.sql.Timestamp fileCreate;
	
}
