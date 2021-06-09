package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setName("Танос");
        boss.setHp(500);
        boss.setDamage(40);
        boss.setDefenceType(15);


        Hero hero = new Hero();
        hero.setName("Тор");
        hero.setHp(200);
        hero.setDamage(60);
        hero.setAttackType(12);

        System.out.println(hero.getName() + "\nЗдоровье: " + hero.getHp() + ";" + "\nУрон: " + hero.getDamage() + ";" + "\nТип атаки: " + hero.getAttackType() + ";");
        System.out.println("________________________________");
        System.out.println(boss.getName() + "\nЗдоровье: " + boss.getHp() + ";" + "\nУрон: " + boss.getDamage() + ";" + "\nТип защиты: " + boss.getDefenceType() + ";");

    }
}
