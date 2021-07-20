package com.roomeeting.roomeeting.model.entity;

import javax.persistence.*;


@Entity
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private int maximumCapacity;

    private int floor;

    private boolean hasAProjector;

    public Room() {
    }

    public Room(String name, int maximumCapacity, int floor, boolean hasAProjector) {
        super();
        this.name = name;
        this.maximumCapacity = maximumCapacity;
        this.floor = floor;
        this.hasAProjector = hasAProjector;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaximumCapacity() {
        return maximumCapacity;
    }

    public void setMaximumCapacity(int maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public boolean isHasAProjector() {
        return hasAProjector;
    }

    public void setHasAProjector(boolean hasAProjector) {
        this.hasAProjector = hasAProjector;
    }
}
