package civilization_Game_Version2;

/**
 * 
 * This class is used for representing the fish in the game as objects.In this object some functions and attributes
 * of the fish as Food for people ,is used for succeeding the purpose of the game!Although this class is a more 
 * special Food which inherits from class {@linkplain civilization_Game_Version2.Food}.It inherits all the the attributes,non-private
 * methods which are not final.
 * This class contains:
 * One Instance attribute:
 * {@linkplain civilization_Game_Version2.Fish#healthIncrease} 
 * One Instance Methods:
 * {@linkplain civilization_Game_Version2.Fish#getHealth()} 
 * Two Constructors:
 * {@linkplain civilization_Game_Version2.Fish#Fish()} 
 * {@linkplain civilization_Game_Version2.Fish#Fish(int)}  
 * A copy constructor:
 *  {@linkplain civilization_Game_Version2.Fish#Fish(Fish)}
 * 
 *  
 *  
 * 
 * 
 * @author Valentinos Pariza(vpariz01)
 * @version 1.0.1
 * @since 5/3/2018
 *
 */

public class Fish extends Food {

	/**
	 * Copy Constructor for copying the only attribute of an object type of Fish to a new Fish Object.It uses copy 
	 * constructor {@linkplain civilization_Game_Version2.Food#Food(Food)} of superclass {@linkplain civilization_Game_Version2.Food}
	 * 
	 * @author valentinos Pariza 
	 * @since 5/3/2018
	 * @param fish Object fish
	 * @return
	 */
	public Fish(Fish fish) {
		super((Food)fish);
		
	}

	/**
	 *A constructor which creates an Object type of Fish having health points as indicated by the integer parameter. 
	 *This constructor uses constructor {@linkplain civilization_Game_Version2.Food#Food(int)} from superclass to create a food object
	 *for Fish.
	 * 
	 * @author valentinos Pariza 
	 * @since 5/3/2018
	 * @param heatlth representing the quantity of food in a fish/or a group of fish
	 * @return
	 */
	public Fish(int healthpoints) {
		super(healthpoints);
	}

	/**
	 *A constructor which creates an Object type of fish .It uses this {@linkplain civilization_Game_Version2.Food#Food()}
	 *constructor for creating a standard object Fish using constructor from parent class(superclass).  
	 *
	 * 
	 * @author valentinos Pariza 
	 * @since 5/3/2018
	 * @return
	 */
	public Fish() {
		super();
	}

	
}