package Lesson5.Lesson5HomeWork.classes.core;

public class Person extends Weapon {
    private String name;
    private String race;

    protected Person(int damage, int speed) {
        super(damage, speed);
        name = "anonymous";
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    protected void setRace(String race) {
        this.race = race;
    }

    public String getRace() {
        return race;
    }

    public void atack() {
        System.out.println("Атакует: " + name + " Расса: " + race+ " Оружие: "+getWeaponName());
        warCry();
        getWeapon();
        atackByWeapon();
        useWeapon();
        celebrationOfVictory();
    }

    protected void atackByWeapon() {

    }

    protected void celebrationOfVictory() {
        System.out.println("'стандартная фраза после убийства'");
    }

    protected void getWeapon() {

    }

    protected void warCry() {

    }
}
