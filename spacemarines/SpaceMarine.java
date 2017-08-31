package spacemarines;
import java.util.*;
import weapons.*;
import game.*;

public abstract class SpaceMarine {

  ArrayList<Weapon> weapons;

  public SpaceMarine() {
    this.weapons = new ArrayList<Weapon>();
  }

  public int checkNumberOfWeapons() {
    return weapons.size();
  }

  public void addWeapon(Weapon weapon) {
    if (checkNumberOfWeapons() <= 1) {
      weapons.add(weapon);
    } else {
      weapons.remove(0);
      weapons.add(weapon);
    }
  }

  public Weapon findWeapon(int index) {
    return weapons.get(index);
  }

  public int save(Dice dice) {
    int saveResult = dice.rollTwoDice();
    return saveResult;
  }



}
