package com.prac.personalHistory.dao;

import java.util.List;

import org.mybatis.spring.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import com.prac.entity.*;

@Repository
public class ImageDao {
	@Autowired
	private SqlSessionTemplate tpl;
	
	public int imgInsert(Image image) {
		return tpl.insert("personalHistory.imgInsert", image);
	}
	
	public int imgUpdate(Image image) {
		return tpl.update("personalHistory.imgUpdate", image);
	}
	
	public Image getUserImg(Integer userIdx) {
		return tpl.selectOne("personalHistory.getUserImg", userIdx);
	}
	
	public List<Image> picture() {
		return tpl.selectList("personalHistory.list");
	}
	
	public int imgSelect(Image image) {
		return tpl.selectOne("personalHistory.imgSelect", image);
	}
}
