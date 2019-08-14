package civilization_Game_Version2;

import java.util.Random;

/**
 * 
 * This class describes as a type-object class the hills-mountains which appears in the game and generally in the 
 * simulation of the real world.The purpose of this class is to create objects which represent hills and inside these 
 * objects ,the program tries to represent the hunting the fishing,the finding of coal...It uses some objects
 * for attributes from classes {@linkplain civilization_Game_Version2.Game}.This class inherits from class 
 * {@linkplain civilization_Game_Version2.Terrains}.It is a special type of Terrain. 
 * This class contains:
 * Instance variables: 
 * {@linkplain civilization_Game_Version2.Hills#coalLocation}
 * {@linkplain civilization_Game_Version2.Hills#game}
 * {@linkplain civilization_Game_Version2.Hills#numGame}
 * {@linkplain civilization_Game_Version2.Hills#goldLocation}
 * One static field:
 *	{@linkplain civilization_Game_Version2.Hills#rand}
 * One Constructor:
 * {{@linkplain civilization_Game_Version2.Hills#Hills()}
 * And instance methods:
 * {@linkplain civilization_Game_Version2.Hills#excavate()}
 * {@linkplain civilization_Game_Version2.Hills#hunt()}
 * {@linkplain civilization_Game_Version2.Hills#mineCoal()}
 * {@linkplain civilization_Game_Version2.Hills#replenishGame()}
 * 
 * 
 * 
 * 
 * @author Valentinos Pariza(vpariz01)
 * @version 1.0.1
 * @since 5/3/2018
 *
 */
public class Hills extends Terrains
{
	private static Random rand = new Random();

	private Game[] game;				//  array of type Game{@linkplain homework3.Game } representing the different    
									    //  of hunting resources that are available in the Hills
	private int numGame;                //  an index for representing the number of times the player has yet for 
										//  hunting in the hills-which hunting in the heals means getting an object
										//  type of Game from an array.For example if numGame=1 then it means tha the
										// plaer can hunt another one time before the array of Game[] game is empty
	private int[][] goldLocation = new int[25][25];			// two dimensional array of integer representing the places
															//  which a random amount of gold can be stored randomly
															// in the array
	private int[][] coalLocation = new int[15][15];			// two dimensional array of integer representing the places
															//  which a random amount of coal can be stored randomly
															// in the array

	
	/**
	 * A Constructor for a Hills object.This constructor randomly put in the arrays of the attributes 
	 * ({@linkplain civilization_Game_Version2.Hills#goldLocation} & {@linkplain civilization_Game_Version2.Hills#coalLocation}) gold and coal with 
	 * random amount each time in each cell and also fills the array of Game with different Game objects ehich objects
	 * consist of different amount of health points(food to be taken).Also this constructor uses the method
	 * {@linkplain civilization_Game_Version2.Hills#replenishGame()} for refilling the Game array.
	 * It uses constructor {@linkplain civilization_Game_Version2.Terrains#Terrains() }
	 * 
	 * @author valentinos Pariza 
	 * @since 5/3/2018
	 * @return
	 */
	public Hills() {
		super();
		for (int i = 0; i < 25; i++) {
			for (int j = 0; j < 25; j++) {
				goldLocation[i][j] = rand.nextInt(300);
				j += rand.nextInt(4);
			}
		}
		for (int i = 0; i < 15; i++) {
			for (int j = 0; j < 15; j++) {
				coalLocation[i][j] = rand.nextInt(10) + 1;
			}
		}
		game = new Game[10];
		numGame = 0;
		replenishGame();
	}
	

	
	/**
	 * This method is used to represent the search of gold inside the Hills(With the objects Hills) and randomly 
	 * chooses a position in the two dimensional array of gold and returns the integer amount which that position
	 * in the array represents
	 * 
	 * @author valentinos Pariza 
	 * @since 5/3/2018
	 * @return a random amount of gold from a two dimensional array
	 */
	public int excavate() {
		int i = rand.nextInt(25);
		int j = rand.nextInt(25);

		return goldLocation[i][j];
	}

	
	/**
	 * This method is used to represent the search of coal inside the Hills(With the objects Hills) and randomly 
	 * chooses a position in the two dimensional array of coals and returns the integer amount which that position
	 * i the array represents
	 * 
	 * @author valentinos Pariza 
	 * @since 5/3/2018
	 * @return a random amount of coals from a two dimensional array
	 */
	public int mineCoal() {
		int i = rand.nextInt(15);
		int j = rand.nextInt(15);

		return coalLocation[i][j];
	}

	
	/**
	 * This method represents the hunting on the Hills.This class offers a method for simulating hunting on an object
	 * Hills.It returns the next available object Game(which object inside has health points-food)starting from the
	 * last position of the array.If there is not any other Game object to retur it returns null.
	 * 
	 * @author valentinos Pariza 
	 * @since 5/3/2018
	 * @return an object of Game from the array of the attribute {@linkplain civilization_Game_Version2.Hills#game}.The next available
	 * object starting from the end of the array.If there is not any other object to return then it returns null.
	 */
	public Game hunt() {
		Game hunted;
		if (numGame > 0) {
			hunted = game[--numGame];
		} else {
			hunted = null;
		}
		return hunted;
	}

	/**
	 * This method is used to refill the array of the attribute {@linkplain civilization_Game_Version2.Hills#game} with some other 
	 * objects of class {@linkplain civilization_Game_Version2.Game}.Only when the index {@linkplain civilization_Game_Version2.Hills#numGame} has 
	 * reached value 0(indicates that after this there is nothing on the array-the array stops at value 0-it is the 
	 * position in every array).After this it returns if actually has made any refill on the array or not.
	 * 
	 * @author valentinos Pariza 
	 * @since 5/3/2018
	 * @return a boolean value representing if actually the method has refilled the array which the attribute
	 * 			{@linkplain civilization_Game_Version2.Hills#game} has
	 */
	public boolean replenishGame() {
		if (numGame == 0) {
			for (int i = 0; i < game.length; i++) {
				game[i] = new Game(rand.nextInt(20));
			}
			numGame = game.length;
			return true;
		}
		return false;
	}

}