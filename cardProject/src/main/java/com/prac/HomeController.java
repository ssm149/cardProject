package com.prac;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.prac.entity.Image;
import com.prac.entity.UserInfo;
import com.prac.entity.UserInfoCareer;
import com.prac.entity.UserInfoEdu;
import com.prac.entity.UserInfoHobby;
import com.prac.entity.UserInfoLicen;
import com.prac.entity.UserInfoQualifi;
import com.prac.entity.UserInfoSkill;
import com.prac.entity.UserInfoTraining;
import com.prac.personalHistory.serv.PersonalHistoryServ;


/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	UserInfo userInfo;
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	private PersonalHistoryServ pserv;
	
	/**
	 * Simply selects the home view to render by returning its name.
	 * @throws Exception 
	 */
	//리스트 페이지
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String memberList(Locale locale, Model model) throws Exception {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		
		String formattedDate = dateFormat.format(date);
		System.out.println("formattedDate-----" + formattedDate);
		System.out.println("=====================List===========================");
		
		List<UserInfo> memInfoList = new ArrayList<UserInfo>();
		
		try {
			memInfoList = (List<UserInfo>)pserv.memList();
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("ERROR PersonalHistoryServImpl : " + e);
		}
		
		model.addAttribute("memList", memInfoList );
		model.addAttribute("serverTime", formattedDate );
		
		return "memberList";
	}
	
//	//회원가입 페이지
//	@RequestMapping(value = "/", method = RequestMethod.GET)
//	public String memberLogin(Locale locale, Model model, UserInfo userInfo) {
//		logger.info("Welcome home! The client locale is {}.", locale);
//		
//		Date date = new Date();
//		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
//		
//		
//		String formattedDate = dateFormat.format(date);
//		
//		
//		model.addAttribute("serverTime", formattedDate );
//		
//		//return "home";
//		return "memberLogin";
//	}
	
	
	
	@RequestMapping(value = "/home", method = {RequestMethod.GET, RequestMethod.POST})
	public String home(Locale locale, Model model, @RequestParam (value = "userIdx", required = false) String userIdx ) throws Exception {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		System.out.println("RequestMethod.POST");
		System.out.println("HomeController...userIdx =======> " + userIdx);
		
		List<UserInfoEdu> School = new ArrayList<UserInfoEdu>();
		List<UserInfoQualifi> certificate = new ArrayList<UserInfoQualifi>();
		List<UserInfoCareer> company = new ArrayList<UserInfoCareer>();
		List<UserInfoTraining> education = new ArrayList<UserInfoTraining>();
		List<UserInfoLicen> abc = new ArrayList<UserInfoLicen>();
		List<UserInfoSkill> project = new ArrayList<UserInfoSkill>();
		List<Image> picture = new ArrayList<Image>();
		List<UserInfoHobby> hhh = new ArrayList<UserInfoHobby>();

		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		model.addAttribute("userIdx", userIdx);
		model.addAttribute("School", School );
		model.addAttribute("certificate", certificate );
		model.addAttribute("company", company );
		model.addAttribute("education", education );
		model.addAttribute("abc", abc );
		model.addAttribute("project", project );
		model.addAttribute("picture", picture );
		model.addAttribute("hhh", hhh );
		
		
		return "home";
	}
	
	
	//삭제 
	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public String delete(Locale locale, Model model, @RequestParam (value = "userIdx", required = false) int userIdx ) throws Exception {
		logger.info("ssm....HomeController 삭제 진입부", locale);
		
		logger.info("ssm....HomeController userIdx====> " + userIdx);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		//int count = 
		pserv.delete(userIdx);
		//if(count=)
		String formattedDate = dateFormat.format(date);
		
		
		model.addAttribute("serverTime", formattedDate );
		
		//return "/";
		return "redirect:/";

	
	}
}
