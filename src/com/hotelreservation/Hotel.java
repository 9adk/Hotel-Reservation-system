package com.hotelreservation;

import java.time.DayOfWeek;

public class Hotel {
	private String hotelName;
	private int regularWD;
	private int regularWE;
	private int ratings;
	private int rewardsWD;
	private int rewardsWE;

	public int getRewardsWD() {
		return rewardsWD;
	}

	public void setRewardsWD(int rewardsWD) {
		this.rewardsWD = rewardsWD;
	}

	public int getRewardsWE() {
		return rewardsWE;
	}

	public void setRewardsWE(int rewardsWE) {
		this.rewardsWE = rewardsWE;
	}

	public Hotel(String hotelName, int regularWD) {
		this.hotelName = hotelName;
		this.regularWD = regularWD;
	}

	public Hotel(String hotelName, int regularWD, int regularWE) {
		this.hotelName = hotelName;
		this.regularWD = regularWD;
		this.regularWE = regularWE;

	}

	public Hotel(String hotelName, int regularWD, int regularWE, int ratings) {
		this.hotelName = hotelName;
		this.regularWD = regularWD;
		this.regularWE = regularWE;
		this.ratings = ratings;

	}

	public Hotel(String hotelName, int regularWD, int regularWE, int ratings, int rewardsWD, int rewardsWE) {
		this.hotelName = hotelName;
		this.regularWD = regularWD;
		this.regularWE = regularWE;
		this.ratings = ratings;
		this.rewardsWD = rewardsWD;
		this.rewardsWE = rewardsWE;

	}

	public int getRatings() {
		return ratings;
	}

	public void setRatings(int ratings) {
		this.ratings = ratings;
	}

	public int getRegularWE() {
		return regularWE;
	}

	public void setRegularWE(int regularWE) {
		this.regularWE = regularWE;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public int getRegularWD() {
		return regularWD;
	}

	public void setRegularWD(int regularWD) {
		this.regularWD = regularWD;
	}

	public int calculateRent(String type, String day) {
		if (type.equals("Regular") && day.equals("Weekday")) {
			return regularWD;
		} else if (type.equals("Regular") && day.equals("Weekend")) {
			return regularWE;
		} else if (type.equals("Reward") && day.equals("Weekday")) {
			return rewardsWD;
		} else if (type.equals("Reward") && day.equals("Weekend")) {
			return rewardsWE;
		}
		return 0;
	}
}
