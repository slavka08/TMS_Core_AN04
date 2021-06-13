package Lesson6.HW.dragons;

import Lesson6.HW.dragons.classes.Dragon;
import Lesson6.HW.weapons.classes.Weapon;

public class RedDragon extends Dragon {

    public RedDragon() {
        super(1);
    }

    @Override
    public boolean hitByWeapon(Weapon weapon) {
        return ((weapon.getId() == 1) || (weapon.getId()== 4));
    }

    @Override
    public String getDragonInfo() {
        return "here is red dragon, you can defeat him by magic or bow";
    }
}
