/**
  class Protagonist -- protagonist of Ye Olde RPG
  **/

public class Protagonist extends Character{

    // ~~~~~~~~~~~ INSTANCE VARIABLES ~~~~~~~~~~~
    private String _name = "J. Doe";
    private boolean specialized = false;
    private int defChange;
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


    /**
      default constructor
      pre:  instance vars are declared
      post: initializes instance vars.
      
    public Protagonist() {
        _hitPts = 125;
        _strength = 100;
        _defense = 40;
        _attack = .4;
    }
    **/


    /**
      overloaded constructor
      pre:  instance vars are declared
      post: initializes instance vars. _name is set to input String.
      **/
    public Protagonist( String name ) {
        //this();
        super(125, 100, 40, .4)
        _name = name;
        defChange = super.getDefense() / 2;
    }


    // ~~~~~~~~~~~~~~ ACCESSORS ~~~~~~~~~~~~~~~~~
    public String getName() { return _name; }
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


    //prepare a Protagonist for a special attack
    public void specialize() {
      if (!specialized) {
        _attack = _attack * 2;
        _defense = _defense -= defChange;
      }
    }

    //revert to normal mode
    public void normalize() {
      if (specialized) {
        _attack = _attack / 2;
        _defense = _defense += defChange;
      }
    }

}//end class Protagonist
