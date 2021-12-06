package com.prac.entity;



import java.sql.Date;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties
public class UserInfoEdu {
	private Integer eduIdx;
	private Integer userIdx;
	private String eduSchoolName;
	private String eduStatus;
	private String eduYear;
	private String eduMonth;
	private Date eduStart;
	private Date eduEnd;
	
	
	public Date getEduEnd() {
		return eduEnd;
	}
	public void setEduEnd(Date eduEnd) {
		this.eduEnd = eduEnd;
	}
	public Date getEduStart() {
		return eduStart;
	}
	public void setEduStart(Date eduStart) {
		this.eduStart = eduStart;
	}
	public Integer getEduIdx() {
		return eduIdx;
	}
	public void setEduIdx(Integer eduIdx) {
		this.eduIdx = eduIdx;
	}
	public Integer getUserIdx() {
		return userIdx;
	}
	public void setUserIdx(Integer userIdx) {
		this.userIdx = userIdx;
	}
	public String getEduSchoolName() {
		return eduSchoolName;
	}
	public void setEduSchoolName(String eduSchoolName) {
		this.eduSchoolName = eduSchoolName;
	}
	public String getEduStatus() {
		return eduStatus;
	}
	public void setEduStatus(String eduStatus) {
		this.eduStatus = eduStatus;
	}
	public String getEduYear() {
		return eduYear;
	}
	public void setEduYear(String eduYear) {
		this.eduYear = eduYear;
	}
	public String getEduMonth() {
		return eduMonth;
	}
	public void setEduMonth(String eduMonth) {
		this.eduMonth = eduMonth;
	}
	
}
