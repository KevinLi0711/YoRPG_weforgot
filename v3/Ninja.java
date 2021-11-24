public class Ninja extends Protagonist{
  HP=50;
  strength=200;
  defense=20;
  attack=0.8;

  public void specialize() {
    if (!specialized) {
      specialized = true;
      attack = attack * 3;
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
    String s="The Ninja has high attack and low defense. Pick them if you want to lose or win quickly.";
    s+="\n HP=50 \n";
    s+="\n strength=200 \n";
    s+="\n defense=20 \n";
    s+="\n attack=0.8 \n";
    return s;
  }
}
