import static org.junit.Assert.*;
import org.junit.*;
import weapons.Boltgun;

public class BoltgunTest {

  @Test
  public void canGetnumberOfDice() {
    Boltgun gun = new Boltgun();
    assertEquals(2, gun.getNumberOfDice());
  }

  @Test
  public void canGetRange() {
    Boltgun gun = new Boltgun();
    assertEquals("DISTANCE", gun.getRange().name());
  }

}
