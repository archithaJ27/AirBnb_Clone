package com.airbnb.AirBnbClone.service;

import com.airbnb.AirBnbClone.dto.HotelDto;
import com.airbnb.AirBnbClone.dto.HotelInfoDto;
import com.airbnb.AirBnbClone.dto.HotelInfoRequestDto;

import java.util.List;

public interface HotelService {
    HotelDto createNewHotel(HotelDto hotelDto);

    HotelDto getHotelById(Long id);

    HotelDto updateHotelById(Long id, HotelDto hotelDto);

    void deleteHotelById(Long id);

    void activateHotel(Long hotelId);

    HotelInfoDto getHotelInfoById(Long hotelId, HotelInfoRequestDto hotelInfoRequestDto);

    List<HotelDto> getAllHotels();
}
