public class Character {

  protected int HP;
  protected int strength;
  protected int defense;
  protected double attack;
  protected String name;
  protected String description = "";

  public Character() {
    HP = 0;
    strength = 0;
    defense = 0;
    attack = 0;
  }
  
  public Character(String name) {
    this();
    this.name = name;
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

  public String about() {
    description+=("\n" + "=============" + "\n");
    description+=("HP: " + HP + "\n");
    description+=("strength: " + strength + "\n");
    description+=("defense: " + defense + "\n");
    description+=("attack: " + attack + "\n");
    description+=("=============");
    return description;
  }
}
