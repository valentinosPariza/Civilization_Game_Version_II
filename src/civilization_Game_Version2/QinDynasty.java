package civilization_Game_Version2;
/**
 * This class is responsible for representing the Chinese Dynasty civilization and its functions.Every Civilization as 
 * the others has their Treasury,their Strategy,their Technology,Population and more which all these are objects which 
 * are used to define better their purpose.The similar attributes which this class has with the others are 
 * inherit from the {@linkplain civilization_Game_Version2.Civilizations} class.This class has unique methods,and its unique place is 
 * Hills.
 * Instance variables: 

 * {@linkplain civilization_Game_Version2.QinDynasty#Hills}

 * One Constructor: 
 * {@linkplain civilization_Game_Version2.QinDynasty#QinDynasty()}
 * And instance methods:
 * {@linkplain civilization_Game_Version2.QinDynasty#buildHouse(Settlement)}
 * {@linkplain civilization_Game_Version2.QinDynasty#buildWall(Settlement)}
 * {@linkplain civilization_Game_Version2.QinDynasty#getHills()}
 * {@linkplain civilization_Game_Version2.QinDynasty#establishLegalism()}
 * 


 * 
 * 
 * 
 * @author Valentinos Pariza(vpariz01)
 * @version 1.0.1
 * @since 5/3/2018
 *
 */
public class QinDynasty extends Civilizations{

	private Hills mountains;

	
	
	
	/**
	 * A constructor of an object type of QinDynasty .This constructor like the constructors of the other civilizations
	 * create new objects(the corresponding type of  object for the each attribute) for all the attributes of this
	 *  class which are objects.It uses constructor {@linkplain civilization_Game_Version2.Civilizations#Civilizations(String)} from 
	 *  superclass  {@linkplain civilization_Game_Version2.Civilizations}.
	 * 
	 * @author valentinos Pariza 
	 * @since 5/3/2018
	 * @return
	 */
	public QinDynasty() {

		super("Yangtze");

		this.mountains = new Hills();
	}

	
	


	
	/**
	 *  This method checks if a Wall can be built in an object type of Settlement ,
     * having characteristics of the cost and the workers needed for building it
	 * 
	 * @param settlement settlement the settlement inside of it the building will be built
	 * @author valentinos Pariza
	 * @since 5/3/2018
	 * @return true if the wall can be built or false otherwise
	 */
	public boolean buildWall(Settlement settlement) {

		if (settlement.build(this.getTreasury().getCoins(), getPopulation(), 1000, 100)) {
			this.getPopulation().canwork(100);
			this.getTechnology().increaseExperience(10);
			return this.getTreasury().spend(1000);
		}
		return false;
	}

	
	/**
	 *  This method checks if a House can be built in an object type of Settlement ,
     * having characteristics of the cost and the workers needed for building it
	 * 
	 * @param settlement settlement the settlement inside of it the building will be built
	 * @author valentinos Pariza
	 * @since 5/3/2018
	 * @return true if the House has been built or false otherwise
	 */
	public boolean buildHouse(Settlement settlement){
		
		if( settlement.build(this.getTreasury().getCoins(), getPopulation(), 30, 8))  {
			
			this.getPopulation().canwork(8);
			this.getTechnology().increaseExperience(10);
			return this.getTreasury().spend(30);
		}
		return false;
	}

	
	/**
	 * This method is used in order to represent the studying of Legalism by the Chinese.This method calls method
	 * {@linkplain civilization_Game_Version2.Technology#philosophize()} in order to increase the understanding of the civilization
	 * in object type of Technology.But also reduce the Happiness of Civilians by using the method 
	 * {@linkplain civilization_Game_Version2.Population#decreaseHappiness(int)} .
	 * 
	 * @author valentinos Pariza 
	 * @since 5/3/2018
	 * @return
	 */
	public void establishLegalism() {
		if (this.getPopulation().getHappiness() - 20 >= 0) {
			this.getTechnology().philosophize();
			this.getPopulation().decreaseHappiness(20);
		}

	}

	
	
	
	
	/**
	 * returns the Hills object of this civilization,representing the Hills which are supposed to appeared at this 
	 * civilization
	 * 
	 * @author valentinos Pariza 
	 * @since 5/3/2018
	 * @return  the object type of Technology which is attribute of this class civilization
	 */
	public Hills getHills() {
		return this.mountains;
	}



}
