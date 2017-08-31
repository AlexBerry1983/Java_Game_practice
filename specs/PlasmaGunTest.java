import static org.junit.Assert.*;
import org.junit.*;
import weapons.PlasmaGun;

public class PlasmaGunTest {

  @Test
  public void canGetnumberOfDiceForPlasmagun() {
    PlasmaGun gun = new PlasmaGun();
    assertEquals(3, gun.getNumberOfDice());
  }

  @Test
  public void canGetRange() {
    PlasmaGun gun = new PlasmaGun();
    assertEquals("DISTANCE", gun.getRange().name());
  }

}
