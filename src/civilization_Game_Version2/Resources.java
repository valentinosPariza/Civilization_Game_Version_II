package civilization_Game_Version2;
/**
 * 
 * This class is used to represent the general resources of a civilization.This class is going to be used as a
 *  superclass for subclasses {@linkplain civilization_Game_Version2.Food},{@linkplain civilization_Game_Version2.Treasury},
 *  {@linkplain civilization_Game_Version2.CoalMine}.Although this class is used in order to give a basic structure of inheritance 
 *  in this program.This class does not have any methods or attributes but is used in order to expand in future the 
 *  program. This class contains  one no-parameter constructor and a copy constructor. 
 *  {@linkplain civilization_Game_Version2.Resources#Resources()}
 *  
 * 
 * 
 * 
 * @author Valentinos Pariza(vpariz01)
 * @version 1.0.1
 * @since 4/3/2018 
 *
 */

public class Resources {
	
	/**
	 * No parameter constructor for creating objects of Resources
	 * 
	 * @author Valentinos Pariza(vpariz01)
	 * @version 1.0.1
	 * @since 4/3/2018 
	 */
	public Resources()
	{
		
	}
	
	/**
	 * Copy constructor of an object type of Resources.For current time there are not any attributes to be copied.
	 * Although it may be used in the an expansion of this class at future.
	 * 
	 * @param oldResources the old object which is going to used for copying its attributes to other object.
	 */
	public Resources(Resources oldResources)
	{
		this();
	}
}
