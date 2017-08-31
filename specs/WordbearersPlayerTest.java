import static org.junit.Assert.*;
import org.junit.*;
import spacemarines.*;
import players.*;

public class WordbearersPlayerTest {

  @Test
  public void checkMarinesArrayStartsEmpty() {
    WordbearersPlayer player1 = new WordbearersPlayer();
    assertEquals(0, player1.countMarines());
  }

  @Test
  public void canAddMarineToArrayList() {
    WordbearersPlayer player1 = new WordbearersPlayer();
    Wordbearer spaceMarine1 = new Wordbearer();
    player1.addMarine(spaceMarine1);
    assertEquals(1, player1.countMarines());
  }
}
