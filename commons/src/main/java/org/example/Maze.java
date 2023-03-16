package org.example;

import java.util.ArrayList;
import java.util.List;

public class Maze {

    private List<Room> rooms = new ArrayList<>();

    public void addRoom(Room room) {
        rooms.add(room);
    }
}
