package com.Solitude.controllers;

import com.Solitude.Entity.BookingEvent;
import com.Solitude.RESTHelper.UserCheckInOut;
import com.Solitude.Service.UserServiceImplementation;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {

    private final UserServiceImplementation userService;

    // later on add another option on top of this option to make the process faster
    @PostMapping("/checkin")
    public ResponseBody checkIn(@RequestBody UserCheckInOut user, @RequestBody BookingEvent event) {
        userService.checkIn(user, event);
        return null;
    }

    @PostMapping("/checkout")
    public ResponseBody checkOut(@RequestBody UserCheckInOut user, @RequestBody BookingEvent event) {
        userService.checkOut(user, event);
        return null;
    }
}
