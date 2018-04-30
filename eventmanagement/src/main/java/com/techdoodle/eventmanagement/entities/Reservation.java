package com.techdoodle.eventmanagement.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Reservation {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "reservation_id")
	private Long reservationId;
	@Column(name = "checked_in")
	private int checkedIn;
	@Column(name = "number_of_guests")
	private String noOfGuests;
	@OneToOne
	@JoinColumn(name = "attendee_id")
	private Attendee attendee;
	@OneToOne
	@JoinColumn(name = "event_id")
	// can't use @Column if we are using @OneToOne
	private Event event;
	private String created;

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

	public Attendee getAttendee() {
		return attendee;
	}

	public void setAttendee(Attendee attendee) {
		this.attendee = attendee;
	}

	public Event getEvent() {
		return event;
	}

	public void setEvent(Event event) {
		this.event = event;
	}

	public String getCreated() {
		return created;
	}

	public void setCreated(String created) {
		this.created = created;
	}

}
