package com.airbnb.AirBnbClone.repository;

import com.airbnb.AirBnbClone.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long> {
}
