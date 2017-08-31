import static org.junit.Assert.*;
import org.junit.*;
import spacemarines.Wordbearer;
import weapons.*;

public class WordbearerTest {


  @Test
  public void canGetLegion() {
    Wordbearer marine = new Wordbearer();
    assertEquals("WORDBEARERS", marine.getLegion().name());
  }

  @Test
  public void testMarineStartsUnarmed() {
    Wordbearer marine = new Wordbearer();
    assertEquals(0, marine.checkNumberOfWeapons());
  }

  @Test
  public void canAddFirstWeapon() {
    Wordbearer marine = new Wordbearer();
    Boltgun boltgun = new Boltgun();
    marine.addWeapon(boltgun);
    assertEquals(1, marine.checkNumberOfWeapons());
  }

  @Test
  public void canAddSecondWeapon() {
    Wordbearer marine = new Wordbearer();
    Boltgun boltgun = new Boltgun();
    Boltgun boltgun2 = new Boltgun();
    marine.addWeapon(boltgun);
    marine.addWeapon(boltgun2);
    assertEquals(2, marine.checkNumberOfWeapons());
  }

  @Test
  public void cannotHoldThreeWeapons() {
    Wordbearer marine = new Wordbearer();
    Boltgun boltgun = new Boltgun();
    Boltgun boltgun2 = new Boltgun();
    PlasmaGun gun = new PlasmaGun();
    marine.addWeapon(boltgun);
    marine.addWeapon(boltgun2);
    marine.addWeapon(gun);
    assertEquals(2, marine.checkNumberOfWeapons());
  }

  @Test
  public void canIdentifySecondWeapon() {
    Wordbearer marine = new Wordbearer();
    Boltgun boltgun = new Boltgun();
    PlasmaGun gun = new PlasmaGun();
    marine.addWeapon(boltgun);
    marine.addWeapon(gun);
    assertEquals(gun, marine.findWeapon(1));
  }

  @Test
  public void canIdentifyFirstWeapon() {
    Wordbearer marine = new Wordbearer();
    Boltgun boltgun = new Boltgun();
    PlasmaGun gun = new PlasmaGun();
    marine.addWeapon(boltgun);
    marine.addWeapon(gun);
    assertEquals(boltgun, marine.findWeapon(0));
  }



}
