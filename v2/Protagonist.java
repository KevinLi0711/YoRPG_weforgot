public class Protagonist extends Character{

    private String _name = "J. Doe";
    private boolean specialized = false;
    private int defChange;
    private int strengthChange;
    private int hpChange;
    private double atkChange;

    public Protagonist( String name ) {
        super(125, 100, 40, .4);
        _name = name;
        defChange = super.getDefense() / 2;
    }

    public String getName() { return _name; }

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
