public class Character {

  protected int _hitPts;
  protected int _strength;
  protected int _defense;
  protected double _attack;
  
  public Character(int hitPts, int strength, int defense, double attack) {
    _hitPts = hitPts;
    _strength = strength;
    _defense = defense;
    _attack = attack;
  }
  
  public int getDefense() {
    return _defense;
  }

  public boolean isAlive() {
    return _hitPts > 0;
  }

  public int attack( Character opponent ) {

    int damage = (int)( (_strength * _attack) - opponent.getDefense() );

    if ( damage < 0 )
      damage = 0;

    opponent.lowerHP( damage );

    return damage;
  }
  
  public void lowerHP( int damageInflicted ) {
    _hitPts = _hitPts - damageInflicted;
  }
}
