public class Firebender extends Monster {
    int burn = 5;

    public Firebender(){
        super();
        defense = 40;
        attack = .5;
    }
    
    public int attack(Character opponent) {
        int damage = (int)( (strength * attack) - opponent.getDefense() );
        burn += 5;

        if ( damage < 0 )
          damage = 0;
    
        opponent.lowerHP( damage );
        opponent.lowerHP( burn );

        return damage + burn;
    }

    public static String about() {
        return 
        "Firebenders have low attack, but high defense. They can bypass defense with their burn effect, which deals more damage each time they attack";
    }
}
