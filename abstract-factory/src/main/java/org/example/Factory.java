package org.example;

public interface Factory {
    Maze createMaze();

    Room createRoom(int roomNo);

    Wall createWall();

    Door createDoor(Room roomFrom, Room roomTo);
}
