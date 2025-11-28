package com.example.tripease.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CabRequest {

    private String cabNumber;
    private String cabModal;
    private double perKmRate;
}
