package civilization_Game_Version2;

/**
 * 
 * This class represents the buildings in the game.Is class-type of objects
 * which creates objects type of building. These objects are used to represent
 * the existence of buildings which every civilization has.In this class there
 * are two private instance fields in this class and two instance methods.
 * Instance variables: {@linkplain civilization_Game_Version2.Building#cost}
 * {@linkplain civilization_Game_Version2.Building#workersRequired} Two Constructors:
 * {@linkplain civilization_Game_Version2.Building#Building(int, int)}
 * {@linkplain civilization_Game_Version2.Building#Building(Building)}
 * 
 * 
 * 
 * @author Valentinos Pariza(vpariz01)
 * @version 1.0.1
 *  @since 4/3/2018
 *
 */

public class Building {
	private int cost; // instance variable representing the cost of each building
	private int workersRequired; // instance variable representing the workers needed for building it

	/**
	 * A copy constructor which copies the values of primitive types instance
	 * variables of a Building object and and assign them to a new Object type of
	 * building
	 * 
	 * @author valentinos Pariza
	 * @since 21/8/2018
	 * @return
	 */
	public Building(Building building) {
		this.cost = building.cost;
		this.workersRequired = building.workersRequired;
	}

	/**
	 * A constructor which creates a new object type of Building whicj its instance
	 * fields are filled with the values which are given to constructor
	 * 
	 * @author valentinos Pariza
	 * @since 21/8/2018
	 * @param cost
	 *            The cost of a building
	 * @param workersRequired
	 *            The workers required for a building
	 * @return
	 */
	public Building(int cost, int workersRequired) {
		this.cost = cost;
		this.workersRequired = workersRequired;
	}
}