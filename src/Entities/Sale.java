package Entities;

import java.util.Date;

import Abstract.Entity;

public class Sale implements Entity {

	int id;
	int customerId;
	int gameId;
	int campaignId;
	Date date;
	
	public Sale() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public int getGameId() {
		return gameId;
	}

	public void setGameId(int gameId) {
		this.gameId = gameId;
	}

	public int getCampaignId() {
		return campaignId;
	}

	public void setCampaignId(int campaignId) {
		this.campaignId = campaignId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(java.util.Date date) {
		this.date =(Date) date;
	}
	
	
}
