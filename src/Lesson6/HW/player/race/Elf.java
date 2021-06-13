package Lesson6.HW.player.race;


import Lesson6.HW.player.classes.Warrior;

public class Elf extends Warrior {


    public Elf(String name) {
        super(name);
    }

    @Override
    public void warCry() {
        System.out.println("Says something quietly");
    }

    @Override
    public void getWeapon() {
        System.out.println("'Elf pulls out a weapon'");
    }

    @Override
    public void celebrationOfVictory() {
        System.out.println("Dragon defeated!");
        System.out.println("Silence");
    }
}
