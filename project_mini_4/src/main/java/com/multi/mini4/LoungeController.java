package com.multi.mini4;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class LoungeController {
	
	@Autowired
	LoungeDAO loungeDAO;
	
	@RequestMapping("insert.lounge")
	public void insert(LoungeVO loungeVO) {
		loungeDAO.insert(loungeVO);	
	}
	
	@RequestMapping("update.lounge")
	public void update(LoungeVO loungeVO) {
		loungeDAO.update(loungeVO);
	}
	
	@RequestMapping("delete.lounge")
	public void delete(LoungeVO loungeVO) {
		loungeDAO.delete(loungeVO);
	}
	
	@RequestMapping("list.lounge")
	public void list(Model model) throws Exception {
		List<LoungeVO> list = loungeDAO.list();
		model.addAttribute("list", list);
	}
	
	@RequestMapping("one")
	public void one(Integer lounge_id, Model model) throws Exception {		
		LoungeVO loungeVO = loungeDAO.one(lounge_id);		
		model.addAttribute("one", loungeVO);
	
	}
}
