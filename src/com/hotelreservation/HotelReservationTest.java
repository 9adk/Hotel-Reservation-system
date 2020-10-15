package com.hotelreservation;

import static org.junit.jupiter.api.Assertions.*;

import java.text.ParseException;

import org.junit.jupiter.api.Test;

class HotelReservationTest {

	/**
	 * Usecase1 for adding hotel's data
	 */
	@Test
	public void givenHotelData_WhenAddedToMap_ShouldPassResult() {
		HotelReservation hotel = new HotelReservation();
		hotel.add("Lakewood", 110);
		hotel.add("Bridgewood", 150);
		hotel.add("Ridgewood", 220);
		hotel.printHotels();
		int result = hotel.size();
		assertEquals(3, result);
	}

	/**
	 * Usecase3 for weekend and weekday rates
	 */
	@Test
	public void givenHotelDatawithWeekDayRates_WhenAddedToMap_ShouldPassResult() {
		HotelReservation hotel = new HotelReservation();
		hotel.add("Lakewood", 110, 90);
		hotel.add("Bridgewood", 150, 50);
		hotel.add("Ridgewood", 220, 150);
		hotel.printHotels();
		int result = hotel.size();
		assertEquals(3, result);
	}

	/**
	 * Usecase2 for finding cheapest hotel, Modified for weekend rates
	 */
	@Test
	public void givenHotelData_WhenAddedToMap_ShouldReturnCheapestHotel() {
		HotelReservation hotel = new HotelReservation();
		hotel.add("Lakewood", 110, 90);
		hotel.add("Bridgewood", 150, 50);
		hotel.add("Ridgewood", 220, 150);
		hotel.printHotels();
		String result = "";
		try {
			result = hotel.cheapestHotel("10Sep2020", "11Sep2020");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		assertEquals("Lakewood", result);
	}

	/**
	 * Usecase2 for finding cheapest hotel, Modified for weekend rates
	 */
	@Test
	public void givenNewHotelData_WhenAddedToMap_ShouldReturnCheapestHotel() {
		HotelReservation hotel = new HotelReservation();
		hotel.add("Lakewood", 330, 120);
		hotel.add("Bridgewood", 160, 60);
		hotel.add("Ridgewood", 440, 180);
		hotel.printHotels();
		String result = "";
		try {
			result = hotel.cheapestHotel("08Sep2020", "11Sep2020");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		assertEquals("Bridgewood", result);
	}

}
