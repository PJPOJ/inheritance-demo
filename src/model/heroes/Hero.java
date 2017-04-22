package model.heroes;

public abstract class Hero implements ICanBeAHero {

	protected Hero(String name){
		this.name = name;
	}
	
	protected String name;
	
	protected int availableStatsPoints;
	
	protected int strength;
	protected int defence;
	protected int intelligence;
	protected int dextrity;
	protected int agility;
	protected int speed;
	
	
	public int getAvailableStatsPoints(){
		return this.availableStatsPoints;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getStrength() {
		return strength;
	}
	public int getDefence() {
		return defence;
	}
	public int getIntelligence() {
		return intelligence;
	}
	public int getDextrity() {
		return dextrity;
	}
	public int getAgility() {
		return agility;
	}
	public int getSpeed() {
		return speed;
	}
	
	public void levelUp(){
		availableStatsPoints+=10;
	}
	

	public void raiseStr(){
		if(availableStatsPoints<=0)return;
		modifyStr();
		availableStatsPoints--;		
	}
	
	public void raiseDef(){
		if(availableStatsPoints<=0)return;
		modifyDef();
		availableStatsPoints--;	
	}
	
	public void raiseInt(){
		if(availableStatsPoints<=0)return;
		modifyInt();
		availableStatsPoints--;
	}
	
	public void raiseDex(){
		if(availableStatsPoints<=0)return;
		modifyDex();
		availableStatsPoints--;
	}
	
	public void raiseAgi(){
		if(availableStatsPoints<=0)return;
		modifyAgi();
		availableStatsPoints--;
		}
	
	public void raiseSpd(){
		if(availableStatsPoints<=0)return;
		modifySpd();
		availableStatsPoints--;
		}

	protected abstract void modifyStr();
	protected abstract void modifyDef();
	protected abstract void modifyDex();
	protected abstract void modifyInt();
	protected abstract void modifyAgi();
	protected abstract void modifySpd();
	
}
