package org.example;

public class BombedRoom extends Room {
    public BombedRoom(int roomNo) {
        super(roomNo);
    }

    @Override
    public String toString() {
        return "BombedRoom";
    }
}
