package com.airbnb.AirBnbClone.dto;

import com.airbnb.AirBnbClone.entity.Room;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RoomPriceDto {
    private Room room;
    private Double price;
}
