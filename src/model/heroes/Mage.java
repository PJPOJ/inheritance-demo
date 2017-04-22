package model.heroes;

public class Mage extends Hero{

	public Mage(String name) {
		super(name);
	}

	@Override
	protected void modifyStr() {
		strength++;
	}

	@Override
	protected void modifyDef() {
		defence++;
		
	}

	@Override
	protected void modifyDex() {
		dextrity=(int)((dextrity+1)/1.05);
		dextrity++;
		dextrity*=1.05;
	}

	@Override
	protected void modifyInt() {

		intelligence=(int)((intelligence+1)/1.2);
		intelligence++;
		intelligence*=1.2;
	}

	@Override
	protected void modifyAgi() {
		agility=(int)((agility+1)/1.02);
		agility++;
		agility*=1.02;
	}

	@Override
	protected void modifySpd() {
		speed++;
	}
	
}
