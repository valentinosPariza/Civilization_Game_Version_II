package civilization_Game_Version2;
/**
 * 
 * This class is used to represent the food-health points of a civilization.This class is going to be used as a
 *  superclass for subclasses {@linkplain civilization_Game_Version2.Fish} and {@linkplain civilization_Game_Version2.Game}.This class inherits from
 *  class {@linkplain civilization_Game_Version2.Resources#Resources()} as it represents a more special resource.Although this class 
 *  is used in order to give a basic structure of inheritance in this program.This class does not  have any methods or
 *   attributes but is used in order to expand in future the program.
 *    This class contains :
 *   Instance variables: 
 * {@linkplain civilization_Game_Version2.Food#healthIncrease} 
 * One Static final variable(constant):
 * {@linkplain civilization_Game_Version2.Food#INITIAL_HEALTHINCREASE} 
 * One Constructor:
 * {@linkplain civilization_Game_Version2.Food#Food()} 
 * {@linkplain civilization_Game_Version2.Food#Food(int)} 
 * One Copy Constructor:
 * {@linkplain civilization_Game_Version2.Food#Food(Food)} 
 *  And instance methods:
 * {@linkplain civilization_Game_Version2.Food#getHealth()} 
 *   
 *  
 *  
 * 
 * 
 * 
 * @author Valentinos Pariza(vpariz01)
 * @version 1.0.1
 * @since 4/3/2018 
 *
 */
public class Food extends Resources{
	
	private int healthIncrease;			//  represents the quantity of food
	
	public static final int INITIAL_HEALTH_INCREASE=20;
	
	
	/**
	 *  Creates an object type of Food with initial healtIncrease points as indicated by the integer parameter which 
	 *  is given when calling the constructor.
	 *
	 * 
	 * @author valentinos Pariza
	 * @since 5/3/2018
	 */
	public Food(int healthpoints) 
	{
		super();
		this.healthIncrease=healthpoints;
	}
	
	
	
	/**
	 *  Creates an object type of Food with initial healtIncrease point 20. 
	 *
	 * 
	 * @author valentinos Pariza
	 * @since 5/3/2018
	 */
	public Food()
	{
		this(INITIAL_HEALTH_INCREASE);
	}
	
	/**
	 *  Copy constructor for creating a new object type of Food having inside the integer value  healtIncrease (health
	 *  points) of the oldFood.It uses the copy constructor {@linkplain civilization_Game_Version2.Resources#Resources(Resources)} of 
	 *  class  {@linkplain civilization_Game_Version2.Resources} . 
	 *
	 * 
	 * @author valentinos Pariza
	 * @param oldFood the object type of {@linkplain civilization_Game_Version2.Food} which is used to copy its attributes to a new
	 * object
	 * @since 5/3/2018
	 */
	public Food(Food oldFood)
	{
		super(oldFood);
		this.healthIncrease=oldFood.healthIncrease;
	}
	
	
	/**
	 * A getter method which returns the attribute {@linkplain civilization_Game_Version2.Food#healthIncrease}  of the Class  
	 *
	 * 
	 * @author valentinos Pariza 
	 * @since 5/3/2018
	 * @return the value of the food (the points of health that can give to a  Civilization from food)
	 */
	public int getHealth() {
		return healthIncrease;

	}
	
}
