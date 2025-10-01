package com.airbnb.AirBnbClone.repository;

import com.airbnb.AirBnbClone.entity.Hotel;
import com.airbnb.AirBnbClone.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, Long> {
    List<Hotel> findByOwner(User user);
}
