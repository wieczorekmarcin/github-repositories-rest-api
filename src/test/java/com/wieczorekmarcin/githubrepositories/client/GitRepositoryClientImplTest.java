package com.wieczorekmarcin.githubrepositories.client;

import com.wieczorekmarcin.githubrepositories.model.GitRepository;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GitRepositoryClientImplTest {


	@Test
	public void whenFindRepByOwner_thenReturnTrueIfSizeMatch() {
		// given
		GitRepositoryClient client = new GitRepositoryClientImpl();
		String owner = "wieczorekmarcin";

		// when
		List<GitRepository> repositories = client.getRepositoriesByOwner(owner);

		// then
		assertTrue( repositories.size() > 10);
	}

	@Test
	public void whenFindRepByOwnerAndRepoName_thenReturnTrueIfCloneUrlMatch() {
		// given
		GitRepositoryClient client = new GitRepositoryClientImpl();

		GitRepository existingRepository = new GitRepository();
		existingRepository.setCloneUrl("https://github.com/wieczorekmarcin/ffr-api.git");

		String owner = "wieczorekmarcin";
		String repositoryName = "ffr-api";

		// when
		GitRepository repository = client.getRepositoryByOwnerAndRepositoryName(owner, repositoryName);

		// then
		assertTrue(repository.getCloneUrl().equals(existingRepository.getCloneUrl()));
	}
}