package Lesson6.HW.dragons;

import Lesson6.HW.dragons.classes.Dragon;
import Lesson6.HW.weapons.classes.Weapon;

public class BlackDragon extends Dragon {

    public BlackDragon() {
        super(3);
    }

    @Override
    public boolean hitByWeapon(Weapon weapon) {
        return (weapon.getId() == 3);
    }

    @Override
    public String getDragonInfo() {
        return "here is black dragon, you cant kill this dragon, you can only send him to sleep";
    }
}
