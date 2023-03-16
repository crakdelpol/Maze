package org.example;

public class BombedMazeFactory extends MazeFactory {

    @Override
    public Room createRoom(int roomNo) {
        return new BombedRoom(roomNo);
    }

    @Override
    public Wall createWall() {
        return new BombedWall();
    }

}
