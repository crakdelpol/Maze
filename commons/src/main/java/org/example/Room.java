package org.example;

import java.util.HashMap;
import java.util.Map;

public class Room implements MapSite {

    Map<Direction, MapSite> sides = new HashMap<>();
    private int roomNumber;

    public Room(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void setSide(Direction direction, MapSite mapSite) {
        sides.put(direction, mapSite);
    }

    public MapSite getSide(Direction direction) {
        return sides.get(direction);
    }

    @Override
    public void enter() {

    }

    @Override
    public String toString() {
        return "RoomNumber " + roomNumber + " sides " + sides;
    }

    public int getRoomNumber() {
        return roomNumber;
    }
}
