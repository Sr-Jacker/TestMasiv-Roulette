package com.masiv.roulette.documents;

import java.util.UUID;

import org.springframework.data.annotation.Id;

import com.mongodb.lang.NonNull;

public class Bet {
	@Id
	@NonNull
	private String id;
	private String numberBet;
	private String colorBet;
	private Integer moneyBet;
	private User user;
	public Bet(String numberBet, String colorBet, Integer moneyBet) {
		this.id=UUID.randomUUID().toString();
		this.numberBet = numberBet;
		this.colorBet = colorBet;
		this.moneyBet = moneyBet;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNumberBet() {
		return numberBet;
	}
	public void setNumberBet(String numberBet) {
		this.numberBet = numberBet;
	}
	public String getColorBet() {
		return colorBet;
	}
	public void setColorBet(String colorBet) {
		this.colorBet = colorBet;
	}
	public Integer getMoneyBet() {
		return moneyBet;
	}
	public void setMoneyBet(Integer moneyBet) {
		this.moneyBet = moneyBet;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
}
