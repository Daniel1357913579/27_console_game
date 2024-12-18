import java.util.Random;
public class Fighter extends Adventurer{
  private int AirSupportLeft;
  private int AirSupportMax;
  public Fighter(){
    super("No One", 20);
    this.AirSupportLeft = 1;
    this.AirSupportMax = 1;
  }
  public Fighter(String name, int hp){
    super(name);
    this.setHP(hp);
    this.setmaxHP(hp);
    this.AirSupportLeft= 1;
    this.AirSupportMax = 1;
  }
  public String getSpecialName(){
    return "Air Support";
  }
  public int getSpecial(){
    return this.AirSupportLeft;
  }
  public void setSpecial(int n){
    this.AirSupportLeft = n;
  }
  public int getSpecialMax(){
    return this.AirSupportMax;
  }

  public String attack(Adventurer other){
    boolean specialRestored = false;
    int damage = ((int)(Math.random()*2)+4);
    other.applyDamage(damage);
    if (Math.random() >= .7){
      specialRestored = true;
      this.restoreSpecial(1);
    }
    String message =  this + " attacked " + other + " and dealt " + damage + " points of damage";
    if (specialRestored){
      message += " and regained Air Support";
    }
    message += ".";
    return message;
  }
  public String support(Adventurer other){
    if (other.getmaxHP() > other.getHP() + 2){
    other.setHP(other.getHP() + 2);
    return this + " tends to " + other + "'s wounds and restored 2 hp";
    }
    return other + "'s MaxHP is full";
  }
  public String support(){
    if (this.getmaxHP() > this.getHP() + 5){
    this.setHP(this.getHP() + 5);
    return this + "tends to their own wounds and restored 5 hp";
  }
    return this + "'s MaxHP is full";
  }
  public String specialAttack(Adventurer other){
    if (this.getSpecial() > 0){
    int damage = ((int)(Math.random()*6) + 6);
    other.applyDamage(damage);
    return this + " calls in Air Support and hits " + other + " for " + damage + " damage.";
    }
      return this + " does not have Air Support.";
  }		
}
