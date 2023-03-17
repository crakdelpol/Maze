package org.example;


public class StandardMazeBuilder extends MazeBuilder {

    private Maze currentMaze;

    @Override
    public void buildRoom(int r) {
        if (getMaze().getRoom(r) == null) {
            Room room = new Room(r);
            getMaze().addRoom(room);
            for (Direction d : Direction.values()) {
                room.setSide(d, new Wall());
            }
        }
    }

    @Override
    public void buildDoor(int r1, Direction d, int r2) {
        Room room1 = getMaze().getRoom(r1);
        Room room2 = getMaze().getRoom(r2);
        if (room1 == null) {
            buildRoom(r1);
            room1 = getMaze().getRoom(r1);
        }
        if (room2 == null) {
            buildRoom(r2);
            room2 = getMaze().getRoom(r2);
        }

        Door door = new Door(room1, room2);

        room1.setSide(d, door);
        room2.setSide(Direction.opposite(d), door);
    }

    @Override
    public Maze getMaze() {
        if (currentMaze == null)
            currentMaze = new Maze();
        return currentMaze;
    }
}
