package org.example;

import java.util.HashMap;
import java.util.Map;

public class Maze {

    private Map<Integer, Room> rooms = new HashMap<>();

    public void addRoom(Room room) {
        rooms.put(room.getRoomNumber(), room);
    }

    public Room getRoom(Integer roomNumber){
        return rooms.get(roomNumber);
    }

    @Override
    public String toString() {
        return rooms.toString();
    }
}
