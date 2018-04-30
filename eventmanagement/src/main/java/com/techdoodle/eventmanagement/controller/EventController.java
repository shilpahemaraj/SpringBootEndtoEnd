package com.techdoodle.eventmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.techdoodle.eventmanagement.entities.Event;
import com.techdoodle.eventmanagement.repos.EventRepository;

@Controller
public class EventController {

	@Autowired
	private EventRepository eventRepository;

	@RequestMapping("/findEvents")
	public String findEvents(@RequestParam("eventCity") String city, ModelMap modelMap) {
		List<Event> listOfEvents = eventRepository.findByCity(city);
		modelMap.addAttribute("listOfEvents", listOfEvents);
		return "displayEvents";

	}
	@RequestMapping("admin/showAddEvent")
	public String addEvent() {
		return "addEvent";
		
	}

}
