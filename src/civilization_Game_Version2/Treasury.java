package civilization_Game_Version2;

/**
 * 
 * This class is the most important class in all the actions made by the player.It represents the treasures,coins and
 * generally the money which a player has and collects.This class is used for creating objects serving the purpose of
 * simulating a treasure-room.This class is a special Resource,as consequence it inherits from class 
 * {@linkplain civilization_Game_Version2.Resources}.
 * This class contains:
 * Instance variables: 
 * {@linkplain civilization_Game_Version2.Treasury#coins} 
 *  One Static final variable(constant):
 * {@linkplain civilization_Game_Version2.Treasury#INITIAL_COINS} 
 * Two Constructors:
 * {@linkplain civilization_Game_Version2.Treasury#Treasury()}
 * {@linkplain civilization_Game_Version2.Treasury#Treasury(int)}
 * A copy Constructor:
 * {@linkplain civilization_Game_Version2.Treasury#Treasury(Treasury)}
 * And Instance Methods:
 * {@linkplain civilization_Game_Version2.Treasury#getCoins()}
 * {@linkplain civilization_Game_Version2.Treasury#spend(int)}
 * {@linkplain civilization_Game_Version2.Treasury#earn(int)}
 * 
 * 
 * 
 * @author Valentinos Pariza(vpariz01)
 * @version 1.0.1
 * @since 5/3/2018
 *
 */
public class Treasury extends Resources{

	private int coins;			//  private instance attribute representing the coins and generally the wealth 
	
	public static final int INITIAL_COINS=200;

	/**
	 * A copy constructor which creates a new object type of  {@linkplain civilization_Game_Version2.Treasury}.First it calls the 
	 * copy constructor {@linkplain civilization_Game_Version2.Resources#Resources(Resources)} of the superclass 
	 * {@linkplain civilization_Game_Version2.Resources#Resources(Resources)} and then copies the value of the attribute 
	 * {@linkplain civilization_Game_Version2.Treasury#coins} of the one which is given as parameter, to the attribute of the new one.
	 * 
	 * @author valentinos Pariza 
	 * @since 5/3/2018
	 * @param treasureRoom a Treasury object which is used to copy all of its attributes to the new one's attributes
	 * @return
	 */
	public Treasury(Treasury treasureRoom) {
		super(treasureRoom);
		this.coins = treasureRoom.coins;
	}
	
	/**
	 *A constructor for creating a new object of type Treasurey which has initially 200 coins.It uses constructor
	 *{@linkplain civilization_Game_Version2.Treasury}
	 * 
	 * @author valentinos Pariza 
	 * @since 5/3/2018
	 * @return
	 */
	public Treasury() {
		this(INITIAL_COINS);
	}
	
	
	
	/**
	 *A constructor for creating a new object of type Treasurey which has initially 200 coins.It uses constructor
	 *{@linkplain civilization_Game_Version2.Treasury}
	 * 
	 * @author valentinos Pariza 
	 * @since 5/3/2018
	 * @param coins represents the coins to be added in the Treasury object
	 * @return
	 */
	public Treasury(int coins)
	{
		super();
		this.coins=coins;
	}

	
	/**
	 * A method which is used to return the number of coins being stored in the treasury(Object).
	 * 
	 * @author valentinos Pariza 
	 * @since 5/3/2018
	 * @return coins which are stored int the Trasury
	 */
	public int getCoins() {
		return this.coins;
	}

	/**
	 * A method which is used to evaluate if there are enough coins to do an action.if there are enough then the coins 
	 * which are used as a parameter are removed from the coins in the object Treasury and then the method returns true
	 * to indicate that the removement was made succesful.Else it returns false.
	 * 
	 * @author valentinos Pariza 
	 * @since 5/3/2018
	 * @return a boolean value indicating if the coins were spend
	 * @param cost the amount of coins which need to be spent
	 */
	public boolean spend(int cost) {

		if (this.coins >= cost) {
			this.coins -= cost;
			return true;
		}
		return false;
	}

	
	/**
	 * This method is used to increase the coins in the Object type of Treasury
	 * 
	 * @author valentinos Pariza 
	 * @since 5/3/2018
	 * @return
	 * @param earning the earnings of the player which has to be added ,in his/her treasury
	 */
	public void earn(int earnings) {
		this.coins += earnings;
	}

}
