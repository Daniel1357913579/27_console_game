import java.util.Random;
public class Sniper extends Adventurer{
  private int BurstsLeft;
  private int BurstsMax;
  public Sniper(){
    super("Somebody", 8);
    this.BurstsLeft = 4;
    this.BurstsMax = 4;
  }
  public Sniper(String name, int hp){
    super(name);
    this.setHP(hp);
    this.setmaxHP(hp);
    this.BurstsLeft= 4;
    this.BurstsMax = 4;
  }
  public String getSpecialName(){
    return "Burst";
  }
  public int getSpecial(){
    return this.BurstsLeft;
  }
  public void setSpecial(int n){
    this.BurstsLeft = n;
  }
  public int getSpecialMax(){
    return this.BurstsMax;
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
      message += " and regained a Burst";
    }
    message += ".";
    return message;
  }
  public String support(Adventurer other){
    if (other.getmaxHP() > other.getHP() + 2){
    other.setHP(other.getHP() + 2);
    return this + " used a tournaquet on  " + other + " and restored 2 hp";
    }
    return other + "'s MaxHP is full";
  }
  public String support(){
    if (this.getmaxHP() > this.getHP() + 5){
    this.setHP(this.getHP() + 5);
    return this + "uses a tournaquet on themself and restored 2 hp";
  }
    return this + "'s MaxHP is full";
  }
  public String specialAttack(Adventurer other){
    if (this.getSpecial() > 0){
    int damage = ((int)(Math.random()*3) + 3);
    damage += ((int)(Math.random()*3) + 3);
    damage += ((int)(Math.random()*3) + 3);
    other.applyDamage(damage);
    return this + " shoots " + other + " multiple times for " + damage + " damage.";
    }
      return this + " does not have a Burst";
  }		
}

