public class Character {

    protected int HP;
    protected int strength;
    protected int defense;
    protected double attack;
    protected String name;
  
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
  
    public void printStats() {
      System.out.println("=============");
      System.out.println("HP: " + HP);
      System.out.println("strength: " + strength);
      System.out.println("defense: " + defense);
      System.out.println("attack: " + attack);
      System.out.println("=============");
    }
  }
  