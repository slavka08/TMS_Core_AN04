package Lesson6.HW.player.race;

import Lesson6.HW.player.classes.Warrior;

public class Undead extends Warrior {

    public Undead(String name) {
        super(name);
    }

    @Override
    public void warCry() {
        System.out.println("Scary laugh");
    }

    @Override
    public void celebrationOfVictory() {
        System.out.println("Dragon defeated!");
        System.out.println("Celebrating victory as undead");
    }

    @Override
    public void getWeapon() {
        System.out.println("'Undead pulls out a weapon'");
    }

}
