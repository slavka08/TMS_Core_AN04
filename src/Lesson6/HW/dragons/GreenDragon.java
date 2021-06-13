package Lesson6.HW.dragons;

import Lesson6.HW.dragons.classes.Dragon;
import Lesson6.HW.weapons.classes.Weapon;

public class GreenDragon extends Dragon {

    public GreenDragon() {
        super(2);
    }


    @Override
    public boolean hitByWeapon(Weapon weapon) {
        return (weapon.getId() == 2);
    }

    @Override
    public String getDragonInfo() {
        return "here is green dragon, you can defeat him by axe";
    }
}
