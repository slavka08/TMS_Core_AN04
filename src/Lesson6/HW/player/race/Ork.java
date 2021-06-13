package Lesson6.HW.player.race;

import Lesson6.HW.player.classes.Warrior;

public class Ork extends Warrior {

    public Ork(String name) {
        super(name);
    }

    @Override
    public void warCry() {
        System.out.println("Screams something indistinct");
    }

    @Override
    public void getWeapon() {
        System.out.println("'Ork pulls out a weapon'");
    }

    @Override
    public void celebrationOfVictory() {

        System.out.println("Dragon defeated!");
        System.out.println("Screams something indistinct");
    }

}
