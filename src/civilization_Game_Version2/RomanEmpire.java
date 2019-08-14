package civilization_Game_Version2;
/**
 * This class is responsible for representing the Roman Empire civilization and its functions.Every Civilization as 
 * the other such as their Treasury,their Strategy,their Technology,Population and more which all these are objects  
 * which are used to define better their purpose.The similar attributes which this class has with the others are 
 * inherit from the {@linkplain civilization_Game_Version2.Civilizations} class. This class has unique methods,and its unique place 
 * is Hills.
 * Instance variables:
 * {@linkplain civilization_Game_Version2.RomanEmpire#mountains}
 * One Constructor: 
 * {@linkplain civilization_Game_Version2.RomanEmpire#RomanEmpire()}
 * And instance methods:
 * {@linkplain civilization_Game_Version2.RomanEmpire#buildAqueduct(Settlement)}
 * {@linkplain civilization_Game_Version2.RomanEmpire#buildBathHouse(Settlement)}
 * {@linkplain civilization_Game_Version2.RomanEmpire#buildVilla(Settlement)}
 * {@linkplain civilization_Game_Version2.RomanEmpire#getHills()}
 * {@linkplain civilization_Game_Version2.RomanEmpire#studyPhilosophy()}

 * 
 * 
 * 
 * @author Valentinos Pariza(vpariz01)
 * @version 1.0.1
 * @since 5/3/2018
 *
 */
public class RomanEmpire extends Civilizations{
	
	
	private Hills mountains;

	
	/**
	 * A constructor of an object type of RomanEmpire .This constructor like the constructors of the other civilizations
	 * create new objects(the corresponding type of  object for the each attribute) for all the attributes of the
	 *superclass and one for this class(subclass) which are objects.It uses constructor 
	 *{@linkplain civilization_Game_Version2.Civilizations#Civilizations(String)} from superclass  {@linkplain civilization_Game_Version2.Civilizations}.
	 * 
	 * @author valentinos Pariza 
	 * @since 5/3/2018
	 * @return
	 */
	public RomanEmpire() {

		super("Tiber");
		this.mountains = new Hills();

	}

	
	

	
	/**
	 *  This method checks if an Aqueduct  can be built in an object type of Settlement ,
     * having characteristics of the cost and the workers needed for building it
     * 
	 * @param settlement settlement the settlement inside of it the building will be built
	 * @author valentinos Pariza
	 * @since 5/3/2018
	 * @return true if the Aqueduct has been  built or false otherwise
	 */
	public boolean buildAqueduct(Settlement settlement) {

		if (settlement.build(this.getTreasury().getCoins(), this.getPopulation(), 250, 130)) {
			
			this.getPopulation().canwork(130);
			this.getTechnology().increaseExperience(10);
			return this.getTreasury().spend(250);
		}
		return false;
	}

	
	/**
	 *  This method checks if a Bath House can be built in an object type of Settlement ,
     * having characteristics of the cost and the workers needed for building it
	 * 
	 * @param settlement the settlement inside of it the building will be built
	 * @author valentinos Pariza
	 * @since 5/3/2018
	 * @return true if the Bath House has been  built or false otherwise
	 */
	public boolean buildBathHouse(Settlement settlement) {

		if (settlement.build(this.getTreasury().getCoins(), this.getPopulation(), 110, 20)) {
			
			this.getPopulation().canwork(20);
			this.getTechnology().increaseExperience(10);
			return this.getTreasury().spend(110);
		}
		return false;
	}

	
	/**
	 *  This method checks if a Villa can be built in an object type of Settlement ,
     * having characteristics of the cost and the workers needed for building it
	 * 
	 * @param settlement the settlement inside of it the building will be built
	 * @author valentinos Pariza
	 * @since 5/3/2018
	 * @return true if the Bath House has been  built or false otherwise
	 */
	public boolean buildVilla(Settlement settlement) {

		if (settlement.build(this.getTreasury().getCoins(), this.getPopulation(), 80, 15)) {
			this.getPopulation().canwork(15);
			this.getTechnology().increaseExperience(5);
			return this.getTreasury().spend(80);
		}
		return false;
	}

	
	
	/**
	 * This method is used in order to represent the studying of Philosophy by the Romans.This method calls method
	 * {@linkplain civilization_Game_Version2.Technology#philosophize()} in order to increase the understanding of the civilization
	 * in object type of Technology.But also reduce the Happiness of Civilians by using the method. 
	 * {@linkplain civilization_Game_Version2.Population#decreaseHappiness(int)}
	 * 
	 * @author valentinos Pariza 
	 * @since 5/3/2018
	 * @return
	 */
	public void studyPhilosophy() {
		if (this.getPopulation().getHappiness() - 10 >= 0) {
			this.getTechnology().philosophize();
			this.getPopulation().decreaseHappiness(10);

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