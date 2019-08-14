package civilization_Game_Version2;

/**
 * This class is responsible for representing the Egypt civilization and its functions.Every Civilization as the others
 * has their Treasury,their Strategy,their Technology,Population and more which all these are objects which are used
 * to define better their purpose.The similar attributes which this class has with the others are 
 * inherit from the {@linkplain civilization_Game_Version2.Civilizations} class.This class has unique methods,and its unique place is
 *  Desert.
 * Instance variables: 
 
 * {@linkplain civilization_Game_Version2.Egypt#desert}

 * One Constructor: 
 * {@linkplain civilization_Game_Version2.Egypt#Egypt()}
 * And instance methods:
 * {@linkplain civilization_Game_Version2.Egypt#buildPyramid(Settlement)}
 * {@linkplain civilization_Game_Version2.Egypt#practiceHieroglyphics()}
 * {@linkplain civilization_Game_Version2.Egypt#getDesert()}

 * 
 * 
 * 
 * @author Valentinos Pariza(vpariz01)
 * @version 1.0.1
 * @since 5/3/2018
 *
 */
public class Egypt extends Civilizations {



	
	private Desert desert;						// The unique place of Egypt ,Desert

	
	
	/**
	 * A constructor of an object type of Egypt .This constructor like the constructors of the other civilizations
	 * create new objects(the corresponding type of  object for the each attribute) for all the attributes of this
	 *  class which are objects.It uses constructor {@linkplain civilization_Game_Version2.Civilizations#Civilizations(String)} from 
	 *  superclass  {@linkplain civilization_Game_Version2.Civilizations}.
	 * 
	 * @author valentinos Pariza 
	 * @since 5/3/2018
	 * @return
	 */
	public Egypt() {

		super("Nile");
		this.desert = new Desert();

	}


	
	/**
	 *  This method checks if a Pyramid can be built in an object type of Settlement ,
     * having characteristics of the cost and the workers needed for building it
	 * @param settlement	settlement the settlement inside of it the building will be built
	 * @author valentinos Pariza
	 * @since 5/3/2018
	 * @return true if the Pyramid can be built or false otherwise
	 */
	public boolean buildPyramid(Settlement settlement) {
		
		if (settlement.build(this.getTreasury().getCoins(), getPopulation(), 500, 100)) {
			this.getPopulation().canwork(100);
			this.getTechnology().increaseExperience(10);
			return this.getTreasury().spend(500);
		}
		return false;
	}

	
	/**
	 * This method is used in order to represent the studying and practicing of  Hieroglyphics by Egyptians.This method 
	 * calls method {@linkplain civilization_Game_Version2.Technology#improveWriting()} in order to increase the understanding of the 
	 * in object  type of  Technology.But also increase the Happiness of Civilians by using the method 
	 * civilization {@linkplain civilization_Game_Version2.Population#increaseHappiness(int)}.
	 * 
	 * @author valentinos Pariza 
	 * @since 5/3/2018
	 * @return
	 */
	public void practiceHieroglyphics() {
		this.getTechnology().improveWriting();
		this.getPopulation().increaseHappiness(10);
	}

	
	
	
	/**
	 * returns the unique of this classcivilization  Desert  object of this civilization
	 * 
	 * @author valentinos Pariza 
	 * @since 5/3/2018
	 * @return  the object type of Desert which is attribute of this class civilization
	 */
	public Desert getDesert() {
		return this.desert;
	}


}
