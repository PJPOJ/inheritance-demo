import model.heroes.Archer;
import model.heroes.Hero;
import model.heroes.ICanBeAHero;
import model.heroes.Knight;
import model.heroes.Mage;

public class Main {

	public static void main(String[] args) {
		Hero mage = new Mage("Gandalf");
		Hero knight = new Knight("Aragorn");
		Hero archer=new Archer("Legolas");
		
		for(int i=0;i<100;i++){

			mage.levelUp();
			mage.raiseAgi();
			mage.raiseDef();
			mage.raiseDex();
			mage.raiseInt();
			mage.raiseSpd();
			mage.raiseStr();

			knight.levelUp();
			knight.raiseAgi();
			knight.raiseDef();
			knight.raiseDex();
			knight.raiseInt();
			knight.raiseSpd();
			knight.raiseStr();

			archer.levelUp();
			archer.raiseAgi();
			archer.raiseDef();
			archer.raiseDex();
			archer.raiseInt();
			archer.raiseSpd();
			archer.raiseStr();
			
		}
		
		printoutHero(mage);
		printoutHero(archer);
		printoutHero(knight);
	}

	static void printoutHero(ICanBeAHero hero){
		System.out.println(hero.getName() +"\t|"
				+ "str: " + hero.getStrength() +"\t|"
				+ "def: " + hero.getDefence()+"\t|"
				+ "int: "+hero.getIntelligence()+"\t|"
				+ "agi: "+hero.getAgility()+"\t|"
				+ "dex: " +hero.getDextrity()+"\t|"
				+ "spd: "+hero.getSpeed()+"\t|"
				);
		System.out.println("-------------------------------------------------------");
	}
	
}
