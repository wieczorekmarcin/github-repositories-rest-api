package com.wieczorekmarcin.githubrepositories.controller;

import com.wieczorekmarcin.githubrepositories.model.GitRepository;
import com.wieczorekmarcin.githubrepositories.service.GitRepositoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GitRepositoryController {

	@Autowired
	GitRepositoryService repositoryService;

	@RequestMapping(path = "/repositories/{owner}", method = RequestMethod.GET)
	public List<GitRepository> getRepositoriesByOwner(@PathVariable("owner") String owner) {
		return repositoryService.findRepositoriesByOwner(owner);
	}

	@RequestMapping(path = "/repositories/{owner}/{repository-name}", method = RequestMethod.GET)
	public GitRepository getRepositoryByOwnerAndRepositoryName(@PathVariable("owner") String owner, @PathVariable("repository-name") String repositoryName) {
		return repositoryService.findRepositoryByOwnerAndRepositoryName(owner, repositoryName);
	}
}
