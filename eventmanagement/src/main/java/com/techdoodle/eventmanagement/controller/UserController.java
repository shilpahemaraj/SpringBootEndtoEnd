package com.techdoodle.eventmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.techdoodle.eventmanagement.entities.User;
import com.techdoodle.eventmanagement.repos.UserRepository;
import com.techdoodle.eventmanagement.service.SecurityService;

@Controller
public class UserController {
	@Autowired
	private UserRepository userRepository;

	@Autowired
	private BCryptPasswordEncoder encoder;

	@Autowired
	private SecurityService securityservice;

	@RequestMapping("/")
	public String getUserDetails() {
		return "login/registerUser";

	}

	@RequestMapping(value = "/registerUser", method = RequestMethod.POST)
	public String registerUserDetails(@ModelAttribute("user") User user) {
		user.setPassword(encoder.encode(user.getPassword()));
		userRepository.save(user);
		return "login/login";

	}

	/* Getting user detail from database */
	/*
	 * @RequestMapping(value = "login", method = RequestMethod.POST) public String
	 * loginUser(@RequestParam("email") String email, @RequestParam("password")
	 * String password, ModelMap modelMap) {
	 * 
	 * User user = userRepository.findUser(email); if
	 * (user.getUserId().equals(password)) { return "findEvents"; } else {
	 * modelMap.addAttribute("msg", "Email and password mismatch"); return
	 * "login/login"; }
	 * 
	 * }
	 */

	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String loginUser(@RequestParam("email") String email, @RequestParam("password") String password,
			ModelMap modelMap) {
		boolean loginResponse = securityservice.login(email, password);
		if (loginResponse) {
			return "findEvents";
		} else {
			modelMap.addAttribute("msg", "Email and password mismatch");
			return "error";
		}

	}

}
