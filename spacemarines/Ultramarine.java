package spacemarines;
import java.util.*;
import weapons.*;
import game.*;

public class Ultramarine extends SpaceMarine implements Combat {

  private Legion legion;

  public Ultramarine() {
    this.weapons = new ArrayList<Weapon>();
    this.legion = Legion.ULTRAMARINE;
  }

  public Legion getLegion() {
    return this.legion;
  }

  


}
