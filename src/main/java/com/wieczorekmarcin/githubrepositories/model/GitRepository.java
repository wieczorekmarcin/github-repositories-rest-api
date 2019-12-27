package com.wieczorekmarcin.githubrepositories.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class GitRepository {
	private String fullName;
	private String description;
	private String cloneUrl;
	private long stars;
	private Date createdAt;

	@JsonProperty("fullName")
	public String getFullName() {
		return fullName;
	}

	@JsonProperty("full_name")
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@JsonProperty("cloneUrl")
	public String getCloneUrl() {
		return cloneUrl;
	}

	@JsonProperty("clone_url")
	public void setCloneUrl(String cloneUrl) {
		this.cloneUrl = cloneUrl;
	}

	@JsonProperty("stars")
	public long getStars() {
		return stars;
	}

	@JsonProperty("stargazers_count")
	public void setStars(long stars) {
		this.stars = stars;
	}

	@JsonProperty("createdAt")
	public Date getCreatedAt() {
		return createdAt;
	}

	@JsonProperty("created_at")
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
}
