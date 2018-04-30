package com.techdoodle.eventmanagement.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.techdoodle.eventmanagement.entities.Event;

/*Spring data
 * CurdRepository
JpaRepository*/
public interface EventRepository extends JpaRepository<Event, Long> {
	@Query(" from Event where event_city=:city")
	public List<Event> findByCity(@Param("city") String city);
}
