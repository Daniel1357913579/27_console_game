import java.util.Random;
public class Fighter extends Adventurer{
  private int putinCallsLeft;
  private int putinCallsMax;
  public Fighter(){
    super("Kung Fu pAnDa", 30);
    this.putinCallsLeft = 1;
    this.putinCallsMax = 1;
  }

  public Fighter(String name, int hp){
    super(name);
    this.setHP(hp);
    this.setmaxHP(hp);
    this.putinCallsLeft= 1;
    this.putinCallsMax = 1;
  }
  public String getSpecialName(){
    return "Putin";
  }
  public int getSpecial(){
    return this.putinCallsLeft;
  }
  public void setSpecial(int n){
    this.putinCallsLeft = n;
  }
  public int getSpecialMax(){
    return this.putinCallsMax;
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
      message += " and might have regained a chance to call Putin";
    }
    message += ".";
    return message;
  }
  public String support(Adventurer other){
    if (other.getmaxHP() > other.getHP() + 5){
      other.setHP(other.getHP() + 6);
      return this + " tends to " + other + "'s wounds and restored 6 hp";
    }
    return other + "'s HP is full";
  }
  public String support(){
    if (this.getmaxHP() > this.getHP() + 5){
    this.setHP(this.getHP() + 6);
    return this + "tends to their own wounds and restored 6 hp";
  }
    return this + "'s HP is full. They have no wounds.";
  }
  public String specialAttack(Adventurer other){
    if (this.getSpecial() > 0){
      int damage = ((int)(Math.random()*6) + 6);
      other.applyDamage(damage);
      return this + " calls Putin and orders H-Bombs at " + other + ", dealing " + damage + " damage!!";
    }
      return this + " has been abandoned by Putin.";
  }
}
