package com.wieczorekmarcin.githubrepositories.client;

import com.wieczorekmarcin.githubrepositories.model.GitRepository;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Component
public class GitRepositoryClientImpl implements GitRepositoryClient {

	private String baseApiUrl = "https://api.github.com/";

	public List<GitRepository> getRepositoriesByOwner(String owner) {
		RestTemplate restTemplate = new RestTemplate();
		GitRepository[] repositoryTab = restTemplate.getForObject(baseApiUrl + "users/" + owner + "/repos", GitRepository[].class);
		List<GitRepository> repositories = Arrays.asList(repositoryTab);
		return repositories;
	}

	public GitRepository getRepositoryByOwnerAndRepositoryName(String owner, String repostoryName) {
		RestTemplate restTemplate = new RestTemplate();
		GitRepository repository = restTemplate.getForObject(baseApiUrl + "repos/" + owner + "/" + repostoryName, GitRepository.class);
		return repository;
	}
}