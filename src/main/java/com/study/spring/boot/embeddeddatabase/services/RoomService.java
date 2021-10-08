package com.study.spring.boot.embeddeddatabase.services;

import com.study.spring.boot.embeddeddatabase.models.Room;
import com.study.spring.boot.embeddeddatabase.repositories.RoomRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomService {

    private final RoomRepository roomRepository;

    public RoomService(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    public List<Room> findAll(){
        return roomRepository.findAll();
    }
}
