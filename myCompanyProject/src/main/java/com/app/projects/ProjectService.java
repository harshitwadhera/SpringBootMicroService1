package com.app.projects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {
	
	@Autowired
	private ProjectRepository projectRepos;
	
	private List<Project>  projectAll = new ArrayList<>(Arrays.asList(new Project(1, "TilesWork", "Full Tiles work has been done by US", new Date()),
			new Project(2, "Wooden", "Full Wooden work has been done by US in less time", new Date()),
			new Project(3, "GlassWork", "Full Glass on building work has been done by US", new Date())));

	public List<Project> getAllProjectDetails() {
		// TODO Auto-generated method stub
		//return projectAll;
		return  (List<Project>) projectRepos.findAll();
	}

	public Project getProjectDetails(int id) {
		// TODO Auto-generated method stub
		//return projectAll.stream().filter(p -> p.getProjectId() == id).findFirst().get(); //(id )
		Optional<Project> project = projectRepos.findById(id);
		return project.get();
	}

	public void addProject(Project project) {
	// projectAll.add(project);
		projectRepos.save(project);//.add(project);
		
	}

	public void delete(int id) {
		// TODO Auto-generated method stub
		//projectAll.removeIf(p -> p.getProjectId() == id);
		projectRepos.deleteById(id);
	}

	public void updatePoject(int id, Project projectNew) {
		// TODO Auto-generated method stub
		//Project projectOld =  projectAll.stream().filter(p -> p.getProjectId() == id).findFirst().get(); //(id )
		//projectAll.set(projectAll.indexOf(projectOld), project);
		Project projectOld = projectRepos.findById(id).get();
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

}
