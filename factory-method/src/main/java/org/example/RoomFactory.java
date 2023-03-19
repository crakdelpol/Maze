package org.example;

public class RoomFactory {

    public Room createRoom(RoomType type, int roomNumber) {
        return switch (type) {
            case ENCHANTED -> new EnchantedRoom(1, new CastSpell());
            case BOMBED -> new BombedRoom(1);
            default -> new Room(roomNumber);
        };
    }
}
