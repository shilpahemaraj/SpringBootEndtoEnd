package com.techdoodle.eventmanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.techdoodle.eventmanagement.dto.ReservationRequest;
import com.techdoodle.eventmanagement.entities.Attendee;
import com.techdoodle.eventmanagement.entities.Reservation;
import com.techdoodle.eventmanagement.repos.AttendeeRepository;
import com.techdoodle.eventmanagement.repos.EventRepository;
import com.techdoodle.eventmanagement.repos.ReservationRepository;

@Service
public class ReservationServiceImpl implements ReservationService {
	@Autowired
	private AttendeeRepository attendeeRepository;
	@Autowired
	private EventRepository eventRepository;
	@Autowired
	private ReservationRepository reservationRepository;

	@Transactional
	public Reservation savedReservation(ReservationRequest reservationRequest) {

		Attendee attendee = new Attendee();

		attendee.setFirstName(reservationRequest.getAttendeeFirstName());
		attendee.setMiddleName(reservationRequest.getAttendeeMiddleName());
		attendee.setLastName(reservationRequest.getAttendeeLastName());
		attendee.setEmail(reservationRequest.getAttendeeEmail());
		attendee.setPhone(reservationRequest.getAttendeePhone());
		Attendee savedAttendee = attendeeRepository.save(attendee);

		Reservation reservation = new Reservation();
		reservation.setEvent(eventRepository.findOne(Long.parseLong(reservationRequest.getEventId())));
		reservation.setCheckedIn(0);
		reservation.setAttendee(savedAttendee);
		reservation.setNoOfGuests(reservationRequest.getNoOfGuests());

		Reservation savedReservation = reservationRepository.save(reservation);
		return savedReservation;
	}

}
