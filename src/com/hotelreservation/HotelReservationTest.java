package com.hotelreservation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HotelReservationTest {

	/**
	 * Usecase1 for adding hotel's data
	 */
	@Test
	public void givenHotelData_WhenAddedToMap_ShouldPassResult() {
		HotelReservation hotel = new HotelReservation();
		hotel.add("Lakewood",110);
		hotel.add("BridgeWood",160);
		hotel.add("RidgeWood",220);
		hotel.printHotels();
		int result = hotel.size();
		assertEquals(3, result);
	}

}
