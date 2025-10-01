package com.airbnb.AirBnbClone.dto;

import com.airbnb.AirBnbClone.entity.enums.Gender;
import lombok.Data;

import java.time.LocalDate;

@Data
public class GuestDto {
    private Long id;
    private String name;
    private Gender gender;
    private LocalDate dateOfBirth;
}
