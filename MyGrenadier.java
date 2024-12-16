import java.util.Random;
public class MyGrenadier extends Adventurer{
	private int molotovsLeft;
	private int molotovsMax;
	private boolean isSupported;
	public MyGrenadier(){
		this("NoName");
	}
	public MyGrenadier(String name, int hp){
		this(name);
		this.setHP() = hp;
		this.setmaxHP() = hp;
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
		int damage = ((int)(Math.random()*6)+4);
		other.applyDamage(damage);
		if (Math.random() >= .9){
			specialRestored = true;
			restoreSpecial(1);
		}
		String message =  this + " attacked " + other + " and dealt " + damage + "points of damage";
		if (specialRestored){
			message += " and regained 1 molotov";
		}
		message += ".";
		return message;
	}
	public String support(Adventurer other){
		other.setHP(other.getHP() + 3);
		return this + " gives an energy drink to " + other + " and restores 3 hp";
	}
	public String support(){
		this.setHP(this.getHP() + 4);
		return this + "	drinks an energy drink and restores 4 hp";
	}
	public String specialAttack(Adventurer other){
		if (this.getSpecial() > 0){
		int damage = ((int)(Math.random()*10) + 2);
		other.applyDamage(damage);
		return this + " throws a molotov and hits " + other + " for " + damage + ".";
		}
			return this + " does not have any molotovs.";
	}		
}
