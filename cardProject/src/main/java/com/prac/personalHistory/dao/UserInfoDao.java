package com.prac.personalHistory.dao;

import java.util.List;
import java.util.ArrayList;

import org.mybatis.spring.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import com.prac.entity.*;

@Repository
public class UserInfoDao {

	@Autowired
	private SqlSessionTemplate tpl;

	public Integer insert(UserInfo info) {
		return tpl.insert("userInfoDao.insert", info);
	}

	public UserInfo userInfo(Integer userIdx) {
		return tpl.selectOne("userInfoDao.userInfo", userIdx);
	}

	// 리스트뿌려줌
	public List<UserInfo> memInfoList() {

		return tpl.selectList("userInfoDao.memInfoList");
	}


	public int UserCount() {
		return tpl.selectOne("userInfoDao.UserCount");
	}

	public Integer delete(int userIdx) {
		
		return tpl.delete("userInfoDao.delete", userIdx);
	}


	
}
