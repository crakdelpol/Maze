package org.example;

public abstract class MazeBuilder {

    public void buildRoom(int r) {}

    public void buildDoor(int r1, Direction d, int r2) {}

    public Maze getMaze() {return null;}
}
