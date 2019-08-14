package civilization_Game_Version2;

/**
 * 
 * This class is used to represent the rivers in the game,as also many of the functions and operations of the an actual
 * river.It also uses objects for attributes from other classes in order to represent better the simulation of a 
 * real river.(such as an array with objects of Fish to represent the Fish in the river which are available at the 
 * moment).This class inherits from class {@linkplain civilization_Game_Version2.Terrains}.It is a special type of Terrain.
 * This class contains:
 * Instance variables: 
 * {@linkplain civilization_Game_Version2.River#fishOfRiver}
 * {@linkplain civilization_Game_Version2.River#name}
 * Two static constants:
 * {@linkplain civilization_Game_Version2.River#NUM_OF_ACCEPTABLE_FISH}  
 * One Constructor:
 * {@linkplain civilization_Game_Version2.River#River(String)}
 * One Copy constructor:
 * {@linkplain civilization_Game_Version2.River#River(River)}
 * And instance methods:
 * {@linkplain civilization_Game_Version2.River#getFish()}
 * {@linkplain civilization_Game_Version2.River#getName()}
 * {@linkplain civilization_Game_Version2.River#replenishFish()}
 * {@linkplain homework3.River#}
 * 
 * 
 * 
 * @author Valentinos Pariza(vpariz01)
 * @version 1.0.1
 * @since 5/3/2018
 *
 */
public class River extends Terrains{
	
	private String name;		// the name of the river
	
	private static final int NUM_OF_ACCEPTABLE_FISH = 5;		// the limit of 5 object type fish in the array
																// of the attribute fishOfRiver
	private Fish[] fishOfRiver;									// array of Fish containing the fish which a player 
																// can fish

	/**
	 * A copy constructor which copies all the attributes of an object type of River which is given as a parameter
	 * ,to a new object type of River.Creates a new array for the attribute  {@linkplain civilization_Game_Version2.River#fishOfRiver}
	 * and assigns to the new array all the fields of the old array(to the corresponding position).Also copies the 
	 * String name of the old River to the new River.It uses constructor 
	 * {@linkplain civilization_Game_Version2.Terrains#Terrains(Terrains) }
	 * 
	 * @author valentinos Pariza 
	 * @since 5/3/2018
	 * @param river an Object type of River which the copy constructor will use to take a copy from it all its
	 * 		attributes
	 * @return
	 */
	public River(River river) {
		super(river);
		this.fishOfRiver = new Fish[NUM_OF_ACCEPTABLE_FISH];
		
		for (int i = 0; i < NUM_OF_ACCEPTABLE_FISH; i++)
			this.fishOfRiver[i] = new Fish(river.fishOfRiver[i]);
		
		this.name = river.name;
	}

	/**
	 * A constructor which creates an object type of River by creating a new array type of {@linkplain civilization_Game_Version2.Fish}
	 * and fills each position of the array with Fish objects which have random health points(each one). Also gives
	 * the name to the River as it was sent as a String (as a parameter).It uses constructor 
	 * {@linkplain civilization_Game_Version2.Terrains#Terrains() }
	 * 
	 * @author valentinos Pariza 
	 * @since 5/3/2018
	 * @param name name of the River
	 * @return
	 */
	public River(String name) {
		super();
		this.fishOfRiver = new Fish[NUM_OF_ACCEPTABLE_FISH];

		for (int i = 0; i < NUM_OF_ACCEPTABLE_FISH; i++)
			this.fishOfRiver[i] = new Fish((int) (Math.random() * 5));

		this.name = name;
	}

	
	/**
	 * A method which checks if there are any fish in the array of fish {@linkplain civilization_Game_Version2.River#fishOfRiver}.
	 * 
	 * @author valentinos Pariza 
	 * @since 5/3/2018
	 * @return	true if there are fish or false if there are not
	 */
	private boolean areThereFish() {

		for (int i = 0; i < NUM_OF_ACCEPTABLE_FISH; i++)
		{															//checks if there is any field of the array which 
			if (this.fishOfRiver[i] != null)						// is not null in order estimate if the array has	
				return true;										// fish
		}
		return false;
	}

	
	/**
	 * This method after checks that there are fish in the array of {@linkplain civilization_Game_Version2.River#fishOfRiver},sends
	 * the next fish object which is available.
	 * 
	 * @author valentinos Pariza 
	 * @since 5/3/2018
	 * @return an object Fish{@linkplain civilization_Game_Version2.Fish}, which represents the next amount of fish that can be fished
	 */
	public Fish getFish() {
		
		if (this.areThereFish()) {
			
			for (int k = 0; k < NUM_OF_ACCEPTABLE_FISH; k++) {
				
				if (this.fishOfRiver[k] != null) {		// finds the next available Fish Object
					Fish copyfish = new Fish(this.fishOfRiver[k].getHealth());
					
					this.fishOfRiver[k] = null;			// Set the position of that array null in order not to use 
														// again this object
					return copyfish;
				}
				
			}
		}

		return null;		// if there are not any fish in the array the program send null(a null-non existence 
							//  reference)
	}

	
	
	/**
	 *This method is used in order to refill the array of object Fish {@linkplain civilization_Game_Version2.River#fishOfRiver} when is
	 *called by checking first that there aren't any object Fish in the array.If refills the array sends true 
	 *otherwise false. 
	 * 
	 * @author valentinos Pariza 
	 * @since 5/3/2018
	 * @return true if the array of Fish {@linkplain civilization_Game_Version2.River#fishOfRiver} was refilled or false otherwise.
	 */
	public boolean replenishFish() {

		if (!this.areThereFish()) {			//  if there are not any fish in the array
			
			for (int i = 0; i < NUM_OF_ACCEPTABLE_FISH; i++)					// refilling the array of objects Fish
				this.fishOfRiver[i] = new Fish((int) (Math.random() * 5));

			return true;			// return true that the array was refilled

		}

		return false;			//return false that the array was not refilled
	}

	/**
	 * This method is a getter method.it returns the string value(the name of the river) of the attribute 
	 *  {@linkplain civilization_Game_Version2.River#name}
	 *  
	 * @author valentinos Pariza 
	 * @since 5/3/2018
	 * @return the String name of the object River
	 */
	public String getName() {
		return this.name;
	}

}
