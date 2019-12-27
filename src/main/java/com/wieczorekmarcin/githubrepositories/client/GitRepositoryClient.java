package com.wieczorekmarcin.githubrepositories.client;

import com.wieczorekmarcin.githubrepositories.model.GitRepository;

import java.util.List;

public interface GitRepositoryClient {
	List<GitRepository> getRepositoriesByOwner(String owner);
	GitRepository getRepositoryByOwnerAndRepositoryName(String owner, String repostoryName) ;
}
