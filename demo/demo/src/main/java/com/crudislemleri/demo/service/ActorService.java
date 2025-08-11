package com.crudislemleri.demo.service;

import com.crudislemleri.demo.dataAcces.ActorRepo;
import com.crudislemleri.demo.entities.Actor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActorService {

    @Autowired
    private ActorRepo actorRepo;

    // Create & Update

    public Actor saveActor(Actor actor)
    {
        return actorRepo.save(actor);
    }

    // Read

    public Iterable<Actor> getAllActors()
    {
        return actorRepo.findAll();
    }

    public Actor getActorById(int id)
    {
        return actorRepo.findById(id).orElse(null);
    }

    // Delete

    public void deleteActorById(int id)
    {
        actorRepo.deleteById(id);
    }

}
