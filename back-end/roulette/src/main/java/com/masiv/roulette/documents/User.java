package com.masiv.roulette.documents;

import java.util.UUID;

import org.springframework.data.annotation.Id;

import com.mongodb.lang.NonNull;

public class User {
	@Id
	@NonNull
	private String id;
	private Integer credit;
	public User() {
		this.id=UUID.randomUUID().toString();
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Integer getCredit() {
		return credit;
	}
	public void setCredit(Integer credit) {
		this.credit = credit;
	}
}
