package com.example.tripease.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CabResponse {

    private String cabNumber;
    private String cabModal;
    private Double perKmRate;
    private boolean available;
    private DriverResponse driver;
}
