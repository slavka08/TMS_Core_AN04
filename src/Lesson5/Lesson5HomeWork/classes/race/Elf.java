package Lesson5.Lesson5HomeWork.classes.race;

import Lesson5.Lesson5HomeWork.classes.core.Person;


public class Elf extends Person {
    public Elf(int damage, int speed) {
        super(damage, speed);
        setRace("Elf");
        setWeaponName("Лук");
    }


    @Override
    protected void warCry() {
        System.out.println("Что-то тихо произносит");
    }

    @Override
    protected void getWeapon() {
        System.out.println("Достает лук и стрелы, натягивает тетеву");
    }

    @Override
    protected void celebrationOfVictory() {
        System.out.println("Молчит");
    }

    @Override
    protected void atackByWeapon() {
        System.out.println("Стреляет");
    }
}
