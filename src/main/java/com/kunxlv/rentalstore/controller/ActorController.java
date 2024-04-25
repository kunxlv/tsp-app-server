package com.kunxlv.rentalstore.controller;

import com.kunxlv.rentalstore.dto.ActorDTO;
import com.kunxlv.rentalstore.service.ActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ActorController {
    @Autowired
    private ActorService actorService;

    @GetMapping("/actor")
    public ResponseEntity<List<ActorDTO>> getAllActors() {
        List<ActorDTO> actors = actorService.getAllActors();
        return new ResponseEntity<>(actors, HttpStatus.OK);
    }

    @GetMapping("/actor/{actor_id}")
    public ResponseEntity<ActorDTO> getActorById(@PathVariable("actor_id") Long actorId) {
        ActorDTO actor = actorService.getActorById(actorId);
        return new ResponseEntity<>(actor, HttpStatus.OK);
    }
}