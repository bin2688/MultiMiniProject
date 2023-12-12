package com.multi.mini4;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class LoungeDAO {
	
	@Autowired
	SqlSessionTemplate my;
	
	public void insert(LoungeVO loungeVO) {
		my.insert("lounge.create", loungeVO);
	}
}
