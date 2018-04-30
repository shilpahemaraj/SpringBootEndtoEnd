package com.techdoodle.eventmanagement.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techdoodle.eventmanagement.entities.Attendee;

/*Spring data
 * CurdRepository
JpaRepository*/
public interface AttendeeRepository extends JpaRepository<Attendee, Long> {

}
