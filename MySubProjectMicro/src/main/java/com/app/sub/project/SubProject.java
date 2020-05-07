package com.app.sub.project;

import java.util.Date;


public class SubProject {
	
	public SubProject() {
		
	}
	public SubProject(int subId, String subProjectName, String subProjectDesc, Date subProjectCompletion) {
		//super();
		this.subId = subId;
		this.subProjectName = subProjectName;
		this.subProjectDesc = subProjectDesc;
		this.subProjectCompletion = subProjectCompletion;
		
	}
	
	private int subId;
	private String subProjectName;
	private String subProjectDesc;
	private Date subProjectCompletion;
	

	
	public int getSubId() {
		return subId;
	}
	public void setSubId(int subId) {
		this.subId = subId;
	}
	
	public String getSubProjectName() {
		return subProjectName;
	}
	public void setSubProjectName(String subProjectName) {
		this.subProjectName = subProjectName;
	}
	public String getSubProjectDesc() {
		return subProjectDesc;
	}
	public void setSubProjectDesc(String subProjectDesc) {
		this.subProjectDesc = subProjectDesc;
	}
	public Date getSubProjectCompletion() {
		return subProjectCompletion;
	}
	public void setSubProjectCompletion(Date subProjectCompletion) {
		this.subProjectCompletion = subProjectCompletion;
	}


}
