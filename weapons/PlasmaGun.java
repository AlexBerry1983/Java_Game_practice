package weapons;
import game.*;

public class PlasmaGun extends Weapon {

  private WeaponRange range;

  public PlasmaGun() {
    this.numberOfDice = 3;
    this.range = WeaponRange.DISTANCE;
  }

  public WeaponRange getRange() {
    return this.range;
  }

  public int shoot(Dice dice) {
    return dice.rollThreeDice();
  }
}
