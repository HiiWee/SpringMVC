package com.hoseok.web.service;

import java.sql.SQLException;
import java.util.List;

import com.hoseok.web.entity.Notice;

public interface NoticeService {

	public List<Notice> getList(int page, String field, String query) throws ClassNotFoundException, SQLException;
	
	// 단일 값을 얻는 함수 = "스칼라 값(Scalar)"
	public int getCount(String field, String query) throws ClassNotFoundException, SQLException;

	public int insert(Notice notice) throws ClassNotFoundException, SQLException;
	
	public int update(Notice notice) throws ClassNotFoundException, SQLException;
	
	public int delete(int id) throws ClassNotFoundException, SQLException;

}
