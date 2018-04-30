<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Complete Reservation</title>
</head>
<body>
	<h2>Complete the reservation</h2>
	Event Name: ${eventDetails.eventName}
	<br /> Event Category : ${eventDetails.eventCategory}
	<br /> Event Date : ${eventDetails.eventDate}
	<br /> Event Price : ${eventDetails.eventPrice}
	<br /> Event City : ${eventDetails.eventCity}
	<br /> Event Pincode : ${eventDetails.eventPincode}
	<br />


	<form action="completeReservation" method="post" />
	<pre>
<h2>Passenger Details:</h2>
First Name:<input type="text" name="attendeeFirstName" />
Middle Name:<input type="text" name="attendeeMiddleName" />
Last Name:<input type="text" name="attendeeLastName" />
Email:<input type="text" name="attendeeEmail" />
Phone:<input type="text" name="attendeePhone" />

<h2>Card Details:</h2>
Name on the card:<input type="text" name="nameOnTheCard" />
Card No:<input type="text" name="cardNumber" />
Expiry Date:<input type="text" name="expirationDate" />
Three Digit Sec Code:<input type="text" name="securityCode" />

<input type="hidden" name="eventId" value="${eventDetails.eventId}" />
<input type="submit" value="confirm" />
</pre>
	</form>

</body>
</html>






