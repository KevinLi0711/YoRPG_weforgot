public class Werewolf extends Monster{

    public Werewolf(){
        super();
        HP = 100;
        defense = 15;
        attack = 1.5;
    }
    
    public int attack(Character opponent) {
        int damage = (int)( (strength * attack) - opponent.getDefense() );
        if (Math.random() <= .25) {
            damage += damage * 2;
        }

        if ( damage < 0 )
          damage = 0;
    
        opponent.lowerHP( damage );
    
        return damage;
    }

    public static String about() {
        return 
        "The werewolf class has low HP and defense, but high attack. In its damage calculation, the werewolf has a 25% chance to deal twice as much damage.";
    }
}
