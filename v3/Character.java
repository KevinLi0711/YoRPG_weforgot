public class Character {

  protected int HP;
  protected int strength;
  protected int defense;
  protected double attack;
  
  public Character(int HP, int strength, int defense, double attack) {
    this.HP = HP;
    this.strength = strength;
    this.defense = defense;
    this.attack = attack;
  }
  
  public int getDefense() {
    return defense;
  }

  public boolean isAlive() {
    return HP > 0;
  }

  public int attack( Character opponent ) {

    int damage = (int)( (strength * attack) - opponent.getDefense() );

    if ( damage < 0 )
      damage = 0;

    opponent.lowerHP( damage );

    return damage;
  }
  
  public void lowerHP( int damageInflicted ) {
    HP = HP - damageInflicted;
  }

  public void printStats() {
    System.out.println("=============");
    System.out.println("HP: " + HP);
    System.out.println("strength: " + strength);
    System.out.println("defense: " + defense);
    System.out.println("attack: " + attack);
    System.out.println("=============");
  }
}
