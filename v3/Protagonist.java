public class Protagonist extends Character{

    protected String _name = "J. Doe";
    protected boolean specialized = false;
    protected int defChange;

    public Protagonist(String name) {
        super(name);
        HP = 125;
        strength = 100;
        defense = 40;
        attack = .4;
    }

    public String getName() { return name; };

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

    public String about() {
      if (description.equals("")) {
        description += "Your standard traveler";
      } 
      return super.about();
    }
}
