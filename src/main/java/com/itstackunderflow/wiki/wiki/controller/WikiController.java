package com.itstackunderflow.wiki.wiki.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.itstackunderflow.wiki.wiki.dto.CommentWrapperDto;
import com.itstackunderflow.wiki.wiki.dto.WikiWrapperDto;

@RestController("/api/wiki")
public class WikiController {
	
	//위키 목록 요청 by tag, pageNum, limit(페이지당 제공 갯수), author, 
	// sort(createDate, Title, author, #of like, #of comment), 
	// and/or order(asc,desc)
	@GetMapping("/")
	public List<WikiWrapperDto> getWiki(@RequestParam String tag, 
			@RequestParam int pageNum, 
			@RequestParam int limit, 
			@RequestParam String author, 
			@RequestParam String sort, 
			@RequestParam String order) {
		return null;
	}
	
	//위키 글 작성
	@PostMapping("/")
	public String postWiki(@RequestBody WikiWrapperDto wiki) {
		
		return null;
	}
	
	//위키 페이지 상세 내역 요청, 조회수 카운트+1
	@GetMapping("/{wikiId}")
	public List<WikiWrapperDto> getWikiByWikiId(@PathVariable("wikiId") int wikiId){
		
		return null;
	}
	
	//위키 페이지 수정
	@PutMapping("/{wikiId}")
	public List<WikiWrapperDto> putWikiByWikiId(@PathVariable("wikiId") int wikiId, 
			@RequestBody WikiWrapperDto wikiWrapperDto){
		return null;
	}
	
	//위키 페이지 삭제(hidden 처리)
	@DeleteMapping("/{wikiId}")
	public List<WikiWrapperDto> deleteWikiByWikiId(@PathVariable("wikiId") int wikiId){
		return null;
	}
	
	//위키 페이지의 게시물 수 반환
	@GetMapping("/{wikiId}/like")
	public List<WikiWrapperDto> getLikeCount(@PathVariable("wikiId") int wikiId) {
		return null;
	}
	
	//위키 페이지 좋아요 / 좋아요 취소 toggle
	@PostMapping("/{wikiId}/like")
	public List<WikiWrapperDto> postWikiLikeToggle(@PathVariable("wikiId") int wikiId) {
		return null;
	}
	
	//위키 페이지 댓글 목록 요청 
	@GetMapping("/comment/{wikiId}")
	public List<CommentWrapperDto> getCommentByWikiId(@PathVariable("wikiId") int wikiId) {
		return null;
	}
	
	//위키 페이지 댓글 작성 
	@PostMapping("/comment/{wikiId}")
	public List<CommentWrapperDto> postCommentByWikiId(@PathVariable("wikiId") int wikiId, 
			@RequestBody CommentWrapperDto commentDto) {
		return null;
	}
	
	//위키 페이지 댓글 수정
	@PutMapping("/{wikiId}/comment/{commentId}")
	public List<CommentWrapperDto> putCommentByCommentId(@PathVariable("wikiId") int wikiId,
			@PathVariable("commentId") int commentId,
			@RequestBody CommentWrapperDto commentDto) {
		return null;
	}
	
	//위키 페이지 댓글 삭제 
	@DeleteMapping("/{wikiId}/comment/{commentId}")
	public List<CommentWrapperDto> deleteCommentByCommentId(@PathVariable("wikiId") int wikiId, 
			@PathVariable("commentId") int commentId) {
		return null;
	}
	
	//위키 페이지 댓글 좋아요 / 좋아요 취소 (toggle) 
	@PostMapping("/{wikiId}/comment/{commentId}/like")
	public List<CommentWrapperDto> postCommentLikeToggle(@PathVariable("wikiId") int wikiId, 
			@PathVariable("commentId") int commentId) {
		return null;
	}
	
	
}
