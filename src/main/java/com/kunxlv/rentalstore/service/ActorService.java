package com.kunxlv.rentalstore.service;

import com.kunxlv.rentalstore.dao.ActorRepository;
import com.kunxlv.rentalstore.dto.ActorDTO;
import com.kunxlv.rentalstore.exception.ActorNotFoundException;
import com.kunxlv.rentalstore.model.Actor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ActorService {

    private final ActorRepository actorRepository;

    public ActorService(ActorRepository actorRepository) {
        this.actorRepository = actorRepository;
    }

    public List<ActorDTO> getAllActors() {
        try {
            List<Actor> actors = actorRepository.findAll();
            return actors.stream()
                    .map(this::convertToDTO)
                    .collect(Collectors.toList());
        } catch (Exception e) {
            throw new ActorNotFoundException("Failed to fetch actors", e);
        }
    }

   public ActorDTO getActorById(Long actorId) {
            try {
                Optional<Actor> actor = actorRepository.findById(actorId);
                if (actor.isPresent()) {
                    return convertToDTO(actor.get());
                } else {
                    throw new Exception("Actor not found");
                }
            } catch (Exception e) {
                throw new ActorNotFoundException("Failed to fetch actor", e);
            }
        }
    private ActorDTO convertToDTO(Actor actor) {
        ActorDTO actorDTO = new ActorDTO();
        actorDTO.setActorId(actor.getActorId());
        actorDTO.setFirstName(actor.getFirstName());
        actorDTO.setLastName(actor.getLastName());
        return actorDTO;
    }
}