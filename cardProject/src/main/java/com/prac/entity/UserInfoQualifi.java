package com.prac.entity;

import java.sql.Date;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties
public class UserInfoQualifi {
	private Integer qualifiIdx;
	private Integer userIdx;
	private String qualifiName;
	private Date qualifiGetdate;
	
	public Integer getQualifiIdx() {
		return qualifiIdx;
	}
	public void setQualifiIdx(Integer qualifiIdx) {
		this.qualifiIdx = qualifiIdx;
	}
	public Integer getUserIdx() {
		return userIdx;
	}
	public void setUserIdx(Integer userIdx) {
		this.userIdx = userIdx;
	}
	public String getQualifiName() {
		return qualifiName;
	}
	public void setQualifiName(String qualifiName) {
		this.qualifiName = qualifiName;
	}
	public Date getQualifiGetdate() {
		return qualifiGetdate;
	}
	public void setQualifiGetdate(Date qualifiGetdate) {
		this.qualifiGetdate = qualifiGetdate;
	}
	
	
}
