package Lesson5.Lesson5HomeWork.classes.core;

abstract class Weapon {
    private int damage;
    private int speed;
    private String weaponName;

    public Weapon(int damage, int speed) {
        this.damage = damage;
        this.speed = speed;
    }

    protected void useWeapon() {
        System.out.println("atack power: " + damage + " speed: " + speed);
    }

    protected void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public int getDamage() {
        return damage;
    }

    protected void setDamage(int damage) {
        this.damage = damage;
    }

    protected void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }

    public String getWeaponName() {
        return weaponName;
    }
}
