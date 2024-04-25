package com.kunxlv.rentalstore.dao;

import com.kunxlv.rentalstore.model.Actor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActorRepository extends JpaRepository<Actor, Long> {
}