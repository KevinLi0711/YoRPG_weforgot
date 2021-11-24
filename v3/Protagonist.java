public class Protagonist extends Character{

    protected String _name = "J. Doe";
    protected boolean specialized = false;
    protected int defChange;
    protected int strengthChange;
    protected int hpChange;
    protected double atkChange;

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
