package org.example;

public class EnchantedMazeFactory extends MazeFactory {
    @Override
    public Room createRoom(int roomNo) {
        return new EnchantedRoom(roomNo, new CastSpell());
    }

    @Override
    public Door createDoor(Room roomFrom, Room roomTo) {
        return new DoorNeedingSpell(roomFrom, roomTo);
    }
}
