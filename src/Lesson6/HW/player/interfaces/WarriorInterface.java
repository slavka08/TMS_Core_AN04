package Lesson6.HW.player.interfaces;

import Lesson6.HW.dragons.classes.Dragon;

public interface WarriorInterface {

    boolean attackByWeapon(Dragon attackedNPC);

    void celebrationOfVictory();

    void getWeapon();

    void warCry();
}
