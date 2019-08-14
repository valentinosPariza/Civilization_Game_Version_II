 package civilization_Game_Version2;
/**
 * This class is responsible for representing objects which objects have the meaning of Settlement,groups of building.
 * In this class there is an actual group of objects type of Building which are all together in an array type of 
 * Building.Also each settlement has a name which is defined in its creationThis class has:
 * Instance variables: 
 * {@linkplain civilization_Game_Version2.Settlement#buildings}
 * {@linkplain civilization_Game_Version2.Settlement#name}
 * A static constant attribute:
 * {@linkplain civilization_Game_Version2.Settlement#INITIAL_NUM_OF_BUILDINGS}
 * 
 * One Copy Constructor Constructors:
 *{@linkplain civilization_Game_Version2.Settlement#Settlement(Settlement)}
 * One Constructor:
 * {@linkplain civilization_Game_Version2.Settlement#Settlement(String)}
 * These instance methods:
 * {@linkplain civilization_Game_Version2.Settlement#addBuilding(Building)}
 * {@linkplain civilization_Game_Version2.Settlement#build(int, Population, int, int)}
 * {@linkplain civilization_Game_Version2.Settlement#getName()}
 * {@linkplain civilization_Game_Version2.Settlement#isFull()}
 * {@linkplain civilization_Game_Version2.Settlement#expandSettlement()}
 * {@linkplain homework3.Settlement#}
 * 
 * 
 * 
 * @author Valentinos Pariza(vpariz01)
 * @version 1.0.1
 * @since 5/3/2018
 *
 */
public class Settlement {

	private static final int INITIAL_NUM_OF_BUILDINGS = 10;		// the initial number of cells in the array
	
	private Building[] buildings;	// an array type of Builfding which inside will have Building

	private String name;		// the name of the Settlement

	
	
	/**
	 * A copy constructor which creates a new object type of Settlement and copies all the  attributes of the one which
	 * is given as parameter to then new one
	 * 
	 * @author valentinos Pariza 
	 * @since 5/3/2018
	 * @param settlement an object type of Settlement which is used in order to copy all  its attributes to a new
	 *  object with different reference.It copies the values in the cells of array of the old one to the new one,by 
	 *  new objects for the new positions of the new array. 
	 * @return
	 */
	public Settlement(Settlement settlement) {
		this.name = settlement.name;
		this.buildings = new Building[settlement.buildings.length];

		for (int i = 0; i < settlement.buildings.length; i++)
			this.buildings[i] = new Building(settlement.buildings[i]);
	}
	
	
	
	/**
	 * A constructor which creates an array type of Building with all cells to be null.Moreover the new object will 
	 * as attribute name the String which was given as parameter
	 * 
	 * @author valentinos Pariza 
	 * @since 5/3/2018
	 * @param settlename a String name for the new Settlement
	 * @return
	 */
	public Settlement(String settlename) {
		this.name = settlename;
		this.buildings = new Building[INITIAL_NUM_OF_BUILDINGS];
	}

	
	/**
	 * This method is used to resize the array type of Building which an object of this class will have.It creates 
	 * a bigger array which has two times more cells from the previous and next it copies all the cells to the
	 * corresponding positions of the new one and after this replaces the attribute array with the new one.
	 * 
	 * @author valentinos Pariza 
	 * @since 5/3/2018
	 * @return
	 */
	private void expandSettlement() {

		Building[] newbuildings = new Building[this.buildings.length * 2];

		for (int j = 0; j < this.buildings.length; j++)
			newbuildings[j] = this.buildings[j];
		this.buildings = newbuildings;
		
	}

	
	
	/**
	 * Checks if the array which is an attribute of objects type of this class is full with objects.
	 * This is accomplished by checking the last position of the array,if it has a null or an object.
	 * 
	 * @author valentinos Pariza 
	 * @since 5/3/2018
	 * @return true if the array is full,otherwise false
	 */
	private boolean isFull() {
		return (this.buildings[buildings.length - 1] != null);		
	}

	
	
	/**
	 * This method is used in order to add a new building into the array of objects type of Building
	 * @author valentinos Pariza 
	 * @since 5/3/2018
	 * @param newbuilding the object type of Building which is added to the array of Building
	 * @return
	 */
	public void addBuilding(Building newbuilding) {
		if (this.isFull())								// if the array is full,then the program expands it
		 this.expandSettlement();
		
		for (int i = 0; i < buildings.length; i++) {
			if (buildings[i] == null) {					// finds the first next position which doesn't have any object
				buildings[i] = newbuilding;				// and put the new object -Building in there
					break;								
				
			}
		}
	}

	
	
	/**
	 * This method is used in order to build a new object Building.That means put it in the array.This happens only 
	 * when the parameter given allotedmoney representing the money of civilization are higher or equal in value than
	 * the cost of a building an also,the workers needed for this built are less or equal than the civilians of
	 * a civilization.To add a new building in the array this method uses the method
	 *  {@linkplain civilization_Game_Version2.Settlement#addBuilding(Building)}
	 *  
	 * @author valentinos Pariza 
	 * @since 5/3/2018
	 * @param allotedMoney represents the money in the Treasury of one civilization
	 * @param population	represents an object type of Population representing the population of a Civilization
	 * @param cost an integer value representing the cost for building a new Building
	 * @param workersRequired integer amount of the workers needed to build a building
	 * @return true if the building was build(aded in the array),false otherwise
	 */
	public boolean build(int allotedMoney, Population population, int cost, int workersRequired) {
		if ((allotedMoney > cost) && (population.getCivilians() >= workersRequired)) {
			this.addBuilding(new Building(cost, workersRequired));
			return true;
		}
		return false;
	}

	
	/**
	 * This method is used to return the name of a Settlement
	 * 
	 * @author valentinos Pariza 
	 * @since 5/3/2018
	 * @return the attribute name(String) of a Settlement object
	 */
	public String getName() {
		return this.name;
	}

}
