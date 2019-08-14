package civilization_Game_Version2;
/**
 * 
 * This class is used to represent the civlizations and their general-similar characteristics such as the Population
 * ,the Technology ,the Treasury-coins-wealth and some other.Although this class it is used as a base for 
 * creating more specific object-Civilizations.The current subclasses of this superclass are 
 *  {@linkplain civilization_Game_Version2.Egypt} , {@linkplain civilization_Game_Version2.RomanEmpire} and {@linkplain civilization_Game_Version2.QinDynasty}.
 * .Although this class is used in order to give a basic structure of inheritance in this program.
 * This class contains:
 * Instance variables: 
 * {@linkplain civilization_Game_Version2.Civilizations#coals}
 * {@linkplain civilization_Game_Version2.Civilizations#colony}
 * {@linkplain civilization_Game_Version2.Civilizations#numSettlement}
 * {@linkplain civilization_Game_Version2.Civilizations#population}
 * {@linkplain civilization_Game_Version2.Civilizations#river}
 * {@linkplain civilization_Game_Version2.Civilizations#tacticsSkills}
 * {@linkplain civilization_Game_Version2.Civilizations#tech}
 * {@linkplain civilization_Game_Version2.Civilizations#treasureRoom}
 *  Two constructors:
 * {@linkplain civilization_Game_Version2.Civilizations#Civilizations()}
 * {@linkplain civilization_Game_Version2.Civilizations#Civilizations(String)}
 * One Copy Constructor:
 * {@linkplain civilization_Game_Version2.Civilizations#Civilizations(Civilizations)}
 * Two instance methods:
 * {@linkplain civilization_Game_Version2.Civilizations#getCoalMine()}
 * {@linkplain civilization_Game_Version2.Civilizations#getNumSettlements()}
 * {@linkplain civilization_Game_Version2.Civilizations#getPopulation()}
 * {@linkplain civilization_Game_Version2.Civilizations#getRiver()}
 * {@linkplain civilization_Game_Version2.Civilizations#getSettlements()}
 * {@linkplain civilization_Game_Version2.Civilizations#getStrategy()}
 * {@linkplain civilization_Game_Version2.Civilizations#getTechnology()}
 * {@linkplain civilization_Game_Version2.Civilizations#getTreasury()}
 * 
 * 
 * @author Valentinos Pariza(vpariz01)
 * @version 1.0.1
 * @since 4/3/2018 
 *
 */
public class Civilizations {
	
	public static final int MAX_SETTLEMENTS = 10;
	
	private Population population;
	
	private Treasury treasureRoom;
	
	private CoalMine coals;
	
	private River river;
	
	private Technology tech;
	
	private Strategy tacticsSkills;
	
	private Settlement[] colony;
	
	private int numSettlement;		//  represents the current number of settlements
	
	
	
	
	/**
	 * A default constructor for creating an object type of Civilization, calling  default constructors for
	 * creating objects for its attributes.
	 * 
	 * @author valentinos Pariza 
	 * @since 6/3/2018
	 * @return
	 */
	public Civilizations() 
	{
		this.population = new Population();
		this.treasureRoom = new Treasury();
		this.coals = new CoalMine();
		this.river = new River("River");
		this.tech = new Technology();
		this.tacticsSkills = new Strategy();

		this.colony = new Settlement[MAX_SETTLEMENTS];
		this.numSettlement = 0;
		
	}
	
	
	
	
	/**
	 * Same as the previous constructor with the difference that it takes as parameter a String name of the river of 
	 * the civilization,indicating the name of the River in this Civilization.
	 * 
	 * @param riverName the name of the river to be named
	 * @author valentinos Pariza 
	 * @since 6/3/2018
	 * @return
	 */
	public Civilizations(String riverName) 
	{
		this.population = new Population();
		this.treasureRoom = new Treasury();
		this.coals = new CoalMine();
		this.river = new River(riverName);
		this.tech = new Technology();
		this.tacticsSkills = new Strategy();

		this.colony = new Settlement[MAX_SETTLEMENTS];
		this.numSettlement = 0;
		
	}
	
	

	/**
	 * Copy constructor for creating a new object type of Civilizations and copy all the attributes from the second 
	 * to the first object.
	 * 
	 * @param oldCivilization an object type of Civilizations in order to copy all its attributes to a new one
	 * @author valentinos Pariza 
	 * @since 6/3/2018
	 * @return
	 */
	public Civilizations(Civilizations oldCivilization) {
		this.population = new Population(oldCivilization.population);
		this.treasureRoom = new Treasury(oldCivilization.treasureRoom);
		this.coals = new CoalMine(oldCivilization.coals);
		this.river = new River(oldCivilization.river);
		this.tech = new Technology(oldCivilization.tech);
		this.tacticsSkills = new Strategy(oldCivilization.tacticsSkills);

		this.colony = new Settlement[MAX_SETTLEMENTS];
		this.numSettlement = oldCivilization.numSettlement;
		
		for(int i=0;i<this.numSettlement;i++)
		{
			this.colony[i]=new Settlement(oldCivilization.colony[i]);
		}
		
	}
	
	
	
	
/**
* This method checks if there is enough space to place the settlement in the array,if does,it sends true else false.
 * The limit of the settlements is defined by the constant {@linkplain civilization_Game_Version2.Civilizations#MAX_SETTLEMENTS}
* 
* @param settlement an object settlement which shows that 
*  @author valentinos Pariza 
* @since 5/3/2018
* @return true if the settlement was saved,or false if there is no space for any other settlements 
* 
*/
		public boolean settle(Settlement settlement) {

			if (this.numSettlement < MAX_SETTLEMENTS) {
				
				this.colony[this.numSettlement] = settlement;
				this.numSettlement++;
				return true;
			}
			return false;

		}
		
		
		/**
		 * returns the Population object of this civilization
		 * 
		 * @author valentinos Pariza 
		 * @since 5/3/2018
		 * @return  the object type of Population which is attribute of this class civilization
		 */
		public Population getPopulation() {
			return this.population;
		}

		
		
		/**
		 * returns the Strategy object of this civilization
		 * 
		 * @author valentinos Pariza 
		 * @since 5/3/2018
		 * @return  the object type of Strategy which is attribute of this class civilization
		 */
		public Strategy getStrategy() {
			return this.tacticsSkills;
		}

		
		
		
		/**
		 * returns the array type of Settlements object-attribute of this civilization
		 * 
		 * @author valentinos Pariza 
		 * @since 5/3/2018
		 * @return  the array type of Settlements of this civilization which is attribute of this class civilization
		 */
		public Settlement[] getSettlements() {
			return this.colony;
		}
		
		
		
		/**
		 * returns the current number of settlements in this civilization
		 * 
		 * @author valentinos Pariza 
		 * @since 5/3/2018
		 * @return  number of Settlements in this Civilization
		 */
		public int getNumSettlements() {
			return this.numSettlement;
		}

		
		/**
		 * Returns the Treasury of this civilization
		 * 
		 * @author valentinos Pariza 
		 * @since 5/3/2018
		 * @return   the object type of Treasury which is attribute of this class civilization
		 */
		public Treasury getTreasury() {
			return this.treasureRoom;
		}

		/**
		 * returns the Technology object of this civilization
		 * 
		 * @author valentinos Pariza 
		 * @since 5/3/2018
		 * @return  the object type of Technology which is attribute of this class civilization
		 */
		public Technology getTechnology() {
			return this.tech;
		}

		
		
		/**
		 * returns the CoalMine object of this civilization
		 * 
		 * @author valentinos Pariza 
		 * @since 5/3/2018
		 * @return  the object type of CoalMine which is attribute of this class civilization
		 */
		public CoalMine getCoalMine() {

			return this.coals;
		}

		
		
		/**
		 * returns the River object of this civilization
		 * 
		 * @author valentinos Pariza 
		 * @since 5/3/2018
		 * @return  the object type of river which is attribute of this class civilization
		 */
		public River getRiver() {
			return this.river;
		}
		
		
		
		
	}
	
	
	

