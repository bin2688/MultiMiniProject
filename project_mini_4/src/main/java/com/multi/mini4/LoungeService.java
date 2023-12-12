package com.multi.mini4;

import org.springframework.beans.factory.annotation.Autowired;

public class LoungeService {
	
	@Autowired
	LoungeDAO loungeDAO;
	
	public void insert(LoungeVO loungeVO) {
		loungeDAO.insert(loungeVO);
	}
}
