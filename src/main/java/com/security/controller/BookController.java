package com.security.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.security.bean.BookInfo;
import com.security.service.BookService;

@RestController
public class BookController {
	
	@Autowired
	private BookService bookService;
	
	@GetMapping("book/welcome")
	public String welcome() {
		return bookService.info();
	}
	
	@GetMapping("book/info")
	public List<BookInfo> booksInfo(){
		List<BookInfo> bookList = bookService.bookInfo();
		return bookList;
	}
	
}
