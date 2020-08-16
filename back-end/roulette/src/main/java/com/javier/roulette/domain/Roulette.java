package com.javier.roulette.domain;

import java.util.UUID;

public class Roulette {
	private String id;
	private Boolean state;
	public Roulette(Boolean state) {
		this.id = UUID.randomUUID().toString();
		this.state = state;
	}
	public String getId() {
		return id;
	}
	public Boolean getState() {
		return state;
	}
	public void setState(Boolean state) {
		this.state = state;
	}
	
}
