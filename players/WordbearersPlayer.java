package players;
import java.util.*;
import spacemarines.*;

public class WordbearersPlayer extends Player {

  ArrayList<Wordbearer> marinesArray;
  PlayerType playerType;

  public WordbearersPlayer() {
    this.marinesArray = new ArrayList<Wordbearer>();
    this.playerType = PlayerType.TRAITOR;
  }

  public PlayerType getPlayerType() {
    return this.playerType;
  }

  public ArrayList getMarines() {
    return this.marinesArray;
  }

  public int countMarines() {
    return this.marinesArray.size();
  }

  public void addMarine(Wordbearer marine) {
    this.marinesArray.add(marine);
  }
}
