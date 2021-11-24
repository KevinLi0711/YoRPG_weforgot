public class Gambler extends Protagonist{

    public Gambler(String name){
        super(name);
        HP = 150;
        strength = 200;
        attack = .2;
    }
    
    public int attack(Character opponent) {
        int damage = (int)( (strength * attack) - opponent.getDefense() );

        if ( damage < 0 )
          damage = 0;
    
        opponent.lowerHP( damage );
    
        return damage;
    }
    
    
  public void specialize() {
    if (!specialized) {
      specialized = true;
      defense -= defChange;
    }
    
    if (Math.random() <= .5) {
    	attack = .8;
    } else attack = .2;
  }

  public void normalize() {
    if (specialized) {
      specialized = false;
      attack = .2;
      defense += defChange;
    }
  }

    public static String about() {
        return "The Gambler has a high strength but low attack. Its special attack has a chance to increase its attack significantly but it also has a chance to fail."; 
    }
}
