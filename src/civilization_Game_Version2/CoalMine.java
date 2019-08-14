package civilization_Game_Version2;

/**
 * 
 * This class was made in order to represent the recourses of the coal,which are
 * gained from a CoalMine.Although this class is a more special object
 * representing a unique Resource.It inherits from class
 * {@linkplain civilization_Game_Version2.Resources}.This class creates objects used as stored
 * places of coal and also represents any function and operation on the coals
 * such as burning them,increasing the amount of them and more.
 * This class includes: 
 * Instance variables: 
 * {@linkplain civilization_Game_Version2.CoalMine#coal} 
 * Two static constants: 
 * {@linkplain civilization_Game_Version2.CoalMine#BURN_COST} 
 * {@linkplain civilization_Game_Version2.CoalMine#INITIAL_AMOUNT_OF_COALS} 
 * Two Constructors:
 * {@linkplain civilization_Game_Version2.CoalMine#CoalMine(int)} 
 * {@linkplain civilization_Game_Version2.CoalMine#CoalMine()} 
 * 
 * One Copy Constructor:
 * {@linkplain civilization_Game_Version2.CoalMine#CoalMine(CoalMine)}
 *  And instance methods:
 * {@linkplain civilization_Game_Version2.CoalMine#burn()}
 * {@linkplain civilization_Game_Version2.CoalMine#getBurnCost()}
 * {@linkplain civilization_Game_Version2.CoalMine#getCoal()}
 * {@linkplain civilization_Game_Version2.CoalMine#increaseCoal(int)}
 * 
 * 
 * @author Valentinos Pariza(vpariz01)
 * @version 1.0.1
 * @since 5/3/2018
 *
 */
public class CoalMine extends Resources{

	private int coal; // attribute representing the amount of coal
	
	private static final int BURN_COST = 10; // the cost of burning coal,the amount of coal needed for a burn
	
	public static final int INITIAL_AMOUNT_OF_COALS=20;

	/**
	 * A constructor which creates an object of CoalMine having at the beginning20(twenty) coals.
	 *
	 * 
	 * @author valentinos Pariza
	 * @since 5/3/2018
	 * @return
	 */
	public CoalMine() {
		this(INITIAL_AMOUNT_OF_COALS);
	}

	
	
	/**
	 * A constructor which creates an object of CoalMine having at the beginning
	 * an integer value indicated by the parameter coals.It also uses the constructor 
	 * {@linkplain civilization_Game_Version2.Resources#Resources()} of class {@linkplain civilization_Game_Version2.Resources}.
	 * 
	 * @author valentinos Pariza
	 * @since 5/3/2018
	 * @param coals integer number of the coals to be added in the creation of the object
	 * @return
	 */
	public CoalMine(int coals)
	{
		super();
		this.coal=coals;
	}
	
	
	/**
	 * A copy Constructor which creates an Object CoalMine copying the amount of the
	 * coals of the one,which is given as parameter to the new one(Copy their
	 * attributes)
	 * 
	 * @author valentinos Pariza
	 * @since 5/3/2018
	 * @return
	 */
	public CoalMine(CoalMine oldCoalMine) {
		super(oldCoalMine);
		this.coal = oldCoalMine.coal;
	}

	/**
	 * This method represents the operation of burning coal which at the end it
	 * burns 10 coals(as indicated by constant
	 * {@linkplain civilization_Game_Version2.CoalMine#BURN_COST} ) after the method checks that the
	 * CoalMine actually has the appropriate amount of coal to burn.If it has burned
	 * the coal it returns true,else if it failed burning it returns false.
	 * 
	 * @author valentinos Pariza
	 * @since 5/3/2018
	 * @return true or false /true if the coal was enough for burning 10 coals( as
	 *         indicated by constant {@linkplain civilization_Game_Version2.CoalMine#BURN_COST} )
	 */
	public boolean burn() {
		if (coal >= BURN_COST) {
			coal -= BURN_COST;
			return true;
		}
		return false;
	}

	/**
	 * Returns the amount of coals needed for operating the function of burn.Returns
	 * the value of {@linkplain civilization_Game_Version2.CoalMine#BURN_COST}.
	 * 
	 * @author valentinos Pariza
	 * @since 5/3/2018
	 * @return the value of coals which are needed for using the Burn operation one
	 *         time.
	 */
	public int getBurnCost() {
		return BURN_COST;
	}

	/**
	 * Returns the amount of coal which is available on the object CoalMine
	 * 
	 * @author valentinos Pariza
	 * @since 5/3/2018
	 * @return the amount of coals which the object CoalMine has at the time ehich
	 *         the method is called
	 */
	public int getCoal() {
		return coal;
	}

	/**
	 * Increases the coal by the amount which is indicated by the parameter which is
	 * given.
	 * 
	 * @author valentinos Pariza
	 * @since 5/3/2018
	 * @param addedCoal
	 *            represents the increase which is going to be made on the coalse of
	 *            an object CoalMine
	 * @return
	 */
	public void increaseCoal(int addedCoal) {
		coal += addedCoal;
	}
}