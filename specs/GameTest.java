import static org.junit.Assert.*;
import org.junit.*;
import players.*;
import game.*;

public class GameTest {

  @Test
  public void gameStartsWithTwoPlayers() {
    Game game = new Game();
    assertEquals(2, game.playerCount());
  }
}
