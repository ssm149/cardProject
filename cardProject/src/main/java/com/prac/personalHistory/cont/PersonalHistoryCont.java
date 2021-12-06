package com.prac.personalHistory.cont;

// test
import java.io.*;
import java.util.*;

import javax.servlet.http.*;

import org.codehaus.jackson.*;
import org.codehaus.jackson.map.*;
import org.springframework.ui.*;
import org.springframework.web.multipart.*;

import com.prac.entity.*;

public interface PersonalHistoryCont {
	public HashMap<String, Object> userList(HttpServletRequest request);
	public HashMap<String,Object> registerUser(HttpServletRequest request);
	public HashMap<String,Object> registerUserUpdate(HttpServletRequest request);
	public int imgInsert(MultipartFile file, String userName, Image image) throws IllegalStateException, IOException;
	HashMap<String, Object> getRegisterData(HttpServletRequest request, HttpServletResponse response, Model model)
			throws JsonParseException, JsonMappingException, IOException;
	int imgUpdate(MultipartFile file, String userName, Image image) throws IllegalStateException, IOException;
	
	//학교
	public List<UserInfoEdu> School() throws Exception ;
	//보유기술
	public List<UserInfoLicen> abc() throws Exception ;
	//자격증
	public List<UserInfoQualifi> certificate() throws Exception;
	//회사
	public List<UserInfoCareer> company() throws Exception;
	//교육
	public List<UserInfoTraining> education() throws Exception;
	//프로젝트
	public List<UserInfoSkill> project() throws Exception;
	//사진
	public List<Image> picture() throws Exception;
	//삭제
	public int delete(int userIdx) throws Exception ;
	//취미
	public List<UserInfoHobby> hhh() throws Exception;
			
}
