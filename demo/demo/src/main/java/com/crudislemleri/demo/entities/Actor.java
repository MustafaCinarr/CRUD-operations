package com.crudislemleri.demo.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "actor")
public class Actor {

   @Id
   @Column(name = "actor_id")
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Integer id;

   @Column(name = "first_name")
   private String firstName;

   @Column(name = "last_name")
   private String lastName;

   @Column(name = "last_update")
   private String lastUpdate;

   public Actor()
   {

   }

    public Actor(String firstName, String lastName, String lastUpdate) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.lastUpdate = lastUpdate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastUpdate() {
        return lastUpdate;
    }

    public void setLasUpdate(String lasUpdate) {
        this.lastUpdate = lasUpdate;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", lasUpdate='" + lastUpdate + '\'' +
                '}';
    }
}
