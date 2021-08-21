package com.roomeeting.roomeeting.service;

import com.roomeeting.roomeeting.model.entity.Room;
import com.roomeeting.roomeeting.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RoommeetingService {

    @Autowired
    private RoomRepository roomRepository;

    public Room updateRoom(Room room) {
        roomRepository.save(room);
        return room;
    }

    public Room createRoom(Room room) {
        roomRepository.save(room);
        return room;
    }

    public Iterable<Room> obtainRoom() {
        return roomRepository.findAll();
    }

    public Optional<Room> obtainRoomFromId(int id) {
        return roomRepository.findById(id);
    }

    public void deleteRoom(int id) {
        roomRepository.deleteById(id);
    }

}
