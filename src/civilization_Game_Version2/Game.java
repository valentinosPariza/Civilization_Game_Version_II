package civilization_Game_Version2;

/**
 * 
 * This class is used for representing the hunting food in the game as objects.Although this class is a more 
 * special Food which inherits from class {@linkplain civilization_Game_Version2.Food}.It inherits all the the attributes,non-private
 * methods which are not final.
 * This class contains 
 * Instance variables: {@linkplain civilization_Game_Version2.Game#healthIncrease}
 * {@linkplain civilization_Game_Version2.Building#workersRequired} 
 * Two Constructors:
 * {@linkplain civilization_Game_Version2.Game#Game()}
 * {@linkplain civilization_Game_Version2.Game#Game(Game)}
 * One Copy constructor:
 * {@linkplain civilization_Game_Version2.Game#Game(Game)}
 * 
 * 
 * 
 * @author Valentinos Pariza(vpariz01)
 * @version 1.0.1
 * @since 5/3/2018
 *
 */
public class Game extends Food{


	/**
	 * Copy Constructor for copying the only attribute of an object type of Game to a new Game Object.It uses copy 
	 * constructor {@linkplain civilization_Game_Version2.Food#Food(Food)} of superclass {@linkplain civilization_Game_Version2.Food}
	 *
	 * 
	 * @author valentinos Pariza 
	 * @since 5/3/2018
	 * @return
	 * @param oldGame
	 */
	public Game(Game oldGame)
	{
		super(oldGame);
	}
	
	
	/**
	 * This constructor creates an object type of Game with a given quantity of food(health points) using a constructor
	 *  {@linkplain civilization_Game_Version2.Food} of the superclass {@linkplain civilization_Game_Version2.Food}.
	 * 
	 * @author valentinos Pariza 
	 * @since 5/3/2018
	 * @param health represents the health points which the object will store 
	 * @return 
	 */
	public Game(int healthPoints) {
		super(healthPoints);
		
	}

	/**
	 * This constructor creates an object type of Game by using the constructor {@linkplain civilization_Game_Version2.Food#Food()} 
	 * from superclass {@linkplain civilization_Game_Version2.Food#Food()} for creating a standard object containing of 20 health points
	 *  of food.
	 * 
	 * @author valentinos Pariza 
	 * @since 5/3/2018
	 * @return 
	 */
	public Game() {
		super();
	}

	
}
