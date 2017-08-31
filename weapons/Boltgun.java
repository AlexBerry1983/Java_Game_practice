package weapons;
import game.*;

public class Boltgun extends Weapon {

  private WeaponRange range;

  public Boltgun() {
    this.numberOfDice = 2;
    this.range = WeaponRange.DISTANCE;
  }

  public WeaponRange getRange() {
    return this.range;
  }

  public int shoot(Dice dice) {
    return dice.rollTwoDice();
  }
}
