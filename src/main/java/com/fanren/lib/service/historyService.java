package com.fanren.lib.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fanren.lib.DAO.history_infoMapper;
import com.fanren.lib.pojo.history_info;
import com.fanren.lib.pojo.history_infoExample;
import com.fanren.lib.pojo.history_infoExample.Criteria;

@Service
public class historyService {

		
	@Autowired
	history_infoMapper history_infoMapper;
	
	public List<history_info> getAll(Integer book_id){
		history_infoExample historyExample=new history_infoExample();
		Criteria criteria=historyExample.createCriteria();
		criteria.andBookIdEqualTo(book_id);
		List<history_info> historyInfo=history_infoMapper.selectByExample(historyExample);
		return historyInfo;
	}

	public void insertInfo(Integer book_id, String people) {
		// TODO Auto-generated method stub
		Date date=new Date();
		history_info history_info=new history_info();
		history_info.setBookId(book_id);
		history_info.setPeople(people);
		history_info.setReadTime(date);
		history_infoMapper.insertSelective(history_info);
	}

	public void updataInfo(Integer book_id) {
		// TODO Auto-generated method stub
		Date date=new Date();
		history_info record=new history_info();
		record.setBackTime(date);
		history_infoExample example=new history_infoExample();
		example.createCriteria().andBookIdEqualTo(book_id);
		history_infoMapper.updateByExampleSelective(record, example);
	}
}

