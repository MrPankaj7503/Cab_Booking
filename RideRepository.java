package com.pankaj.cabbooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pankaj.cabbooking.entity.Ride;

public interface RideRepository extends JpaRepository<Ride, Long> {

}