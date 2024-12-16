class Grenadier extends Adventurer{
	private int RPGsLeft;
	private int RPGsMax;
	private boolean isSupported;
	public Grenadier(){
		this(name, 10);
	}
	public Grenadier(String name, int hp){
		this.name = name;
		this.HP = hp;
		this.maxHP = hp;
	}
	@Override
	public String getSpecialName(){
		return "RPG";
	}
	@Override
	public int getSpecial(){
		return this.RPGsLeft;
	}
	@Override
	public void setSpecial(int n){
		this.RPGsLeft = n;
	}
	@Override
	public int getSpecialMax(){
		return this.RPGsMax;
	}
	@Override
	public String attack(Adventurer other){
		other.applyDamage(400);
		// make an if/else block for if IsSupported == true then deal more damage;
	}
	@Override
	public String support(Adventurer other){
	}
}
