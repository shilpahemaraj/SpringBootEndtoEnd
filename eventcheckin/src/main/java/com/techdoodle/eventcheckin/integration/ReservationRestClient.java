package com.techdoodle.eventcheckin.integration;

import com.techdoodle.eventcheckin.dto.Reservation;
import com.techdoodle.eventcheckin.dto.ReservationUpdateRequest;

public interface ReservationRestClient {

	public Reservation findByReservationId(Long id);

	public Reservation updateEventReservation(ReservationUpdateRequest reservationUpdateRequest);

}
