package com.hearst.csms.frm.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.hearst.csms.frm.domain.User;

@Repository
public interface UserRepository extends PagingAndSortingRepository<User, Long> {

	@Query("SELECT DISTINCT user FROM User user " + "INNER JOIN FETCH user.authorities AS authorities "
			+ "WHERE user.username = :username")
	User findByUsername(@Param("username") String username);
}