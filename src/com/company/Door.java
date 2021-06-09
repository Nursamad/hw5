package com.company;

public class Door {

    public Hero[] createHero() {

        Hero hero1 = new Hero("IronMan ",200, 20, 24);
        Hero hero2 = new Hero("Pantera ",120, 20, 23);
        Hero hero3 = new Hero("Spider-Man ",140, 20, 23);
        Hero hero4 = new Hero("Halk ",100, 20, 14);
        Hero [] array = {hero1, hero2, hero3, hero4};
        return array;
    }

}


