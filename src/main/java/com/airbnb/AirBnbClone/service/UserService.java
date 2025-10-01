package com.airbnb.AirBnbClone.service;

import com.airbnb.AirBnbClone.dto.ProfileUpdateRequestDto;
import com.airbnb.AirBnbClone.dto.UserDto;
import com.airbnb.AirBnbClone.entity.User;

public interface UserService {

    User getUserById(Long id);

    void updateProfile(ProfileUpdateRequestDto profileUpdateRequestDto);

    UserDto getMyProfile();
}
