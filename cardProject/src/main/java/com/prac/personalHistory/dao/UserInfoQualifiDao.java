package com.prac.personalHistory.dao;


import java.util.*;

import org.mybatis.spring.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import com.prac.entity.*;


@Repository
public class UserInfoQualifiDao {

	@Autowired
	private SqlSessionTemplate tpl;
	
	public Integer insert(Map<String, Object> paramMap) {
		return tpl.insert("qualifiDao.insert",paramMap);
	}
	
	public Integer updateUserQulifi(UserInfoQualifi userInfoQualifi) {
		return tpl.update("qualifiDao.updateUserQulifi", userInfoQualifi);
	}

	public List<UserInfoQualifi> list(int intUserIdx) {
		return tpl.selectList("qualifiDao.list", intUserIdx);
	}
	public List<UserInfoQualifi> certificate() {
		return tpl.selectList("qualifiDao.certificate");
	}
}
