package com.example.tripease.dto;

import com.example.tripease.Enum.Trip;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import java.util.Date;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class BookingResponse {

    private String pickup;
    private String destination;
    private double tripDistanceInKm;
    private Trip tripStatus;
    private double billAmount;
    private Date bookedAt;
    private Date lastUpdateAt;
    private CustomerResponse customerResponse;
    private CabResponse cab;
}
