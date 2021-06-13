package Lesson6.HW.dragons.classes;

import Lesson6.HW.dragons.interfaces.DragonInterface;
import Lesson6.HW.weapons.classes.Weapon;

public abstract class Dragon implements DragonInterface {
    int dragonType;

    public Dragon(int dragonType) {
        this.dragonType = dragonType;
    }

    @Override
    public int getDragonType() {
        return dragonType;
    }
}
