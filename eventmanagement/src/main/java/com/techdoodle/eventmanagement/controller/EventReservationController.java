package com.techdoodle.eventmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.techdoodle.eventmanagement.dto.ReservationRequest;
import com.techdoodle.eventmanagement.entities.Event;
import com.techdoodle.eventmanagement.entities.Reservation;
import com.techdoodle.eventmanagement.repos.EventRepository;
import com.techdoodle.eventmanagement.service.ReservationServiceImpl;

@Controller
public class EventReservationController {

	@Autowired
	private EventRepository eventRepository;

	@Autowired
	private ReservationServiceImpl reservationServiceImpl;

	@RequestMapping("/showCompleteReservation")
	public String showCompleteReservation(@RequestParam("eventId") Long eventId, ModelMap modelMap) {
		Event event = eventRepository.findOne(eventId);
		modelMap.addAttribute("eventDetails", event);
		return "eventReservation";

	}

	@RequestMapping("/completeReservation")
	public String confirmReservation(ReservationRequest reservationRequest, ModelMap modelMap) {
		Reservation reservation = reservationServiceImpl.savedReservation(reservationRequest);
		modelMap.addAttribute("msg",
				"Reserved!! Please save the confirmation number to checkin. Your confirmation number is "
						+ reservation.getReservationId());
		return "confirmation";
	}

}
