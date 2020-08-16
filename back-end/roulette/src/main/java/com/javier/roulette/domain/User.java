package com.javier.roulette.domain;

import java.util.UUID;

public class User {
	private String id;
	private Integer credit;
	public User(Integer credit) {
		this.id = UUID.randomUUID().toString();
		this.credit = credit;
	}
	public String getId() {
		return id;
	}
	public Integer getCredit() {
		return credit;
	}
	public void setCredit(Integer credit) {
		this.credit = credit;
	}
	
}
