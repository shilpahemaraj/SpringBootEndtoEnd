<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Reservation Details</title>
</head>
<body>
	<h2>Event Reservation Details:</h2>

	  Event: ${reservation.event.eventName}
	<br /> eventCategory: ${reservation.event.eventCategory}
	<br /> eventCity: ${reservation.event.eventCity}
	<br />  

	<h2>Attendee Details</h2>

 First Name: ${reservation.attendee.firstName}
	<br /> Last Name: ${reservation.attendee.lastName}
	<br /> Email : ${reservation.attendee.email}
	<br /> Phone: ${reservation.attendee.phone}
	<br /> 

	<form action="completeCheckIn" method="post">
		 Enter the Number Of Guests: <input type="text" name="noOfGuests" />
			  <input type="hidden" value="${reservation.reservationId}" name="reservationId" />  
			  <input type="submit" value="Check In" />


	</form>

</body>
</html>