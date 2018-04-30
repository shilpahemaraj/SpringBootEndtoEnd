package com.techdoodle.eventcheckin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.techdoodle.eventcheckin.dto.Reservation;
import com.techdoodle.eventcheckin.dto.ReservationUpdateRequest;
import com.techdoodle.eventcheckin.integration.ReservationRestClientImpl;

@Controller
public class EventCheckInRestController {
	@Autowired
	ReservationRestClientImpl restClient;

	@RequestMapping("/showStartCheckin")
	public String showStartCheckin() {
		return "startCheckIn";

	}

	@RequestMapping("/startCheckIn")
	public String startCheckIn(@RequestParam("reservationId") Long reservationId, ModelMap modelMap) {
		Reservation reservation = restClient.findByReservationId(reservationId);
		modelMap.addAttribute("reservation", reservation);
		return "displayReservationDetails";

	}

	@RequestMapping("/completeCheckIn")
	public String completeEventCheckIn(@RequestParam("reservationId") Long reservationId,
			@RequestParam("reservationId") String reservationIdString, @RequestParam("noOfGuests") Long noOfGuests) {
		ReservationUpdateRequest reservationUpdateRequest = new ReservationUpdateRequest();
		reservationUpdateRequest.setCheckedIn(1);
		reservationUpdateRequest.setNoOfGuests(String.valueOf(noOfGuests));
		reservationUpdateRequest.setReservationId(reservationId);
		restClient.updateEventReservation(reservationUpdateRequest);
		return "checkInConfirmation";

	}
}
