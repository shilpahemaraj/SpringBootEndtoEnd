package com.techdoodle.eventmanagement.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techdoodle.eventmanagement.entities.Reservation;

/*Spring data
 * CurdRepository
JpaRepository*/
public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}
