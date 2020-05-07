package com.app.sub.project;

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
	public SubProject getAllProjects(@PathVariable int id){
		return projectService.getAllSubProjectForGivenProjId(id);
	}
	
	
	
	

}
