package com.security.service;

import java.util.List;

import com.security.bean.BookInfo;


public interface BookService {
	
	public List<BookInfo> bookInfo();
	public Boolean bookStore(BookInfo bookInfo);
	
	default String info() {
		return "Welcome to Book Store Application";
	}

}
