package civilization_Game_Version2;
/**
 * 
 * This class is used to represent the Strategy of each civilization.This class is a type of objects which  
 *  objects contain an attribute for the overall Points in section of Strategy a civilization have.
 *  This class inherits from class {@linkplain civilization_Game_Version2.Victories}(superclass) .
 *  This class also includes:
 * Instance variables: 
 * {@linkplain civilization_Game_Version2.Strategy#strategyLevel}
 * Two static constants:
 * {@linkplain civilization_Game_Version2.Strategy#BATTLE_INCREASE} 
 * {@linkplain civilization_Game_Version2.Strategy#SIEGE_INCREASE}
 * One Constructor:
 * {@linkplain civilization_Game_Version2.Strategy#Strategy()}
 * One copy Constructor:
 * {@linkplain civilization_Game_Version2.Strategy#Strategy(Strategy)}
 * And instance methods:
 * {@linkplain civilization_Game_Version2.Strategy#checkForConqueredTheWorld()}
 * {@linkplain civilization_Game_Version2.Strategy#battle()}
 * {@linkplain civilization_Game_Version2.Strategy#Siege()}
 * {@linkplain civilization_Game_Version2.Strategy#getStrategyLevel()}
 * 
 * 
 * 
 * @author Valentinos Pariza(vpariz01)
 * @version 1.0.1
 * @since 5/3/2018
 *
 */
public class Strategy extends Victories{

	private int strategyLevel;				//  shows the points of \Strategy level which a civiliztion might have

	private static final int BATTLE_INCREASE = 10;   // when battling ,a civilization gains 10 points

	private static final int SIEGE_INCREASE = 40;	//  when sieging a civilization gains 40 strategy points

			
	
	
	
	/**
	 * A constructor for creating a Strategy object having at the time of creation zero points of Strategy and 
	 * not yet conquered the world.
	 * 
	 * @author valentinos Pariza 
	 * @since 5/3/2018
	 * @return
	 */
	public Strategy() {
		super();
		this.strategyLevel = 0;
	}

	
	/**
	 * A copy  constructor for creating a Strategy object having all the attributes of the old one copied.This 
	 * constructor uses a constructor from the superclass {@linkplain civilization_Game_Version2.Victories#Victories(Victories)}
	 * 
	 * @param oldStrategy an object type of Strategy which all its attributes will be copied to a new one
	 * @author valentinos Pariza 
	 * @since 5/3/2018
	 * @return
	 */
	public Strategy(Strategy oldStrategy)
	{
		super(oldStrategy);
		this.strategyLevel=oldStrategy.strategyLevel;
	}
	
	/**
	 * A method for simulating a real battle and its consequences!Increase the Strategy points of the object Strategy 
	 * with the amount of points as indicated by constant {@linkplain civilization_Game_Version2.Strategy#BATTLE_INCREASE} .
	 * 
	 * @author valentinos Pariza 
	 * @since 5/3/2018
	 * @return
	 */
	public void battle() {
		this.strategyLevel += BATTLE_INCREASE;
		this.checkForConqueredTheWorld();
	}

	
	/**
	 * A method for simulating a real(hypothetically) siege of a place giving the opportunity to the player to 
	 * gain experience in sieging!Also this method checks if the player has gained the appropriate amount of 
	 * Strategy points in order to be the winner of the game. Increase the Strategy points of the object Strategy 
	 * with the amount of points as indicated by constant {@linkplain civilization_Game_Version2.Strategy#SIEGE_INCREASE} .
	 * 
	 * @author valentinos Pariza 
	 * @since 5/3/2018
	 * @return
	 */
	public void Siege() {
		this.strategyLevel += SIEGE_INCREASE;
		this.checkForConqueredTheWorld();
	}

	/**
	 * A method which checks if the amount of Strategy points,which have been collected in an object Strategy have
	 * reached and passed the limit of 180 points.If this actually happens then the method changes the attribute of
	 * the object {@linkplain civilization_Game_Version2.Strategy#conqueredTheWorld} from false to true indicating that the player which
	 * has this Startegy object has conquered the world!
	 * @author valentinos Pariza 
	 * @since 5/3/2018
	 * @return
	 */
	private void checkForConqueredTheWorld() {
		if (this.strategyLevel > 180)
			super.set_Status_Victory(true);
	}


	
	/**
	 * This method (getter) returns the Strategy level which is an attribute of the Strategy object.
	 * 
	 * @author valentinos Pariza 
	 * @since 5/3/2018
	 * @return the amount of Strategy points which a player has earned so far
	 *  {@linkplain civilization_Game_Version2.Strategy#strategyLevel} 
	 *  
	 */
	public int getStrategyLevel() {
		return this.strategyLevel;
	}
	
	/**
	 * Returns the boolean value of {@linkplain civilization_Game_Version2.Victories#hasTechnologyWin}
	 * 
	 * @author valentinos Pariza
	 * @since 5/3/2018
	 * @return whether a technology win has been accomplished
	 */
	public boolean conqueredTheWorld() {
		return this.getStatus_victoryHasAchieved();
	}

}
