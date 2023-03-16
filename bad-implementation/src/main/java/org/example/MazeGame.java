package org.example;

import static org.example.Direction.*;

public class MazeGame {

    public static void main(String[] args) {
        Maze maze = new Maze();
        Room r1 = new Room(1);
        Room r2 = new Room(2);

        Door theDoor = new Door(r1, r2);
        maze.addRoom(r1);
        maze.addRoom(r2);

        r1.setSide(North, new Wall());
        r1.setSide(East, theDoor);
        r1.setSide(North, new Wall());
        r1.setSide(North, new Wall());

        r2.setSide(North, new Wall());
        r2.setSide(East, theDoor);
        r2.setSide(North, new Wall());
        r2.setSide(North, new Wall());

    }

}
