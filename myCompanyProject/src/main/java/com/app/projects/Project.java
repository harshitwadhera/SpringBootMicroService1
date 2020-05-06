package com.app.projects;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Project {
	
	public Project() {
		
	}
	public Project(int projectId, String projectName, String projectDesc, Date projectCompletion) {
		//super();
		this.projectId = projectId;
		this.projectName = projectName;
		this.projectDesc = projectDesc;
		this.projectCompletion = projectCompletion;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "GeneratorName")
	@SequenceGenerator(name="GeneratorName", sequenceName = "seqProj")
    @Column(name="id")
	private int projectId;
	private String projectName;
	private String projectDesc;
	private Date projectCompletion;
	
	public int getProjectId() {
		return projectId;
	}
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getProjectDesc() {
		return projectDesc;
	}
	public void setProjectDesc(String projectDesc) {
		this.projectDesc = projectDesc;
	}
	public Date getProjectCompletion() {
		return projectCompletion;
	}
	public void setProjectCompletion(Date projectCompletion) {
		this.projectCompletion = projectCompletion;
	}

}
