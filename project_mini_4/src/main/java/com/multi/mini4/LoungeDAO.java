package com.multi.mini4;

import java.util.List;

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
	
	public void update(LoungeVO loungeVO) {
		my.update("lounge.update", loungeVO);
	}
	
	public void delete(LoungeVO loungeVO) {
		my.delete("lounge.delete", loungeVO);
	}
	
	public List<LoungeVO> list() {
		List<LoungeVO> list = my.selectList("lounge.list");
		return list;
	}
	
	public LoungeVO one(Integer lounge_id) {
		return my.selectOne("lounge.one", lounge_id);
	}

	
}
