package com.example.tripease.dto;

import com.example.tripease.Enum.Gender;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
public class CustomerRequest {

    private String name;
    private String age;
    private String email;
    private Gender gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
