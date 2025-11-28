package com.example.tripease.Controllers;

import com.example.tripease.Services.BookingService;
import com.example.tripease.dto.BookingRequest;
import com.example.tripease.dto.BookingResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/booking")
public class BookingController {

    @Autowired
    private BookingService bookingService;

    @PostMapping("/bookingCab")
    public BookingResponse bookingCab(@RequestBody BookingRequest bookingRequest, @RequestParam int customerId){
        return bookingService.bookingCab(bookingRequest,customerId);
    }
}
