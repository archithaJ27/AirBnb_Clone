package com.airbnb.AirBnbClone.repository;

import com.airbnb.AirBnbClone.entity.Guest;
import com.airbnb.AirBnbClone.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface GuestRepository extends JpaRepository<Guest, Long> {
    List<Guest> findByUser(User user);
}