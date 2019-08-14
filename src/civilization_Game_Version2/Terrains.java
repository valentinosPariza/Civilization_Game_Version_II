package civilization_Game_Version2;

/**
 * 
 * This class is used to represent the Terrains in the world.This class is used as a superclass for subclasses
 * {@linkplain civilization_Game_Version2.Hills},{@linkplain civilization_Game_Version2.Desert} and {@linkplain civilization_Game_Version2.River}.
 * This class contains:
 * Instance variables: 
 * {@linkplain civilization_Game_Version2.Terrains#sizeOfTerrain}
 *  Two constructor:
 *  {@linkplain civilization_Game_Version2.Terrains#Terrains()}
 *  {@linkplain civilization_Game_Version2.Terrains#Terrains(double)}
 *  One copy constructor:
 * {@linkplain civilization_Game_Version2.Terrains#Terrains(Terrains)}
 * One Instance Method:
 * {@linkplain civilization_Game_Version2.Terrains#getSizeTerrain()}
 * 
 * @author Valentinos Pariza(vpariz01)
 * @version 1.0.1
 * @since 4/3/2018 
 *
 */
public class Terrains {
	
	private double sizeOfTerrain;  // represents the size of a Terrain in square kilometers
	
	private final static double DEFAULT_TERRAIN_SIZE=100;
	
	
	/**
	 * Default constructor for creating a Terrain of 100 square kilometers
	 * 
	 * @author Valentinos Pariza(vpariz01)
	 * @version 1.0.1
	 * @since 4/3/2018
	 */
	public Terrains()
	{
		this.sizeOfTerrain=DEFAULT_TERRAIN_SIZE;
	}
	
	
	/**
	 * Copy constructor for creating a new object having the size of Terrain as the old one
	 * 
	 * @param oldTerrain an object type of Terrain which is used in order to copy from it the attribute of the size 
	 * Terrain
	 * @author Valentinos Pariza(vpariz01)
	 * @version 1.0.1
	 * @since 6/3/2018
	 */
	public Terrains(Terrains oldTerrain)
	{
		this.sizeOfTerrain=oldTerrain.sizeOfTerrain;
	}
	
	
	
	/**
	 * Create an object type of Terrain with the indicated size of Terrain
	 * 
	 * @param size the Terrain size to be defined
	 * @author Valentinos Pariza(vpariz01)
	 * @version 1.0.1
	 * @since 6/3/2018
	 */
	public Terrains(double size)
	{
		this.sizeOfTerrain=size;
	}

	/**
	 *
	 * A getter method that returns the size of the Terrain 
	 * 
	 * @return the size of the Terrain object which calls this instance method
	 * @author Valentinos Pariza(vpariz01)
	 * @version 1.0.1
	 * @since 6/3/2018
	 */
	public double getSizeTerrain()
	{
		return this.sizeOfTerrain;
	}
}
