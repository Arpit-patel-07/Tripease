package com.example.tripease.Entities;

import com.example.tripease.Enum.Gender;
import jakarta.persistence.*;
import lombok.*;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String age;
    private String email;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "customer_id")
    List<Booking> bookingList = new ArrayList<>();
}