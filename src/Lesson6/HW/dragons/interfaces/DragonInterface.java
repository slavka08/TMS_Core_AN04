package Lesson6.HW.dragons.interfaces;

import Lesson6.HW.weapons.classes.Weapon;

public interface DragonInterface {
    boolean hitByWeapon(Weapon weapon);
    String getDragonInfo();
    int getDragonType();
}
