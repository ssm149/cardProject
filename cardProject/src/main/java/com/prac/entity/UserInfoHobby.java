package com.prac.entity;

import java.sql.Date;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties
public class UserInfoHobby {
	private Integer hobbyIdx;
	private Integer userIdx;
	private String hobbyName;
	private Date hobbyDate;
	
	
	
	public Integer getHobbyIdx() {
		return hobbyIdx;
	}
	public void setHobbyIdx(Integer hobbyIdx) {
		this.hobbyIdx = hobbyIdx;
	}
	public Integer getUserIdx() {
		return userIdx;
	}
	public void setUserIdx(Integer userIdx) {
		this.userIdx = userIdx;
	}
	public String getHobbyName() {
		return hobbyName;
	}
	public void setHobbyName(String hobbyName) {
		this.hobbyName = hobbyName;
	}
	public Date getHobbyDate() {
		return hobbyDate;
	}
	public void setHobbyDate(Date hobbyDate) {
		this.hobbyDate = hobbyDate;
	}
	
	
	
	
	
}
