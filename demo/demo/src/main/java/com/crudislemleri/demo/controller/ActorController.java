package com.crudislemleri.demo.controller;

import com.crudislemleri.demo.entities.Actor;
import com.crudislemleri.demo.service.ActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/actors")
public class ActorController {

    @Autowired
    private ActorService actorService;

    // Create

    @PostMapping
    public Actor createActor(@RequestBody Actor actor)
    {
        return actorService.saveActor(actor);
    }

    // Read

    @GetMapping
    public Iterable<Actor> getAllActors()
    {
        return actorService.getAllActors();
    }

    @GetMapping("/{id}")
    public Actor getActorById(@PathVariable int id)
    {
        return actorService.getActorById(id);
    }

    // Update

    @PutMapping("/{id}")
    public Actor updateActor(@PathVariable int id, @RequestBody Actor actor)
    {
        actor.setId(id); // güncellenecek kaydın id'sini setliyoruz
        return actorService.saveActor(actor);
    }

    // Delete
    @DeleteMapping("/{id}")
    public void deleteActor(@PathVariable int id)
    {
        actorService.deleteActorById(id);
    }

}
