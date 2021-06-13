package Lesson6.HW.dragons.classes;

import Lesson6.HW.damage.WeaponAndDragon;
import Lesson6.HW.dragons.interfaces.DragonInterface;
import Lesson6.HW.weapons.classes.Weapon;

public abstract class Dragon implements DragonInterface {
    int dragonType;

    public Dragon(int dragonType) {
        this.dragonType = dragonType;
    }

    @Override
    public boolean hitByWeapon(Weapon weapon) {
        return WeaponAndDragon.KillDragonByWeapon(getDragonType(),weapon.getId());
    }

    @Override
    public int getDragonType() {
        return dragonType;
    }
}
