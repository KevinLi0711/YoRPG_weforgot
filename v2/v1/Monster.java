/*
  class Monster -- Represents random incarnations of 
  the adventurer's natural enemy in Ye Olde RPG
**/

public class Monster extends Character{

  public Monster() {
    super(150, 20 + (int)( Math.random() * 45 ), 20, 1);
    
    /*
    _hitPts = 150;
    _strength = 20 + (int)( Math.random() * 45 ); // [20,65)
    _defense = 20;
    _attack = 1;
    */
  }
}//end class Monster
