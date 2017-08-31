package players;
import java.util.*;
import spacemarines.*;

public class UltramarinePlayer extends Player {

  ArrayList<Ultramarine> marinesArray;
  PlayerType playerType;

  public UltramarinePlayer() {
    this.marinesArray = new ArrayList<Ultramarine>();
    this.playerType = PlayerType.LOYALIST;
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

  public void addMarine(Ultramarine marine) {
    this.marinesArray.add(marine);
  }
}
