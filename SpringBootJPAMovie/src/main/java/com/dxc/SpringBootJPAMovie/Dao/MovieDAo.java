package com.dxc.SpringBootJPAMovie.Dao;

	import org.springframework.data.jpa.repository.JpaRepository;
	import org.springframework.stereotype.Repository;

	import com.dxc.SpringBootJPAMovie.Entity.Movie;
	// JPARepository contains all the Database Actionable functions
	// i.e Creating and Closing Connection, create, insert, update, delete


	@Repository // It will grant permission to spring boot container to talk to JpaRepository and access all the
				// functions in JpaRepository

	// JpaRepository will come to know that EmployeeDAO is one interface Repository which will be accessing all
	// my inbuilt functions and i have to grant access to all of those functions to JpaRepository
	public interface MovieDAo extends JpaRepository<Movie, Integer> {


	}


