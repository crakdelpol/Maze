package org.example;

public class MazeGame {

    public static void main(String[] args) {

        Director director = new Director();
        Maze m = director.createMaze(new StandardMazeBuilder());
        System.out.println(m);

        CountingMazeBuilder cmb = new CountingMazeBuilder();
        director.createMaze(cmb);
        System.out.println("rooms = " + cmb.getRooms());
        System.out.println("doors = " + cmb.getDoors());
    }

}
