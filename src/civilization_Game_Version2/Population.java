package civilization_Game_Version2;

import java.util.Random;
/**
 * This class is responsible for representing the population of a civilization.It has many attribute as many as 
 * methods in order to increase,decrease the attributes of this class and also make some functions with the population.
 * This class contains
 * Instance variables: 
 * {@linkplain civilization_Game_Version2.Population#civilans}
 * {@linkplain civilization_Game_Version2.Population#happiness}
 * {@linkplain civilization_Game_Version2.Population#rand}
 * {@linkplain civilization_Game_Version2.Population#warriors}
 * A static contant attribute of the class:
 * {@linkplain civilization_Game_Version2.Population#TIMES_COAL_BURNS_FOR_PRODUCTION}
 * One Constructor:
 * {@linkplain civilization_Game_Version2.Population#Population()}
 * One CopyConstructor:
 * {@linkplain civilization_Game_Version2.Population#Population(Population)}
 * Instance Methods
 * {@linkplain civilization_Game_Version2.Population#canBattle()}
 * {@linkplain civilization_Game_Version2.Population#canCook(Fish, CoalMine)}
 * {@linkplain civilization_Game_Version2.Population#canCook(Game, CoalMine)}
 * {@linkplain civilization_Game_Version2.Population#canwork(int)}
 * {@linkplain civilization_Game_Version2.Population#decreaseHappiness(int)}
 * {@linkplain civilization_Game_Version2.Population#fish(River)}
 * {@linkplain civilization_Game_Version2.Population#getCivilians()}
 * {@linkplain civilization_Game_Version2.Population#getHappiness()}
 * {@linkplain civilization_Game_Version2.Population#getWarriors()}
 * {@linkplain civilization_Game_Version2.Population#hunt(Hills)}
 * {@linkplain civilization_Game_Version2.Population#increase_population()}
 * {@linkplain civilization_Game_Version2.Population#increaseHappiness(int)}
 * {@linkplain civilization_Game_Version2.Population#setWarriors(int)}
 * 
 * 
 * 
 * @author Valentinos Pariza(vpariz01)
 * @version 1.0.1
 * @since 5/3/2018
 *
 */
public class Population {
	
	private Random rand = new Random();
	private int civilans;			// the amount of civilans of a population
	private int warriors;			//  the amount of warriors of a population
	private int happiness;			// represents happiness of a population

	private static final int TIMES_COAL_BURNS_FOR_PRODUCTION = 4;   // the times coal must be burnt for a production 

	/**
	 * A copy  constructor for creating an object type of Population ,image of an other object type of Population.
	 * 
	 * @author valentinos Pariza 
	 * @since 6/3/2018
	 * @param oldPopulation indicating an object type of Population which is used to copy from it all ots attributes to 
	 * a new one
	 * @return
	 */
	public Population(Population oldPopulation) {
		this.civilans=oldPopulation.civilans;
		this.warriors=oldPopulation.warriors;
		this.happiness=oldPopulation.happiness;
	}
	
	
	/**
	 * A constructor for creating an object type of Population .
	 * 
	 * @author valentinos Pariza 
	 * @since 5/3/2018
	 * @return
	 */
	public Population() {
		this.warriors = 50;
		this.civilans = 50;
		this.happiness = 200;
	}

	
	/**
	 * this method increases the amount of happiness in a population object
	 * 
	 * @author valentinos Pariza 
	 * @since 5/3/2018
	 * @return
	 */
	public void increaseHappiness(int happyincrease) {
		this.happiness += happyincrease;
	}

	
	/**
	 * this method decreases the amount of happiness in a population object
	 * 
	 * @author valentinos Pariza 
	 * @since 5/3/2018
	 * @return
	 */
	public void decreaseHappiness(int happydecrease) {
		if(this.happiness-happydecrease>=0)
		this.happiness -= happydecrease;
	}

	
	/**
	 * Checks whether a population has civilans to work.Compares if the workers needed are less or equal to the 
	 * available amount of Civilans.If there are enough civilans it reduces the amount of them and returns true
	 * otherwise false
	 *  
	 * @author valentinos Pariza 
	 * @since 5/3/2018
	 * @param workers the workers needed for a job
	 * @return	true if there are enough workers,false otherwise
	 */
	public boolean canwork(int workers) {
		if (this.civilans >= workers) {
			this.civilans -= workers;
			return true;
		}
		return false;
	}

	
	/**
	 * This method gives the next object Game from an array(attribute) of object type of Game.This method calls the
	 * method {@linkplain civilization_Game_Version2.Hills#hunt()} in order to simulate the action of hunt and return the food gained
	 * from hunt as an object type of Game 
	 * 
	 * @param hill an object type of Hills which is used in order to take from the array (type of Game)inside of it 
	 * the next object type of Game
	 * 
	 * @author valentinos Pariza 
	 * @since 5/3/2018
	 * @return  an object type of Hill which represents the food taken by fish from river
	 */
	public Game hunt(Hills hill) {
		return hill.hunt();
	}

	
	/**
	 * This method gives the next object Fish from an array(attribute) of object type of River 
	 * 
	 * @param river an object type of River which is used in order to take from the array inside of it the next object 
	 * Fish
	 * @author valentinos Pariza 
	 * @since 5/3/2018
	 * @return  an object type of Fish which represents the food taken by fish from river
	 */
	public Fish fish(River river) {
		return river.getFish();
	}

	
	
	/**
	 * This method has purpose to determine if there are enough recourses for increasing population and increase it 
	 * if there is,else return a false(boolean value) which represents the failure of increasing population
	 * This method uses method {@linkplain civilization_Game_Version2.Population#increase_population()} for increasing population.
	 * 
	 * @author valentinos Pariza 
	 * @since 5/3/2018
	 * @param hunted Game object which determines the food(health points) used to increase population
	 * @param coalmined represents the coals which appearing in an object CoalMine
	 * @return true if the coal and the health points from the Object Game are enough to increase population
	 */
	public boolean canCook(Game hunted, CoalMine coalmined) {

		if (hunted == null || coalmined == null)				// if there is not any Fish object(null) sent false
			return false;

		if (coalmined.getCoal() >= TIMES_COAL_BURNS_FOR_PRODUCTION * coalmined.getBurnCost()) {
			for (int i = 0; i < TIMES_COAL_BURNS_FOR_PRODUCTION; i++) {
				this.increase_population();
				coalmined.burn();
			}								// if the available coal is much enough to burn 4 times the cost of 
			return true;					// the coal then the program increases 4 times the population
		}									//  by using th method increase_population
		return false;
	}

	
	
	/**
	 * This method has purpose to determine if there are enough recourses for increasing population and increase it 
	 * if there is,else return a false(boolean value) which represents the failure of increasing population.
	 * This method uses method {@linkplain civilization_Game_Version2.Population#increase_population()} for increasing population.
	 * 
	 * @author valentinos Pariza 
	 * @since 5/3/2018
	 * @param fish Fish object which determines the food(health points) used to increase population
	 * @param coalmined represents the coals which appearing in an object CoalMine
	 * @return true if the coal and the health points from the Object Fish are enough to increase population
	 */
	public boolean canCook(Fish fish, CoalMine coalmined) {

		if (fish == null || coalmined == null)		// if there is not any Fish object(null) sent false
			return false;

		if (coalmined.getCoal() >= TIMES_COAL_BURNS_FOR_PRODUCTION * coalmined.getBurnCost()) {

			for (int i = 0; i < TIMES_COAL_BURNS_FOR_PRODUCTION; i++)
				coalmined.burn();

			this.increase_population();
			return true;
			}
											// if the available coal is much enough to burn 4 times the cost of 
											// the coal then the program increases 1 time the population
											//  by using the method increase_population
		
		return false;
	}

	
	/**
	 * This method increases population by 15 civilians and by 10 warriors(attributes of object of this class)
	 * 
	 * @author valentinos Pariza 
	 * @since 5/3/2018
	 * @return
	 */
	private void increase_population() {
		this.civilans += 15;
		this.warriors += 10;
	}

	
	
	/**
	 * This method checks whether a population has warriors to battle and also simulates the lose of the warriors in
	 * a battle(the limit number of warriors to battle and the warriors loses are set randomly )   
	 * 
	 * @author valentinos Pariza 
	 * @since 5/3/2018
	 * @return true if the battle was made,false otherwise
	 */
	public boolean canBattle() {
		if (warriors > rand.nextInt(100)) {
			warriors -= rand.nextInt(20);
			return true;
		}
		return false;
	}

	/**
	 * This method returns the integer representation for Civilians which is an attribute of an object type of this 
	 * class
	 * 
	 * @author valentinos Pariza 
	 * @since 5/3/2018
	 * @return the integer amount of  Civilians
	 */
	public int getCivilians() {
		return this.civilans;
	}

	
	/**
	 * This method returns the integer representation for Warriors which is an attribute of an object type of this 
	 * class
	 * 
	 * @author valentinos Pariza 
	 * @since 5/3/2018
	 * @return the integer amount of  Warriors
	 */
	public int getWarriors() {
		return this.warriors;
	}

	
	/**
	 * This method returns the integer amount of Happiness which is an attribute of an object type of this 
	 * class
	 * 
	 * @author valentinos Pariza 
	 * @since 5/3/2018
	 * @return the integer amount of Happiness
	 */
	public int getHappiness() {
		return this.happiness;
	}

	/**
	 * This method sets the amount of the warriors in a Population object 
	 * 
	 * @author valentinos Pariza 
	 * @since 5/3/2018
	 * @param set integer number of the new amount of warriors 
	 * @return
	 */
	public void setWarriors(int set) {
		this.warriors = set;
	}
}