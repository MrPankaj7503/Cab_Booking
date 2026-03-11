package com.pankaj.cabbooking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pankaj.cabbooking.entity.Ride;
import com.pankaj.cabbooking.service.RideService;

@RestController
@RequestMapping("/api/rides")
@CrossOrigin
public class RideController {

    @Autowired
    private RideService rideService;

    @PostMapping
    public Ride bookRide(@RequestBody Ride ride) {
        return rideService.bookRide(ride);
    }

    @GetMapping
    public List<Ride> getAllRides() {
        return rideService.getAllRides();
    }

}