package org.example;

public class DoorFactory{

    public Door createDoor(RoomType bombed, Room r1, Room r2) {
        switch (bombed){
            case BOMBED -> throw new RuntimeException();
            case ENCHANTED -> {
                return new DoorNeedingSpell(r1, r2);
            }
            default -> {
                return new Door(r1, r2);
            }
        }
    }
}
