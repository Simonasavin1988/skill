package org.example.warriors;

abstract class Fighter {
    abstract int demgePoint(Fighter opponent);
    boolean isVulnerable() {
        {
            return false;
        }
    }

    abstract int damagePoints(Fighter fighter);
}
