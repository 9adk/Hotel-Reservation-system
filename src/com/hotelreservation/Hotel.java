package com.hotelreservation;

import java.time.DayOfWeek;

public class Hotel {
	private String hotelName;
	private int regularWD;
	private int regularWE;
	
	public Hotel(String hotelName, int regularWD) {
		this.hotelName = hotelName;
		this.regularWD = regularWD;
	}

	public Hotel(String hotelName, int regularWD, int regularWE) {
		this.hotelName = hotelName;
		this.regularWD = regularWD;
		this.regularWE = regularWE;

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

	public int findDay(String day) {
		return DayOfWeek.valueOf(day.toUpperCase()).getValue();
	}

	public int calculateRent(String type, String finalDay) {
		if (type.equals("Regular") && (1 <= findDay(finalDay) && findDay(finalDay) <= 5)) {
			return regularWD;
		}
		return 0;
	}
}
