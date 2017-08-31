package game;
import java.util.*;
import players.*;
import spacemarines.*;


public class Game {

  ArrayList<Player> players;

  public Game() {
    this.players = new ArrayList<Player>();
    players.add(new UltramarinePlayer());
    players.add(new WordbearersPlayer());
  }

  public int playerCount() {
    return this.players.size();
  }

  
}
