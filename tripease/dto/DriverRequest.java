package com.example.tripease.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DriverRequest {

    private int driverId;
    private String name;
    private int age;
    private String emailId;

}
