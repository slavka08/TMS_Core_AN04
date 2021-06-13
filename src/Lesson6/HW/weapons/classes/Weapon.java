package Lesson6.HW.weapons.classes;

public abstract class Weapon {
    private String name;
    private int damage;
    private int id;

    public Weapon(String name, int damage, int id) {
        this.name = name;
        this.damage = damage;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}
