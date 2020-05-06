package com.app.sub.projects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.projects.Project;

@Service
public class SubProjectService {
	
	@Autowired
	private SubProjectRepository projectRepos;
	
	

	public List<SubProject> getAllSubProjectForGivenProjId(int id) {
		// TODO Auto-generated method stub
		//return projectAll;
		//Project project = new Project();project.setProjectId(id);
		return  (List<SubProject>) projectRepos.findByProjectProjectId(id);
	}

	public SubProject getSingleSubProjectDetails(int id, int subId) {
		// TODO Auto-generated method stub
		//return projectAll.stream().filter(p -> p.getProjectId() == id).findFirst().get(); //(id )
		Optional<SubProject> project = projectRepos.findById(subId);
		return project.get();
	}

	public void addProject(int id, SubProject subProject) {
	// projectAll.add(project);
		subProject.setProject(new Project(id,"","",null));
		projectRepos.save(subProject);//.add(project);
		
	}

	public void delete(int id) {
		// TODO Auto-generated method stub
		//projectAll.removeIf(p -> p.getProjectId() == id);
		projectRepos.deleteById(id);
	}

	/*public void updatePoject(int id, subProject projectNew) {
		// TODO Auto-generated method stub
		//Project projectOld =  projectAll.stream().filter(p -> p.getProjectId() == id).findFirst().get(); //(id )
		//projectAll.set(projectAll.indexOf(projectOld), project);
		subProject projectOld = projectRepos.findById(id).get();
		projectNew.setProjectId(projectOld.getProjectId());
		if(projectNew.getProjectName() != null && !projectNew.getProjectName().equals("")){
			projectOld.setProjectName(projectNew.getProjectName());
		}
		if(projectNew.getProjectDesc() != null && !projectNew.getProjectDesc().equals("")){
			projectOld.setProjectDesc(projectNew.getProjectDesc());
		}
		if(projectNew.getProjectCompletion() != null ){
			projectOld.setProjectCompletion(projectNew.getProjectCompletion());
		}
		projectRepos.save(projectOld);
	}
*/
}
