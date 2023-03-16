package org.example;

public class EnchantedRoom extends Room {
    private CastSpell castSpell;

    public EnchantedRoom(int roomNo, CastSpell castSpell) {
        super(roomNo);
        this.castSpell = castSpell;
    }
}
