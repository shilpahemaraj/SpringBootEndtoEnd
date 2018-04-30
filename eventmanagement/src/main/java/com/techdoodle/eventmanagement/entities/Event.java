package com.techdoodle.eventmanagement.entities;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Event {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "event_id")
	private Long eventId;
	@Column(name = "event_name")
	private String eventName;
	@Column(name = "event_category")
	private String eventCategory;
	@Column(name = "event_date")
	private Date eventDate;
	@Column(name = "event_time")
	private Timestamp eventTime;
	@Column(name = "event_price")
	private Long eventPrice;
	@Column(name = "event_city")
	private String eventCity;
	@Column(name = "event_pincode")
	private String eventPincode;

	public Long getEventId() {
		return eventId;
	}

	public void setEventId(Long eventId) {
		this.eventId = eventId;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public String getEventCategory() {
		return eventCategory;
	}

	public void setEventCategory(String eventCategory) {
		this.eventCategory = eventCategory;
	}

	public Date getEventDate() {
		return eventDate;
	}

	public void setEventDate(Date eventDate) {
		this.eventDate = eventDate;
	}

	public Timestamp getEventTime() {
		return eventTime;
	}

	public void setEventTime(Timestamp eventTime) {
		this.eventTime = eventTime;
	}

	public Long getEventPrice() {
		return eventPrice;
	}

	public void setEventPrice(Long eventPrice) {
		this.eventPrice = eventPrice;
	}

	public String getEventCity() {
		return eventCity;
	}

	public void setEventCity(String eventCity) {
		this.eventCity = eventCity;
	}

	public String getEventPincode() {
		return eventPincode;
	}

	public void setEventPincode(String eventPincode) {
		this.eventPincode = eventPincode;
	}

	@Override
	public String toString() {
		return "Event [eventId=" + eventId + ", eventName=" + eventName + ", eventCategory=" + eventCategory
				+ ", eventDate=" + eventDate + ", eventTime=" + eventTime + ", eventPrice=" + eventPrice
				+ ", eventCity=" + eventCity + ", eventPincode=" + eventPincode + "]";
	}

}
