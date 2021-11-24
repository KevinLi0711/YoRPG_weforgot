/*
  class Monster -- Represents random incarnations of 
  the adventurer's natural enemy in Ye Olde RPG
**/

public class Monster extends Character{

  public Monster() {
    super(150, 20 + (int)( Math.random() * 45 ), 20, 1);
  }
}//end class Monster
