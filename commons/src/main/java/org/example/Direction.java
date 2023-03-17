package org.example;

public enum Direction {
    North, South, West, East;

    public static Direction opposite(Direction d) {
        if (North.equals(d)){
            return South;
        }

        if(South.equals(d)){
            return North;
        }

        if(East.equals(d)){
            return West;
        }

        return East;
    }
}
