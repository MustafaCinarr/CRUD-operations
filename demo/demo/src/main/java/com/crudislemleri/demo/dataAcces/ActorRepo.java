package com.crudislemleri.demo.dataAcces;

import com.crudislemleri.demo.entities.Actor;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ActorRepo extends JpaRepository<Actor, Integer> {

}
