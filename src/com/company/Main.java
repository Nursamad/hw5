package com.company;


public class Main {

    public static void main(String[] args) {

        Door door = new Door();
        Boss boss = new Boss();
        boss.bossChangeDefence(10);
        boss = new Boss("Tanos" , 500 , 60 , 15);

        System.out.println(boss.getName() + ": " + "Health: " +boss.getHp() + ", " + "Damage: " + boss.getDamage() + ", " + "Defence type: " +boss.getDefenceType() + ";");
        System.out.println("______________________________________________");
        for (int i = 0; i < door.createHero().length; i++) {
            System.out.println(door.createHero()[i].getName() + ": " + "Health: "+ door.createHero()[i].getHp() + ", " + "Damage: " +door.createHero()[i].getDamage() + ", " + "Attack type: " + door.createHero()[i].getAttackType() + ";");
        }

    }
}
