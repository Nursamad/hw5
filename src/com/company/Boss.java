package com.company;

public class Boss {
    private String name;
    private int hp;
    private int damage;
    private int defenceType;


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {

        return name;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getHp() {
        return hp;
    }

    public void setDefenceType(int defenceType) {
        this.defenceType = defenceType;
    }

    public int getDefenceType() {
        return defenceType;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }
}
