package spacemarines;
import java.util.*;
import weapons.*;

public class Wordbearer extends SpaceMarine {

  private Legion legion;

  public Wordbearer() {
    this.weapons = new ArrayList<Weapon>();
    this.legion = Legion.WORDBEARERS;
  }

  public Legion getLegion() {
    return this.legion;
  }

}
