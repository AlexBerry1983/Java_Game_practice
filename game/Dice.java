package game;
import java.util.Random;

public class Dice {

  public int rollTwoDice() {
    Random rand = new Random();
    int pickedNumber = rand.nextInt(11) + 1;
    return pickedNumber;
  }

  public int rollThreeDice() {
    Random rand = new Random();
    int pickedNumber = rand.nextInt(17) + 1;
    return pickedNumber;
  }

}
