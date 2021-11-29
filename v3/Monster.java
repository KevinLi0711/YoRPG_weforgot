public class Monster extends Character{

  public Monster() {
    HP = 150;
    strength = 20 + (int)( Math.random() * 45);
    defense = 20;
    attack = 1;
  }

  public String about() {
    if (description.equals("")) {
      description += "Your standard traveler";
    } 
    return super.about();}
}
