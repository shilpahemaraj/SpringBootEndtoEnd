package com.techdoodle.eventmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techdoodle.eventmanagement.dto.ReservationUpdateRequest;
import com.techdoodle.eventmanagement.entities.Reservation;
import com.techdoodle.eventmanagement.repos.ReservationRepository;

@RestController
public class EventManagementRestController {

	@Autowired
	private ReservationRepository reservationRepository;

	@RequestMapping("/reservation/{id}")
	public Reservation findByReservationId(@PathVariable("id") Long id) {
		return reservationRepository.findOne(id);
	}

	@RequestMapping("/reservation")
	public Reservation updateEventReservation(@RequestBody ReservationUpdateRequest updateRequest) {
		Reservation reservation = reservationRepository.findOne(updateRequest.getReservationId());
		reservation.setCheckedIn(updateRequest.getCheckedIn());
		reservation.setNoOfGuests(updateRequest.getNoOfGuests());
		Reservation savedReservation = reservationRepository.save(reservation);
		return savedReservation;

	}

}
