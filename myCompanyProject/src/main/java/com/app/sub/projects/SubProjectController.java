package com.app.sub.projects;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SubProjectController {
	
	@Autowired
	private SubProjectService projectService;
	
	@RequestMapping("/projects/{id}/subProject")
	public List<SubProject> getAllProjects(@PathVariable int id){
		return projectService.getAllSubProjectForGivenProjId(id);
	}
	
	
	
	@RequestMapping("/projects/{id}/subProject/{subId}")
	public SubProject getSubProject(@PathVariable int id,@PathVariable int subId){
		return projectService.getSingleSubProjectDetails(id,subId);
	}
	
	@RequestMapping(method = RequestMethod.POST , value="/projects/{id}/subProject")
	public void getProject(@PathVariable int id,@RequestBody SubProject subProject){
		 projectService.addProject(id,subProject);
	}
	
	/*@RequestMapping(method = RequestMethod.PUT , value="/projects/{id}/subProject/{subId}")
	public void deleteProject(@PathVariable int id, @RequestBody SubProject subProject,@PathVariable int subId){
		 projectService.updatePoject(id,subProject,subId);
	}*/
	
	
	@RequestMapping(method = RequestMethod.DELETE , value="/projects/{id}/subProject/{subId}")
	public void deleteProject(@PathVariable int id,@RequestBody SubProject subProject,@PathVariable int subId){
		 projectService.delete(subId);
	}
	

}
