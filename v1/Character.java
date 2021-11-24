public class Character {
  public int _hitPts;
  public int _strength;
  public int _defense;
  public double _attack;
  
  public Character(int hitPts, int strength, int defense, double attack) {
    _hitPts = hitPts;
    _strength = strength;
    _defense = defense;
    _attack = attack;
  }
  
  // ~~~~~~~~~~~~~~ ACCESSORS ~~~~~~~~~~~~~~~~~
  public int getDefense() { return _defense; }
  // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  
  /**
     boolean isAlive() -- tell whether I am alive
     post: returns boolean indicated alive or dead
  **/
  public boolean isAlive() {
    return _hitPts > 0;
  }
  
  /**
     int attack(Character) -- simulates attack on a Character
     pre:  Input not null
     post: Calculates damage to be inflicted, flooring at 0. 
     Calls opponent's lowerHP() method to inflict damage. 
     Returns damage dealt.
  **/
  
  public int attack( Character opponent ) {

    int damage = (int)( (_strength * _attack) - opponent.getDefense() );
    //System.out.println( "\t\t**DIAG** damage: " + damage );

    if ( damage < 0 )
      damage = 0;

    opponent.lowerHP( damage );

    return damage;
  }//end attack
  
  /**
     void lowerHP(int) -- lowers life by input value
     pre:  Input >= 0
     post: Life instance var is lowered by input ammount.
  **/
  public void lowerHP( int damageInflicted ) {
    _hitPts = _hitPts - damageInflicted;
  }
}
