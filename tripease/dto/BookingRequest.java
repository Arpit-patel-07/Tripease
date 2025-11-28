package com.example.tripease.dto;

import com.example.tripease.Enum.Trip;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.bind.annotation.RestController;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class BookingRequest {

    private String pickup;
    private String destination;
    private double tripDistanceInKm;
}
