package com.wieczorekmarcin.githubrepositories.service;

import com.wieczorekmarcin.githubrepositories.model.GitRepository;

import java.util.List;

public interface GitRepositoryService {
	List<GitRepository> findRepositoriesByOwner(String owner);
	GitRepository findRepositoryByOwnerAndRepositoryName(String owner, String repostoryName);
}
