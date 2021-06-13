package Lesson6.HW.player.race;

import Lesson6.HW.player.classes.Warrior;

public class Dwarf extends Warrior {

    public Dwarf(String name) {
        super(name);
    }

    @Override
    public void celebrationOfVictory() {
        System.out.println("Dragon defeated!");
        System.out.println("Pulls out a mug of ale and happily drinks");
    }

    @Override
    public void getWeapon() {
        System.out.println("'Dwarf pulls out a weapon'");
    }

    @Override
    public void warCry() {
        System.out.println("Stuttering from ale mutters a cry");
    }
}
