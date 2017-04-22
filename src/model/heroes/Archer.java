package model.heroes;

public class Archer extends Hero{

	public Archer(String name) {
		super(name);
	}

	@Override
	protected void modifyStr() {
		strength=(int)((strength+1)/1.05);
		strength++;
		strength*=1.05;
		
	}

	@Override
	protected void modifyDef() {
		defence=(int)((defence+1)/1.05);
		defence++;
		defence*=1.05;
	}

	@Override
	protected void modifyDex() {
		dextrity=(int)((dextrity+1)/1.2);
		dextrity++;
		dextrity*=1.2;
	}

	@Override
	protected void modifyInt() {
		intelligence++;
		
	}

	@Override
	protected void modifyAgi() {
		agility=(int)((agility+1)/1.1);
		agility++;
		agility*=1.1;
	}

	@Override
	protected void modifySpd() {
		speed=(int)((speed+1)/1.05);
		speed++;
		speed*=1.05;
	}
	
}
