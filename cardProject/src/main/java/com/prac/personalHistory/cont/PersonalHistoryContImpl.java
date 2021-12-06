package com.prac.personalHistory.cont;

import java.io.*;
import java.util.*;

import javax.servlet.http.*;

import org.codehaus.jackson.*;
import org.codehaus.jackson.map.*;
import org.slf4j.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.*;

import com.prac.*;
import com.prac.entity.*;
import com.prac.personalHistory.serv.*;


@Controller
public class PersonalHistoryContImpl implements PersonalHistoryCont{
	
	@Autowired
	PersonalHistoryServImpl personalHistoryServ;
	
	private static final Logger log = LoggerFactory.getLogger(HomeController.class);
	
	@Override
	@RequestMapping(value="/personalHistory/userList", method=RequestMethod.POST)
	public @ResponseBody HashMap<String, Object> userList(HttpServletRequest request) { 
		log.info("******************userList********************");
		HashMap<String, Object> resultMap = new HashMap<String, Object>();
		Map<String,Object> reqMap = (Map<String, Object>) request.getParameterMap();
		HashMap<String,Object> unlockedReqMap = new HashMap<String,Object>();
		
		// 媛� 蹂듭궗瑜� �쐞�븳 猷⑦봽
		log.info("==========reqMap=========");
		for( String key : reqMap.keySet() ){
			unlockedReqMap.put(key, reqMap.get(key));
			log.info("{}",key);
        }
		
		try {
//			for(String key: unlockedReqMap.keySet()) {
//				log.info("{}: {}",key, unlockedReqMap.get(key));
//			}
			resultMap = (HashMap<String, Object>)personalHistoryServ.userList(unlockedReqMap);
		} catch (Exception e) {
			System.out.println("ERROR PersonalHistoryServImpl : " + e);
		}
		for( String key : resultMap.keySet() ){
			log.info("{}",key);
        }
		return resultMap;
		
	}
	
	@Override
	@RequestMapping(value="/personalHistory/registerUser", method=RequestMethod.POST)
	public @ResponseBody HashMap<String,Object> registerUser(HttpServletRequest request) {
		log.info("******************registerUser********************");
		// getParameterMap()�쑝濡� 異붿텧�븳 留� 媛앹껜�뒗 readonly �긽�깭�씠湲� �븣臾몄뿉
		// �궗�슜 媛��뒫�븯�룄濡� �깉濡쒖슫 留듭쓣 �깮�꽦�븯�뿬 媛믪쓣 蹂듭궗�븳�떎
		Map<String,Object> reqMap = (Map<String, Object>)request.getParameterMap();
		HashMap<String,Object> unlockedReqMap = new HashMap<String,Object>();
		HashMap<String,Object> resMap = new HashMap<String,Object>();
		
		// 媛� 蹂듭궗瑜� �쐞�븳 猷⑦봽
		for( String key : reqMap.keySet() ){
			unlockedReqMap.put(key, reqMap.get(key));
			log.info("{} , {}",key, reqMap.get(key));
        }
		
		try {
			resMap = personalHistoryServ.registerUser(unlockedReqMap);
		} catch (Exception e) {
			System.out.println("ERROR registerUser : " + e);
		}
		log.info("==============CONTROLLER RESMAP: {}",resMap);
		return resMap;
	}
	
	@Override
	@RequestMapping(value="/personalHistory/registerUserUpdate", method=RequestMethod.POST)
	public @ResponseBody HashMap<String,Object> registerUserUpdate(HttpServletRequest request) {
		log.info("******************registerUserUpdate********************");
		// getParameterMap()�쑝濡� 異붿텧�븳 留� 媛앹껜�뒗 readonly �긽�깭�씠湲� �븣臾몄뿉
		// �궗�슜 媛��뒫�븯�룄濡� �깉濡쒖슫 留듭쓣 �깮�꽦�븯�뿬 媛믪쓣 蹂듭궗�븳�떎
		Map<String,Object> reqMap = (Map<String, Object>)request.getParameterMap();
		HashMap<String,Object> unlockedReqMap = new HashMap<String,Object>();
		HashMap<String,Object> resMap = new HashMap<String,Object>();
		
		// 媛� 蹂듭궗瑜� �쐞�븳 猷⑦봽
		for( String key : reqMap.keySet() ){
			unlockedReqMap.put(key, reqMap.get(key));
        }
		
		try {
			personalHistoryServ.registerUserUpdate(unlockedReqMap);
			String userIdx = (String)unlockedReqMap.get("userIdx");
			resMap.put("userIdx",userIdx);
		} catch (Exception e) {
			System.out.println("ERROR registerUserUpdate : " + e);
		}
				
		
		return resMap;
	}
	
	/**
	 * �벑濡앸맂 �뜲�씠�꽣 媛��졇�삤湲�
	 * 
	 * map -> string,array strng�� 怨좎젙蹂��닔�쓽 媛믩뱾 key, val �삎�깭濡� 洹몃깷 諛쏄퀬
	 * �쑀�룞蹂��닔�뱾�� key �뀒�씠釉붾챸 : val array �삎�깭 
	 * @throws IOException 
	 * @throws JsonMappingException 
	 * @throws JsonParseException 
	 */
	@Override
	@RequestMapping(value="/personalHistory/getRegisterData", method=RequestMethod.POST)
	public @ResponseBody HashMap<String, Object> getRegisterData(HttpServletRequest request, HttpServletResponse response,Model model) throws JsonParseException, JsonMappingException, IOException {
		log.info("******************getRegisterData********************");
		Map<String,Object> reqMap = (Map<String, Object>)request.getParameterMap();
		HashMap<String, Object> resMap = personalHistoryServ.getRegisterData(reqMap);
		return resMap;
	}
	
	@Override
	@RequestMapping(value = "/personalHistory/imgInsert", method=RequestMethod.POST)
	@ResponseBody
	public int imgInsert(MultipartFile file, String userName, Image image) throws IllegalStateException, IOException {
		log.info("*******************/imgInsert************************");
		return personalHistoryServ.imgInsert(file,userName,image);
	}
	
	@Override
	@RequestMapping(value = "/personalHistory/imgUpdate", method=RequestMethod.POST)
	@ResponseBody
	public int imgUpdate(MultipartFile file, String userName,Image image) throws IllegalStateException, IOException {
		log.info("*******************/imgUpdate************************");
		return personalHistoryServ.imgUpdate(file,userName,image);
	}
	
	@RequestMapping(value = "/personalHistory/getUserImg/{userIdx}", method=RequestMethod.GET)
	@ResponseBody
	public Image getUserImg(@PathVariable Integer userIdx) {
		log.info("*******************/getUserImg************************");
		return personalHistoryServ.getUserImg(userIdx);
	}
	
	@RequestMapping(value = "/personalHistory/getUserCountByCareerDate", method=RequestMethod.GET)
	@ResponseBody
	public List<String> getUserCountByCareerDate(){
		return personalHistoryServ.getUserCountByCareerDate();
	}
	
	@RequestMapping(value="/personalHistory/downexcel.do", method=RequestMethod.POST)
	public @ResponseBody HashMap<String, Object> downExcel() throws JsonParseException, JsonMappingException, IOException {
		log.info("******************ExcelDown********************");
		HashMap<String, Object> resMap = personalHistoryServ.excelDownload();
		
		return resMap;
	}

	@Override
	public List<UserInfoEdu> School() throws Exception  {
		log.info("******************School********************");
		List<UserInfoEdu> resMap = personalHistoryServ.School();
		
		return personalHistoryServ.School();
	}

	@Override
	public List<UserInfoLicen> abc() throws Exception {
		log.info("******************abc********************");
		List<UserInfoLicen> resMap = personalHistoryServ.abc();
		
		return personalHistoryServ.abc();
	}

	@Override
	public List<UserInfoQualifi> certificate() throws Exception {
		log.info("******************certificate********************");
		List<UserInfoQualifi> resMap = personalHistoryServ.certificate();
		
		return personalHistoryServ.certificate();
	}

	@Override
	public List<UserInfoCareer> company() throws Exception {
		log.info("******************certificate********************");
		List<UserInfoCareer> resMap = personalHistoryServ.company();
		
		return personalHistoryServ.company();
	}

	@Override
	public List<UserInfoTraining> education() throws Exception {
		log.info("******************education********************");
		List<UserInfoTraining> resMap = personalHistoryServ.education();
		
		return personalHistoryServ.education();
	}

	@Override
	public List<UserInfoSkill> project() throws Exception {
		log.info("******************project********************");
		List<UserInfoSkill> resMap = personalHistoryServ.project();
		
		return personalHistoryServ.project();
	}

	@Override
	public List<Image> picture() throws Exception {
		log.info("******************picture********************");
		List<Image> resMap = personalHistoryServ.picture();
		
		return personalHistoryServ.picture();
	}


	@Override
	public int delete(int userIdx) throws Exception {
		log.info("******************delete********************");
		int resMap = personalHistoryServ.delete(userIdx);
		
		return personalHistoryServ.delete(userIdx);
	}

	@Override
	public List<UserInfoHobby> hhh() throws Exception {
		log.info("******************hobby********************");
		List<UserInfoHobby> resMap = personalHistoryServ.hhh();
		
		return personalHistoryServ.hhh();
	}

	

}
