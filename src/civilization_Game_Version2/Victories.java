package civilization_Game_Version2;
/**
 * 
 * This class is used to represent the general victory of a civilization.Although it has attributes to represent 
 * each winning factor.This class is going to be used as superclass for subclasses {@linkplain civilization_Game_Version2.Technology}
 *  and {@linkplain civilization_Game_Version2.Strategy}.Although this class is used in order to give a basic structure of inheritance 
 *  in this program.This class contains:
 * Instance variables: 
 * {@linkplain civilization_Game_Version2.Victories#victoryHasAchieved}
 *  One constructor:
 *  {@linkplain civilization_Game_Version2.Victories#Victories()}
 *  Two instance methods:
 *  {@linkplain civilization_Game_Version2.Victories#getStatus_victoryHasAchieved()}
 * {@linkplain civilization_Game_Version2.Victories#setStatus_VictoryHasAchieved()}
 * 
 * 
 * @author Valentinos Pariza(vpariz01)
 * @version 1.0.1
 * @since 4/3/2018 
 *
 */

public class Victories {

	private boolean victoryHasAchieved;
	
	/**
	 *A copy constructor for creating a new object of type Victories with the victory status copied from the old 
	 *object type of Victories
	 *
	 *
	 * 
	 * @author valentinos Pariza 
	 * @since 5/3/2018
	 */
	public Victories(Victories oldVictory) {
		
		this.victoryHasAchieved=oldVictory.victoryHasAchieved;
	}
	
	
	/**
	 *A constructor for creating a new object of type Victories representing if the victory have been achieved by the 
	 *civilization.
	 *{@linkplain civilization_Game_Version2.Treasury}
	 * 
	 * @author valentinos Pariza 
	 * @since 5/3/2018
	 */
	public Victories()
	{
		this.victoryHasAchieved=false;
		
		
	}
	
	
	/**
	 * a getter method which returns a boolean status representing the accomplishment of winning(if it is true)
	 * or if it is false shows that the victory has not been accomplished yet
	 * 
	 * @author valentinos Pariza 
	 * @since 5/3/2018
	 * @return the status of victory for a civilization-if it has won or not yet
	 */
	public boolean getStatus_victoryHasAchieved()
	{
		return this.victoryHasAchieved;
	}
	
	
	
	
	/**
	 * Assigns the status of the current Technological development win to the object attribute.If it has wins or not.
	 * 
	 * 
	 * @author valentinos Pariza 
	 * @since 5/3/2018
	 */
	protected void set_Status_Victory(boolean status) {
		this.victoryHasAchieved=status;
		
	}
	
	
	
	
	
	
}
