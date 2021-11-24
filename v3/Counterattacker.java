public class Counterattacker extends Protagonist{

    public Counterattacker(String name) {
        super(name);
        strength = 200;
        attack = .2;
    }

    public void specialize() {
        if (!specialized) {
            specialized = true;
          attack = attack * 2;
          defense -= defChange;
        }
      }
  
      public void normalize() {
        if (specialized) {
            specialized = false;
          attack = attack / 2;
          defense += defChange;
        }
      }
}
