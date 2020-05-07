package com.app.sub.project;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubProjectRepository extends CrudRepository<SubProject, Integer> {
	
	public List<SubProject> findByProjectProjectId(int projectId);

}
