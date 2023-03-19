package org.example;

import static org.example.Direction.East;
import static org.example.Direction.North;
import static org.example.RoomType.BOMBED;
import static org.example.RoomType.DEFAULT;

public class MazeGame {

    public static void main(String[] args) {

        RoomFactory roomFactory = new RoomFactory();
        DoorFactory doorFactory = new DoorFactory();
        WallFactory wallFactory = new WallFactory();
        Maze maze = new Maze();
        Room r1 = roomFactory.createRoom(RoomType.DEFAULT, 1);
        Room r2 = roomFactory.createRoom(BOMBED, 1);

        Door theDoor = doorFactory.createDoor(BOMBED, r1, r2);
        maze.addRoom(r1);
        maze.addRoom(r2);

        r1.setSide(North, wallFactory.createWall(BOMBED));
        r1.setSide(East, theDoor);
        r1.setSide(North, wallFactory.createWall(DEFAULT));
        r1.setSide(North, wallFactory.createWall(DEFAULT));

        r2.setSide(North, wallFactory.createWall(BOMBED));
        r2.setSide(East, theDoor);
        r2.setSide(North, wallFactory.createWall(DEFAULT));
        r2.setSide(North, wallFactory.createWall(DEFAULT));

    }
}
