package org.example;

public class CountingMazeBuilder extends MazeBuilder {

    private int rooms = 0;
    private int doors = 0;

    public void buildDoor(int r1, int direction, int r2) {
        doors++;
    }
    public void buildRoom(int r) {
        rooms++;
    }

    public int getDoors() { return doors; }
    public int getRooms() { return rooms; }
}
