package com.roomeeting.roomeeting.controller;


import com.roomeeting.roomeeting.model.entity.Room;
import com.roomeeting.roomeeting.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@RestController
@RequestMapping("/room")
public class RoomController {

    @Autowired
    private RoomRepository roomRepository;

    @RequestMapping(method = {RequestMethod.POST, RequestMethod.PUT}) //Atualiza e cria nova sala
    public @ResponseBody
    Room upNewRoom(@Valid Room room) {
        roomRepository.save(room);
        return room;

    }

    @GetMapping ("/list")// Lista as salas
    public Iterable<Room> obtainRoom() {
        return roomRepository.findAll();
    }

    @GetMapping ("/{id}") //Lista sala por ID
    public Optional<Room> obtainRoomForId (@PathVariable int id) {
    return roomRepository.findById(id);

    }

    @DeleteMapping (path = "/{id}") //Deleta salas por ID
    public void deleteRoom(@PathVariable  int id) { roomRepository.deleteById(id);}


}
