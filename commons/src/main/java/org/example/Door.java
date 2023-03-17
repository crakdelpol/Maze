package org.example;

public class Door implements MapSite {
    private Room fromRoom;
    private Room toRoom;

    public Door(Room r1, Room r2) {
        fromRoom = r1;
        toRoom = r2;
    }

    @Override
    public void enter() {

    }

    @Override
    public String toString() {
        return "Door";
    }
}
