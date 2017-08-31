import static org.junit.Assert.*;
import org.junit.*;
import spacemarines.*;
import players.*;

public class UltramarinePlayerTest {

  @Test
  public void checkMarinesArrayStartsEmpty() {
    UltramarinePlayer player1 = new UltramarinePlayer();
    assertEquals(0, player1.countMarines());
  }

  @Test
  public void canAddMarineToArrayList() {
    UltramarinePlayer player1 = new UltramarinePlayer();
    Ultramarine spaceMarine1 = new Ultramarine();
    player1.addMarine(spaceMarine1);
    assertEquals(1, player1.countMarines());
  }

  

}
