package com.prac.personalHistory.dao;

import java.util.*;

import org.mybatis.spring.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import com.prac.entity.*;

@Repository
public class UserInfoHobbyDao {

	@Autowired
	private SqlSessionTemplate tpl;

	public Integer insert(Map<String, Object> paramMap) {
		return tpl.insert("hobbyDao.insert", paramMap);
	}

	public Integer updateUserHobby(UserInfoHobby userInfoHobby) {
		return tpl.update("hobbyDao.updateUserHobby", userInfoHobby);
	}

	public List<UserInfoHobby> list(int intUserIdx) {
		return tpl.selectList("hobbyDao.list", intUserIdx);
	}

	public List<UserInfoHobby> hhh() {
		return tpl.selectList("hobbyDao.list");
	}

}
