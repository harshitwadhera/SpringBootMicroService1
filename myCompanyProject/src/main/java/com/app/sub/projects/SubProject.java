package com.app.sub.projects;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

import com.app.projects.Project;

@Entity
public class SubProject {
	
	public SubProject() {
		
	}
	public SubProject(int subId, String subProjectName, String subProjectDesc, Date subProjectCompletion,int projectId) {
		//super();
		this.subId = subId;
		this.subProjectName = subProjectName;
		this.subProjectDesc = subProjectDesc;
		this.subProjectCompletion = subProjectCompletion;
		this.project = new Project(projectId,"","",null);
	}
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "GeneratorName")
	@SequenceGenerator(name="GeneratorName", sequenceName = "seqSubProj")
    @Column(name="subId")
	private int subId;
	private String subProjectName;
	private String subProjectDesc;
	private Date subProjectCompletion;
	
	@ManyToOne
	private Project project;
	
	
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
	public Project getProject() {
		return project;
	}
	public void setProject(Project project) {
		this.project = project;
	}

}
