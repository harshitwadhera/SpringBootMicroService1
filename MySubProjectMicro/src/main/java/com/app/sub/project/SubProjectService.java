package com.app.sub.project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class SubProjectService {

	public SubProject getAllSubProjectForGivenProjId(int id) {
		// TODO Auto-generated method stub
		SubProject subProjObj = new SubProject();
		subProjObj.setSubId(1);
		subProjObj.setSubProjectName("My MicroService Data");
		subProjObj.setSubProjectDesc("Success data");
		subProjObj.setSubProjectCompletion(new Date());
		return subProjObj;
	}
	
	
	
	

	

	
}
