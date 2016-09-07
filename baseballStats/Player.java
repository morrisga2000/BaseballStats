package com.baseballStats;

public class Player extends Baseball{
	public String name = null;
	public float battingAverage = 0.0f;
	public float sluggingAverage = 0.0f;
	public float totAtBases =0;
	public float totalHits = 0;
	public float totalAtBats=0;

	

	
	public Player(String name, float battingAverage, float sluggingAverage, float totAtBases, float totalHits,
			float totalAtBats) {
		super();
		this.name = name;
		this.battingAverage = battingAverage;
		this.sluggingAverage = sluggingAverage;
		this.totAtBases = totAtBases;
		this.totalHits = totalHits;
		this.totalAtBats = totalAtBats;
	}
	
	
	public Player() {
		super();
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getBattingAverage() {
		return battingAverage;
	}
	public void setBattingAverage(float battingAverage) {
		this.battingAverage = battingAverage;
	}
	public float getSluggingAverage() {
		return sluggingAverage;
	}
	public void setSluggingAverage(float sluggingAverage) {
		this.sluggingAverage = sluggingAverage;
	}
	public float getTotAtBases() {
		return totAtBases;
	}
	public void setTotAtBases(float totAtBases) {
		this.totAtBases = totAtBases;
	}
	public float getTotalHits() {
		return totalHits;
	}
	public void setTotalHits(float totalHits) {
		this.totalHits = totalHits;
	}
	public float getTotalAtBats() {
		return totalAtBats;
	}
	public void setTotalAtBats(float totalAtBats) {
		this.totalAtBats = totalAtBats;
	}
	@Override
	public String toString() {
		return "Player [name=" + name + ", battingAverage=" + battingAverage + ", sluggingAverage=" + sluggingAverage
				+ "]";
	}

	
	
}  // end of class
