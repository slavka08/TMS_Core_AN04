package Lesson5.Lesson5HomeWork;

import Lesson5.Lesson5HomeWork.classes.core.Person;
import Lesson5.Lesson5HomeWork.classes.race.Dwarf;
import Lesson5.Lesson5HomeWork.classes.race.Elf;
import Lesson5.Lesson5HomeWork.classes.race.Ork;
import Lesson5.Lesson5HomeWork.classes.race.Undead;

public class Main {
    public static void main(String[] args) {
        Person elf = new Elf(20, 30);
        Person ork = new Ork(100, 2);
        Person undead = new Undead(50, 10);
        Person dwarf = new Dwarf(60, 7);

        elf.setName("Valodia");
        ork.setName("Gennadiy");
        dwarf.setName("Tyrion Lannister");

        elf.atack();
        System.out.println();
        ork.atack();
        System.out.println();
        undead.atack();
        dwarf.atack();

    }
}
