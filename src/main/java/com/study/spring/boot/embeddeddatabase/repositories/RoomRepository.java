package com.study.spring.boot.embeddeddatabase.repositories;

import com.study.spring.boot.embeddeddatabase.models.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Long> {
}
