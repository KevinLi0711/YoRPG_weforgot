public class Ninja extends Protagonist{
  public Ninja(String name){
    super(name);
    HP=50;
    strength=200;
    defense=20;
    attack=0.8;
  }


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

  public String about(){
    description = "The Ninja has high attack and low defense. Pick them if you want to lose or win quickly.";
    return super.about(); 
  }
}
