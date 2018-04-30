package com.techdoodle.eventcheckin.dto;

import java.sql.Timestamp;
import java.util.Date;

public class Event {

	private Long eventId;
	private String eventName;
	private String eventCategory;
	private Date eventDate;
	private Timestamp eventTime;
	private Long eventPrice;
	private String eventCity;
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
