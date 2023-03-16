package org.example;

public class MazeFactory implements Factory {

    @Override
    public Maze createMaze() {
        return new Maze();
    }

    @Override
    public Room createRoom(int roomNo) {
        return new Room(roomNo);
    }

    @Override
    public Wall createWall() {
        return new Wall();
    }

    @Override
    public Door createDoor(Room roomFrom, Room roomTo) {
        return new Door(roomFrom, roomTo);
    }
}
