import java.util.Random;
public class Sniper extends Adventurer{
  private int BurstsLeft;
  private int BurstsMax;
  public Sniper(){
    super("Snipper", 18);
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
    if (Math.random() >= .85){
      specialRestored = true;
      this.restoreSpecial(1);
    }
    String message =  this + " attacked " + other + " and dealt " + damage + " points of damage";
    if (specialRestored){
      message += " and might have regained a Burst";
    }
    message += ".";
    return message;
  }
  public String support(Adventurer other){
    if (other.getmaxHP() > other.getHP() + 3){
    other.setHP(other.getHP() + 4);
    return this + " used a tournaquet on  " + other + " and restored 5 hp";
    }
    return other + "'s HP is full";
  }
  public String support(){
    if (this.getmaxHP() > this.getHP() + 2){
    this.setHP(this.getHP() + 3);
    return this + "uses a tournaquet on themself and restored 5 hp";
  }
    return this + "'s HP is full. They do not need a tournaquet.";
  }
  public String specialAttack(Adventurer other){
    if (this.getSpecial() > 0){
      int damage = ((int)(Math.random()*3) + 3);
      int dmg1 = damage;
      other.applyDamage(damage);
      damage = ((int)(Math.random()*3) + 2);
      int dmg2 = damage;
      other.applyDamage(damage);
      damage = ((int)(Math.random()*2) + 2);
      int dmg3 = damage;
      other.applyDamage(damage);
      return this + "'s burst dealt " + dmg1 + ", "+ dmg2 + ", and " + dmg3 + " damage at " + other + "! That's " + (dmg1 + dmg2 + dmg3) + "damage total!";
    }
      return this + " does not have any more Bursts";
  }
}
