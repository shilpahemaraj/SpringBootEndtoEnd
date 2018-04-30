package com.techdoodle.eventcheckin.integration;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.techdoodle.eventcheckin.dto.Reservation;
import com.techdoodle.eventcheckin.dto.ReservationUpdateRequest;

@Component
public class ReservationRestClientImpl implements ReservationRestClient {
	private static final String RESERVATION_REST_URL = "http://localhost:8080/reservation/";

	@Override
	public Reservation findByReservationId(Long id) {
		RestTemplate restTemplate = new RestTemplate();
		Reservation reservation = restTemplate.getForObject(RESERVATION_REST_URL + id, Reservation.class);
		return reservation;
	}

	@Override
	public Reservation updateEventReservation(ReservationUpdateRequest reservationUpdateRequest) {
		RestTemplate restTemplate = new RestTemplate();

		Reservation reservation = restTemplate.postForObject(RESERVATION_REST_URL, reservationUpdateRequest,
				Reservation.class);
		return reservation;
	}

	/*
	 * @Override public Reservation updateEventReservation(ReservationUpdateRequest
	 * request) { RestTemplate restTemplate = new RestTemplate(); Reservation
	 * reservation = restTemplate.postForObject(RESERVATION_REST_URL, request,
	 * Reservation.class); return reservation; }
	 */

}
