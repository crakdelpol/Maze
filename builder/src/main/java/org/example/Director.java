package org.example;

public class Director {

    public Maze createMaze(MazeBuilder  b) {
        b.buildRoom(1);
        b.buildRoom(2);
        b.buildDoor(1, Direction.North, 2);
        return b.getMaze();
    }
}
