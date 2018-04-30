<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Flights</title>
</head>
<body>
	<h2>Events:</h2>

	<table>

		<tr>
			<th>EVENT_NAME</th>
			<th>EVENT_CATEGORY</th>
			<th>EVENT_CITY</th>
			<th>EVENT_PINCODE</th>
			<th>EVENT_DATE</th>
			<th>EVENT_PRICE</th>
			<th></th>
		</tr>

		<c:forEach items="${listOfEvents}" var="event">
			<tr>

				<td>${event.eventName}</td>
				<td>${event.eventCategory}</td>
				<td>${event.eventCity}</td>
				<td>${event.eventPincode}</td>
				<td>${event.eventDate}</td
				<td>${event.eventPrice}</td>
				<td><a href="showCompleteReservation?eventId=${event.eventId}">Select</a>
				
				</td>
			</tr>

		</c:forEach>
	</table>
</body>
</html>

