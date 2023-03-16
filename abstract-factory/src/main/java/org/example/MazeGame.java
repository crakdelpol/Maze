package org.example;

import static org.example.Direction.East;
import static org.example.Direction.North;

public class MazeGame {

    public static void main(String[] args) {
        Maze simpleMaze = buildMaze(new MazeFactory());
        Maze mazeWithBomb = buildMaze(new BombedMazeFactory());
        Maze enchantedMaze = buildMaze(new EnchantedMazeFactory());

    }

    public static Maze buildMaze(Factory mazeFactory){
        Maze maze = mazeFactory.createMaze();

        Room r1 = mazeFactory.createRoom(1);
        Room r2 = mazeFactory.createRoom(2);

        Door theDoor = mazeFactory.createDoor(r1, r2);
        maze.addRoom(r1);
        maze.addRoom(r2);

        r1.setSide(North, mazeFactory.createWall());
        r1.setSide(East, theDoor);
        r1.setSide(North, mazeFactory.createWall());
        r1.setSide(North, mazeFactory.createWall());

        r2.setSide(North, mazeFactory.createWall());
        r2.setSide(East, theDoor);
        r2.setSide(North, mazeFactory.createWall());
        r2.setSide(North, mazeFactory.createWall());
        return maze;
    }

}
