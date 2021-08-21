package com.roomeeting.roomeeting.controller;


import com.roomeeting.roomeeting.model.entity.Room;
import com.roomeeting.roomeeting.service.RoommeetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@RestController
@RequestMapping("/room")
public class RoomController {

    @Autowired
    RoommeetingService roommeetingService;
    @RequestMapping(me)

    @PostMapping("/new") //Cria uma nova sala
    @ResponseBody
    public Room createRoom(@Valid Room room) {
        return roommeetingService.createRoom(room);
    }

    @PutMapping("/update") //Altera sala existente
    public Room updateRoom(@Valid Room room) {
        return roommeetingService.updateRoom(room);
    }

    @GetMapping("/list")// Lista todas as salas
    public Iterable<Room> obtainRoom() {
        return roommeetingService.obtainRoom();
    }

    @GetMapping("/{id}") //Lista salas por ID
    public Optional<Room> obtainRoomForId(@PathVariable int id) {
        return roommeetingService.obtainRoomFromId(id);
    }

    @DeleteMapping(path = "/{id}") //Deleta salas por ID
    public void deleteRoom(@PathVariable int id) {
        roommeetingService.deleteRoom(id);
    }

}
