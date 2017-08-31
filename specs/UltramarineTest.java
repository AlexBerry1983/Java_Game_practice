import static org.junit.Assert.*;
import org.junit.*;
import spacemarines.*;
import weapons.*;

public class UltramarineTest {


  @Test
  public void canGetLegion() {
    Ultramarine marine = new Ultramarine();
    assertEquals("ULTRAMARINE", marine.getLegion().name());
  }

  @Test
  public void testMarineStartsUnarmed() {
    Ultramarine marine = new Ultramarine();
    assertEquals(0, marine.checkNumberOfWeapons());
  }

  @Test
  public void canAddFirstWeapon() {
    Ultramarine marine = new Ultramarine();
    Boltgun boltgun = new Boltgun();
    marine.addWeapon(boltgun);
    assertEquals(1, marine.checkNumberOfWeapons());
  }

  @Test
  public void canAddSecondWeapon() {
    Ultramarine marine = new Ultramarine();
    Boltgun boltgun = new Boltgun();
    Boltgun boltgun2 = new Boltgun();
    marine.addWeapon(boltgun);
    marine.addWeapon(boltgun2);
    assertEquals(2, marine.checkNumberOfWeapons());
  }

  @Test
  public void cannotHoldThreeWeapons() {
    Ultramarine marine = new Ultramarine();
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
    Ultramarine marine = new Ultramarine();
    Boltgun boltgun = new Boltgun();
    PlasmaGun gun = new PlasmaGun();
    marine.addWeapon(boltgun);
    marine.addWeapon(gun);
    assertEquals(gun, marine.findWeapon(1));
  }

  @Test
  public void canIdentifyFirstWeapon() {
    Ultramarine marine = new Ultramarine();
    Boltgun boltgun = new Boltgun();
    PlasmaGun gun = new PlasmaGun();
    marine.addWeapon(boltgun);
    marine.addWeapon(gun);
    assertEquals(boltgun, marine.findWeapon(0));
  }





}
