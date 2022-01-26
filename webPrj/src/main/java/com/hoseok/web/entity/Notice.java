/*
 * VO value Object : 데이터베이스 테이블 NOTICE의 각 컬럽값 저장용 객체 : 한 행씩 저장
 * DTO : Data Transfer Object
 * DO : Domain Object
 * */

package com.hoseok.web.entity;

import java.util.Date;

public class Notice {
	private int id;
	private String title;
	private String memberId;
	private String content;
	private Date regdate;
	private int hit;
	private String files;
	
	public Notice() {
		
	}
	public Notice(int id, String title, String memberId, String content, Date regdate, int hit, String files) {
		this.id = id;
		this.title = title;
		this.content = content;
		this.regdate = regdate;
		this.hit = hit;
		this.memberId = memberId;
		this.files = files;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegDate(Date regdate) {
		this.regdate = regdate;
	}
	public int getHit() {
		return hit;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getFiles() {
		return files;
	}
	
	public void setFiles(String files) {
		this.files = files;
	}
}
