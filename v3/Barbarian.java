public class Barbarian extends Protagonist{
  public Barbarian(String name){
    super(name);
    HP=150;
    strength=25;
    defense=100;
    attack=0.6;
  }


  public void specialize() {
    if (!specialized) {
      specialized = true;
      attack = attack * 4;
      defense -= defChange;
    }
  }

  public void normalize() {
    if (specialized) {
      specialized = false;
      attack = attack / 3;
      defense += defChange;
    }
  }

  public static String about(){
    String s="The Barbarian has low attack and high defense. Pick them if you want to withstand the monster's attacks.";
    s+="\n HP=150 \n";
    s+="\n strength=25 \n";
    s+="\n defense=100 \n";
    s+="\n attack=0.6 \n";
    return s;
  }
}
