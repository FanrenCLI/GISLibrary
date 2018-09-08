package com.fanren.lib.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fanren.lib.DAO.BookMapper;
import com.fanren.lib.pojo.Book;
import com.fanren.lib.pojo.BookExample;


@Service
public class BookService {

	@Autowired
	BookMapper bookmapper;
	
	public List<Book> getAll() {
		// TODO Auto-generated method stub
		return bookmapper.selectByExample(null);
	}

	public void updatainfo(Integer book_id,String people,String tel) {
		// TODO Auto-generated method stub
		Book book=new Book();
		book.setPeople(people);
		book.setTel(tel);
		book.setStatus("已借");
		BookExample bookExample=new BookExample();
		bookExample.createCriteria().andIdBookEqualTo(book_id);
		bookmapper.updateByExampleSelective(book, bookExample);
	}

	public void updatainfo(Integer book_id, String people) {
		// TODO Auto-generated method stub
		Book book=new Book();
		book.setPeople("");
		book.setTel("");
		book.setStatus("可借");
		BookExample bookExample=new BookExample();
		bookExample.createCriteria().andIdBookEqualTo(book_id);
		bookmapper.updateByExampleSelective(book, bookExample);
	}

	public void insertbook(String bookname, String bookcode) {
		// TODO Auto-generated method stub
		Book newbook=new Book();
		newbook.setName(bookname);
		newbook.setCode(bookcode);
		newbook.setStatus("可借");
		bookmapper.insertSelective(newbook);
	}

}
