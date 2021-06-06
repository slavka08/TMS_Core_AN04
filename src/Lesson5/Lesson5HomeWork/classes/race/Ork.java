package Lesson5.Lesson5HomeWork.classes.race;

import Lesson5.Lesson5HomeWork.classes.core.Person;

public class Ork extends Person {
    public Ork(int damage, int speed) {
        super(damage, speed);
        setRace("Ork");
        setWeaponName("Большой топор");
    }

    @Override
    protected void warCry() {
        System.out.println("Кричит что-то невнятное");
    }

    @Override
    protected void getWeapon() {
        System.out.println("Достает большой топор");
    }

    @Override
    protected void celebrationOfVictory() {
        System.out.println("Кричит что-то невнятное");
    }

    @Override
    protected void atackByWeapon() {
        System.out.println("Сносит голову противнику");
    }
}
