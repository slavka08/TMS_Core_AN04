package Lesson5.Lesson5HomeWork.classes.race;

import Lesson5.Lesson5HomeWork.classes.core.Person;

public class Dwarf extends Person {
    public Dwarf(int damage, int speed) {
        super(damage, speed);
        setRace("Dwarf");
        setWeaponName("Топор");
    }
    @Override
    protected void warCry(){
        System.out.println("Заикаясь от эля бормочет клич");
    }
    @Override
    protected void getWeapon(){
        System.out.println("Достает топор");
    }
    @Override
    protected void celebrationOfVictory(){
        System.out.println("Достает кружечку эля и радостно выпивает");
    }
    @Override
    protected void atackByWeapon(){
        System.out.println("Рубит противника");
    }
}
