package Lesson6.HW.player.classes;

import Lesson6.HW.dragons.classes.Dragon;
import Lesson6.HW.player.interfaces.WarriorInterface;
import Lesson6.HW.weapons.classes.Weapon;

public abstract class Warrior implements WarriorInterface {
    private String name;
    private Weapon weapon;

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Warrior(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getWeaponName() {
        return weapon.getName();
    }

    public boolean attack(Dragon attackedNPC) {
        warCry();
        getWeapon();
        boolean tmpResult = false;
        if (attackByWeapon(attackedNPC)) {
            celebrationOfVictory();
            tmpResult = true;
        }
        return tmpResult;
    }

    @Override
    public boolean attackByWeapon(Dragon attackedNPC) {
        return attackedNPC.hitByWeapon(weapon);
    }


}
