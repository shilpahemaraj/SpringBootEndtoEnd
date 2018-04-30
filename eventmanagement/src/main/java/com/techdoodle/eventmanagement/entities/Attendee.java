package com.techdoodle.eventmanagement.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Attendee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "attendee_id")
	private Long attendeeId;
	@Column(name = "first_name")
	private String firstName;
	@Column(name = "last_name")
	private String lastName;
	@Column(name = "middle_name")
	private String middleName;
	private String email;
	private String phone;

	public Long getAttendeeId() {
		return attendeeId;
	}

	public void setAttendeeId(Long attendeeId) {
		this.attendeeId = attendeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Attendee [attendeeId=" + attendeeId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", middleName=" + middleName + ", email=" + email + ", phone=" + phone + "]";
	}

}
