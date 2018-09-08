package com.fanren.lib.controller;


import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fanren.lib.pojo.history_info;
import com.fanren.lib.service.historyService;


@Controller
public class historyController {

	@Autowired
	historyService historyservice;
	
	
	@RequestMapping("/history")
	@ResponseBody
	public List<history_info> getHistory_infoById(@Param("book_id") Integer book_id) {
		return historyservice.getAll(book_id);
	}
}
