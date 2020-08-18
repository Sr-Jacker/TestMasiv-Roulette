package com.masiv.roulette.documents;

import java.io.Serializable;
import java.util.UUID;
import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.mongodb.lang.NonNull;

@Document(collection = "Roulette")
public class Roulette implements Serializable{
	@Id
	@NonNull
	private String id;
	private Boolean state;
	private List<Bet> bets;
	public Roulette() {
		this.id=UUID.randomUUID().toString();
		this.bets=new ArrayList<Bet>();
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Boolean getState() {
		return state;
	}
	public void setState(Boolean state) {
		this.state = state;
	}
	public List<Bet> getBets() {
		return bets;
	}
	public void setBet(List<Bet> bet) {
		this.bets = bets;
	}
}
