public class Golem extends Monster{

    public Golem(){
        super();
        HP = 200;
        defense = 40;
        attack = .5;
    }
    
    public int attack(Character opponent) {
        int damage = (int)( (strength * attack) - opponent.getDefense() );
        damage += ( (200 - HP) / 3);

        if ( damage < 0 )
          damage = 0;
    
        opponent.lowerHP( damage );
    
        return damage;
    }

    public String about() {
        description = "The golem class has low attack, but high HP and defense. It deals additional damage based on its missing HP";
        return super.about();
    }
}
