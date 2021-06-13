package Lesson6.HW;

import Lesson6.HW.dragons.BlackDragon;
import Lesson6.HW.dragons.GreenDragon;
import Lesson6.HW.dragons.RedDragon;
import Lesson6.HW.dragons.classes.Dragon;
import Lesson6.HW.player.classes.Warrior;
import Lesson6.HW.player.race.Dwarf;
import Lesson6.HW.player.race.Elf;
import Lesson6.HW.player.race.Ork;
import Lesson6.HW.player.race.Undead;
import Lesson6.HW.weapons.Axe;
import Lesson6.HW.weapons.Bow;
import Lesson6.HW.weapons.SleepWeapon;
import Lesson6.HW.weapons.Magic;

import java.util.Random;
import java.util.Scanner;

public class main {


    public static void main(String[] args) {
        Warrior player = choosePlayerRace();// new Player(enterPlayerName());
        Dragon dragon = createRandomDragon();

        choosePlayerWeapon(player);
        System.out.println("Player:" + player.getName() + " with weapon: " + player.getWeaponName() + " Entering room with dragon...");
        System.out.println(dragon.getDragonInfo());
        if (player.attack(dragon)) {
            System.out.println("You win! take this gold");
        } else {
            System.out.println("Game over! Wasted");
        }

    }

    public static void choosePlayerWeapon(Warrior player) {
        Scanner in = new Scanner(System.in);
        printChooseWeapon();
        System.out.print("Your choose: ");
        int weaponId;
        try {
            weaponId = in.nextInt();
        } catch (Exception e) {
            weaponId = 0;
        }

        switch (weaponId) {
            case 1: {
                player.setWeapon(new Bow());
                break;
            }
            case 2: {
                player.setWeapon(new Axe());
                break;
            }
            case 3: {
                player.setWeapon(new SleepWeapon());
                break;
            }
            case 4: {
                player.setWeapon(new Magic());
                break;
            }
            default: {
                System.out.println("Wrong choose, input a valid weapon number");
                choosePlayerWeapon(player);
                break;
            }
        }
    }

    public static Warrior choosePlayerRace() {
        int playerRaceId = 0;
        Warrior player = null;
        while (playerRaceId > 4 || playerRaceId < 1) {
            Scanner in = new Scanner(System.in);
            printChooseRace();
            System.out.print("Your choose: ");
            try {
                playerRaceId = in.nextInt();
            } catch (Exception e) {
                playerRaceId = 0;
            }
            if (playerRaceId > 4 || playerRaceId < 1) {
                System.out.println("Wrong choose, input a valid race number");
            }
        }
        switch (playerRaceId) {
            case 1: {
                player = new Dwarf(enterPlayerName());
                break;
            }
            case 2: {
                player = new Ork(enterPlayerName());
                break;
            }
            case 3: {
                player = new Undead(enterPlayerName());
                break;
            }
            case 4: {
                player = new Elf(enterPlayerName());
                break;
            }
        }
        return player;
    }

    public static String enterPlayerName() {
        Scanner in = new Scanner(System.in);
        System.out.print("Input player name: ");
        return  in.next();
    }

    public static Dragon createRandomDragon() {
        Random ran = new Random();
        int randId = ran.nextInt(3) + 1;

        Dragon dragon = null;

        switch (randId) {
            case 1: {
                dragon = new RedDragon();
                break;
            }
            case 2: {
                dragon = new GreenDragon();
                break;
            }
            case 3: {
                dragon = new BlackDragon();
                break;
            }
            default: {
                break;
            }
        }
        return dragon;
    }

    public static void printChooseWeapon() {
        System.out.println("Choose weapon: ");
        System.out.println("1. Bow");
        System.out.println("2. Axe");
        System.out.println("3. Tranquilizer gun");
        System.out.println("4. Drink a potion and become a magician");
    }

    public static void printChooseRace() {
        System.out.println("Choose player race: ");
        System.out.println("1. Dwarf");
        System.out.println("2. Ork");
        System.out.println("3. Undead");
        System.out.println("4. Elf");
    }

}
