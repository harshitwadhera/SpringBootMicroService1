package com.app.projects;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import com.app.sub.projects.SubProject;

@RestController
public class ProjectController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private ProjectService projectService;
	
	@Autowired
	private WebClient.Builder webClientBuilder;
	
	@RequestMapping("/projects")
	public List<Project> getAllProjects(){
		return projectService.getAllProjectDetails();
	}
	
	@RequestMapping("/projectDataMicro/{id}")
	public SubProject getAllProjects1(@PathVariable int id){
		//SubProject myObj= restTemplate.getForObject("http://localhost:8081/projects/"+id+"/subProject", SubProject.class);
		
		SubProject myObj= webClientBuilder.build().get()
		.uri("http://localhost:8081/projects/"+id+"/subProject")
		.retrieve()
		.bodyToMono(SubProject.class).block();
		
		return myObj;
	}
	
	@RequestMapping("/projects/{id}")
	public Project getProject(@PathVariable int id){
		return projectService.getProjectDetails(id);
	}
	
	@RequestMapping(method = RequestMethod.POST , value="/project")
	public void getProject(@RequestBody Project project){
		 projectService.addProject(project);
	}
	
	@RequestMapping(method = RequestMethod.PUT , value="/project/{id}")
	public void deleteProject(@PathVariable int id, @RequestBody Project project){
		 projectService.updatePoject(id,project);
	}
	
	
	@RequestMapping(method = RequestMethod.DELETE , value="/project/{id}")
	public void deleteProject(@PathVariable int id){
		 projectService.delete(id);
	}
	

}
