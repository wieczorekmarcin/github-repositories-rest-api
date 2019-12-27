package com.wieczorekmarcin.githubrepositories.service;

import com.wieczorekmarcin.githubrepositories.client.GitRepositoryClient;
import com.wieczorekmarcin.githubrepositories.model.GitRepository;
import com.weddini.throttling.Throttling;
import com.weddini.throttling.ThrottlingType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GitRepositoryServiceImpl implements GitRepositoryService {

	@Autowired
	GitRepositoryClient client;

	@Throttling(type = ThrottlingType.RemoteAddr, limit = 1)
	public List<GitRepository> findRepositoriesByOwner(String owner) {
		return client.getRepositoriesByOwner(owner);
	}

	@Throttling(type = ThrottlingType.RemoteAddr, limit = 1)
	public GitRepository findRepositoryByOwnerAndRepositoryName(String owner, String repositoryName) {
		return client.getRepositoryByOwnerAndRepositoryName(owner, repositoryName);
	}
}
