package org.example;

public class WallFactory {

    public Wall createWall(RoomType bombed) {
        switch (bombed){
            case ENCHANTED -> throw new RuntimeException();
            case BOMBED -> {
                return new BombedWall();
            }
            default -> {
                return new Wall();
            }
        }
    }
}
