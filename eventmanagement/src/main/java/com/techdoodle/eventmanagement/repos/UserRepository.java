package com.techdoodle.eventmanagement.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.techdoodle.eventmanagement.entities.User;

/*Spring data
 * CurdRepository
JpaRepository*/
public interface UserRepository extends JpaRepository<User, Long> {

	@Query("from User where email= :email ")
	User findUser(@Param("email") String email);

}
