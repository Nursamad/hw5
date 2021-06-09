package com.company;

public class Hero {
    String name;
    int hp;
    int damage;
    int attackType;

    public Hero() {
    }

    public Hero(String name, int hp, int damage, int attackType) {
        this.name = name;
        this.hp = hp;
        this.damage = damage;
        this.attackType = attackType;
    }

    public void setName(String name){
     if(name.isEmpty()){
            System.out.println("Отсутствует герой!");
        } else {
        this.name = name;}
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

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    public void setAttackType(int attackType) {
        this.attackType = attackType;
    }

    public int getAttackType() {
        return attackType;
    }
}