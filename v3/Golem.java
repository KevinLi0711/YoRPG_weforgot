public class Golem extends Monster{

    public Golem(){
        super();
        HP = 200;
        defense = 40;
        attack = .5;
    }
    
    public int attack(Character opponent) {
        int damage = (int)( (strength * attack) - opponent.getDefense() );
        if (Math.random() <= .1) {
            damage += ( (200 - HP) / 4);
        }

        if ( damage < 0 )
          damage = 0;
    
        opponent.lowerHP( damage );
    
        return damage;
    }

    public static String about() {
        return 
        "The golem class has low attack, but high HP and defense. In its damage calculation, the golem has a 10% chance to deal additional damage based on its missing HP";
    }
}
