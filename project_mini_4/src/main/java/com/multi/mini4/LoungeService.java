package com.multi.mini4;

import org.springframework.beans.factory.annotation.Autowired;

public class LoungeService {
	
	@Autowired
	LoungeDAO loungeDAO;
	
	public void insert(LoungeVO loungeVO) {
		loungeDAO.insert(loungeVO);
	}
	
	public void update(LoungeVO loungeVO) {
		loungeDAO.update(loungeVO);
	}
	
	public void list() {
		loungeDAO.list();
	}
	
	public void one(Integer lounge_id) {
		loungeDAO.one(lounge_id);
	}
}
