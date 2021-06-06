package Lesson5.Lesson5HomeWork.classes.race;

import Lesson5.Lesson5HomeWork.classes.core.Person;

public class Undead extends Person {
    public Undead(int damage, int speed) {
        super(damage, speed);
        setRace("Undead");
        setWeaponName("Скелеты");
    }
    @Override
    protected void warCry(){
        System.out.println("Устращающе хохочет");
    }
    @Override
    protected void getWeapon(){
        System.out.println("Призывает скелетов");
    }

    @Override
    protected void atackByWeapon(){
        System.out.println("Посылает скелетов в бой");
    }
}
