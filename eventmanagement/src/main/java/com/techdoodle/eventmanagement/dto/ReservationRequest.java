package com.techdoodle.eventmanagement.dto;

public class ReservationRequest {

	private String eventId;
	private String attendeeFirstName;
	private String attendeeMiddleName;
	private String attendeeLastName;
	private String attendeeEmail;
	private String attendeePhone;
	private String noOfGuests;

	public String getEventId() {
		return eventId;
	}

	public void setEventId(String eventId) {
		this.eventId = eventId;
	}

	public String getAttendeeFirstName() {
		return attendeeFirstName;
	}

	public void setAttendeeFirstName(String attendeeFirstName) {
		this.attendeeFirstName = attendeeFirstName;
	}

	public String getAttendeeMiddleName() {
		return attendeeMiddleName;
	}

	public void setAttendeeMiddleName(String attendeeMiddleName) {
		this.attendeeMiddleName = attendeeMiddleName;
	}

	public String getAttendeeLastName() {
		return attendeeLastName;
	}

	public void setAttendeeLastName(String attendeeLastName) {
		this.attendeeLastName = attendeeLastName;
	}

	public String getAttendeeEmail() {
		return attendeeEmail;
	}

	public void setAttendeeEmail(String attendeeEmail) {
		this.attendeeEmail = attendeeEmail;
	}

	public String getAttendeePhone() {
		return attendeePhone;
	}

	public void setAttendeePhone(String attendeePhone) {
		this.attendeePhone = attendeePhone;
	}

	public String getNoOfGuests() {
		return noOfGuests;
	}

	public void setNoOfGuests(String noOfGuests) {
		this.noOfGuests = noOfGuests;
	}

}
