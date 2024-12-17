import java.util.Random;
public class Grenadier extends Adventurer{
  private int molotovsLeft;
  private int molotovsMax;
  public Grenadier(){
    super("NoName");
    this.molotovsLeft = 3;
    this.molotovsMax = 3;
  }
  public Grenadier(String name, int hp){
    super(name);
    this.setHP(hp);
    this.setmaxHP(hp);
    this.molotovsLeft = 3;
    this.molotovsMax = 3;
  }
  public String getSpecialName(){
    return "molotov";
  }
  public int getSpecial(){
    return this.molotovsLeft;
  }
  public void setSpecial(int n){
    this.molotovsLeft = n;
  }
  public int getSpecialMax(){
    return this.molotovsMax;
  }

  public String attack(Adventurer other){
    boolean specialRestored = false;
    int damage = ((int)(Math.random()*5)+4);
    other.applyDamage(damage);
    if (Math.random() >= .9){
      specialRestored = true;
      this.restoreSpecial(1);
    }
    String message =  this + " attacked " + other + " and dealt " + damage + " points of damage";
    if (specialRestored){
      message += " and regained 1 molotov";
    }
    message += ".";
    return message;
  }
  public String support(Adventurer other){
    if (other.getmaxHP() > other.getHP() + 3){
    other.setHP(other.getHP() + 3);
    return this + " gives an energy drink to " + other + " and restored 3 hp";
    }
    return other + "'s MaxHP is full";
  }
  public String support(){
    if (this.getmaxHP() > this.getHP() + 4){
    this.setHP(this.getHP() + 4);
    return this + "drinks an energy drink and restored 4 hp";
  }
    return this + "'s MaxHP is full";
  }
  public String specialAttack(Adventurer other){
    if (this.getSpecial() > 0){
    int damage = ((int)(Math.random()*4) + 8);
    other.applyDamage(damage);
    return this + " throws a molotov and hits " + other + " for " + damage + " damage.";
    }
      return this + " does not have any molotovs.";
  }		
}
