package Lesson6.HW.damage;

public class WeaponAndDragon {
    public static boolean KillDragonByWeapon(int daragonType, int weaponId){
       boolean tmpResult = false;
        switch (daragonType){
            case 1: {
                tmpResult = ((weaponId == 1) || (weaponId== 4));
                break;
            }
            case 2: {
                tmpResult = (weaponId == 2);
                break;
            }
            case 3: {
                tmpResult = (weaponId == 3);
                break;
            }
        }
        return tmpResult;
    }
}
