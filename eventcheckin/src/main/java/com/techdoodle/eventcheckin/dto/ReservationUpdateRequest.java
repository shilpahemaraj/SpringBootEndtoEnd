package com.techdoodle.eventcheckin.dto;

public class ReservationUpdateRequest {

	private Long reservationId;
	private int checkedIn;
	private String noOfGuests;

	public Long getReservationId() {
		return reservationId;
	}

	public void setReservationId(Long reservationId) {
		this.reservationId = reservationId;
	}

	public int getCheckedIn() {
		return checkedIn;
	}

	public void setCheckedIn(int checkedIn) {
		this.checkedIn = checkedIn;
	}

	public String getNoOfGuests() {
		return noOfGuests;
	}

	public void setNoOfGuests(String noOfGuests) {
		this.noOfGuests = noOfGuests;
	}

}
