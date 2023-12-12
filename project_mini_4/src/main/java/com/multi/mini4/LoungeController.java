package com.multi.mini4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoungeController {
	
	@Autowired
	LoungeDAO loungeDAO;
	
	@RequestMapping("insert.lounge")
	public void insert(LoungeVO loungeVO) {
		loungeDAO.insert(loungeVO);
	}
}
