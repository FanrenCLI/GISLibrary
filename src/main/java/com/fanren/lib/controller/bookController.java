package com.fanren.lib.controller;


import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.fanren.lib.pojo.Book;
import com.fanren.lib.service.BookService;
import com.fanren.lib.service.historyService;
import com.fanren.lib.util.data_transform;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;


/**处理书籍查询请求
 * @author FanrenCLI
 * @Time 2018年9月6日-下午3:15:39
 * @version 0.0.1
 */
@Controller

public class bookController {
	
	@Autowired
	BookService bookservice;
	@Autowired
	historyService historyservice;
	
	@RequestMapping("/bookInfo")
	@ResponseBody
	public data_transform getbookInfo(@RequestParam(value="pn",defaultValue="1") Integer pn, Model model) {
		//使用分页查询
		PageHelper.startPage(pn,7);
		List<Book> booklist=bookservice.getAll();
		//包装分页
		PageInfo<Book> pageInfo= new PageInfo<Book>(booklist, 5);
		data_transform booklist_1=new data_transform();
        return booklist_1.add("pageInfo", pageInfo);
    }
	@RequestMapping("/read")
	@ResponseBody
	public void readbook(@Param("book_id") Integer book_id,
						 @Param("people") String people,
						 @Param("tel") String tel) {
		bookservice.updatainfo(book_id,people,tel);
		historyservice.insertInfo(book_id,people);
	}
	@RequestMapping("/back")
	@ResponseBody
	public void backbook(@Param("book_id") Integer book_id,
						 @Param("people") String people) {
		bookservice.updatainfo(book_id,people);
		historyservice.updataInfo(book_id);
	}
	@RequestMapping("/addbook")
	@ResponseBody
	public void addbookBypeople(@Param("book_name") String book_name,
								@Param("book_code") String book_code) {
		bookservice.insertbook(book_name, book_code);
	}
}
