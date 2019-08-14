package civilization_Game_Version2;

/**
 * 
 * This class is used to describe the Technological level of a civilization
 * inside an object.This class has attributes which represent the points which a
 * civilization earns in Technology and some other to represent if the
 * civilization has reached a level which is assumed to be a great level for
 * winning ,as also and some instance methods which are used for completing some
 * functions on the attributes like increasing the points of experience on
 * building,checking if the player has reached the level of winning in
 * technology and more other.This class is a more special Victory factor.It
 * inherits from class {@linkplain civilization_Game_Version2.Victories}. 
 * This class includes:
 * Instance variables: 
 * {@linkplain civilization_Game_Version2.Technology#builtWonderOfTheWorld}
 * {@linkplain civilization_Game_Version2.Technology#understanding}
 * {@linkplain civilization_Game_Version2.Technology#experienceLevel}
 * {@linkplain civilization_Game_Version2.Technology#foundMeaningOfLife} 
 * One Constructor:
 * {@linkplain civilization_Game_Version2.Technology#Technology()} 
 * One copy Constructor:
 * {@linkplain civilization_Game_Version2.Technology#Technology(Technology)} 
 * And instance methods: 
 * {@linkplain civilization_Game_Version2.Technology#checkForFindingMeaningOfLife()}
 * {@linkplain civilization_Game_Version2.Technology#getBuildExperience()}
 * {@linkplain civilization_Game_Version2.Technology#getUnderstanding()}
 * {@linkplain civilization_Game_Version2.Technology#hasTechnologyWin()}
 * {@linkplain civilization_Game_Version2.Technology#improveWriting()}
 * {@linkplain civilization_Game_Version2.Technology#increaseExperience(int)}
 * {@linkplain civilization_Game_Version2.Technology#philosophize()}
 * {@linkplain civilization_Game_Version2.Technology#update_Status_Victory()}
 * 
 * @author Valentinos Pariza(vpariz01)
 * @version 1.0.1
 * @since 5/3/2018
 *
 */
public class Technology extends Victories {

	private int understanding; // represent the points which a civilization might have in understanding
								// sciences
	private boolean foundMeaningOfLife; // if a civilization has reached a level in studying sciences
										// which make it possible for a player to win in Technological
										// conquer

	private int experienceLevel; // the points which a civilization earns in building
	private boolean builtWonderOfTheWorld; // if a civilization has reached a level in building experience
											// which make it possible for a player to win in Technological
											// conquer

	/**
	 * Copy Constructor which creates an object Technology .First calls a
	 * constructor from class {@linkplain civilization_Game_Version2.Victories#Victories()} and then 
	 * copies all of the attributes from the given(as parameter) Technology object
	 * 
	 * @author valentinos Pariza
	 * @since 5/3/2018
	 * @return
	 */
	public Technology(Technology tech) {
		super(tech);
		this.understanding = tech.understanding;
		this.foundMeaningOfLife = tech.foundMeaningOfLife;

		this.experienceLevel = tech.experienceLevel;
		this.builtWonderOfTheWorld = tech.builtWonderOfTheWorld;
	}

	/**
	 * Creates a Technology object at standard level by setting initially
	 * understanding level and experience level to 0 and also to false the two
	 * boolean attributes for achieving the foundMeaningOfLife and
	 * builtWonderOfTheWorld.Moreover it sets {@linkplain civilization_Game_Version2.Victories#victoryHasBeen_Achieved()}(attribute 
	 * inherits) false by calling a constructor {@linkplain civilization_Game_Version2.Victories#Victories()}from superclass
	 * {@linkplain civilization_Game_Version2.Victories}. 
	 * 
	 * @author valentinos Pariza
	 * @since 5/3/2018
	 * @return
	 */
	public Technology() {
		super();
		this.understanding = 0;
		this.foundMeaningOfLife = false;

		this.experienceLevel = 0;
		this.builtWonderOfTheWorld = false;
	}

	/**
	 * Increases the understanding points of a Technology object by 25 due to
	 * philosophize and also check if this increase has bring civilization to Find
	 * the menaning of Life: ({@linkplain civilization_Game_Version2.Technology#foundMeaningOfLife})
	 * 
	 * @author valentinos Pariza
	 * @since 5/3/2018
	 * @return
	 */
	public void philosophize() {

		this.understanding += 25;
		this.checkForFindingMeaningOfLife();
	}

	/**
	 * Increases the points of the understanding attribute due to improvement in
	 * writing!Also after this checks if this increase has reached the limit for
	 * finding the meaning of Life.
	 * 
	 * @author valentinos Pariza
	 * @since 5/3/2018
	 * @return
	 */
	public void improveWriting() {
		this.understanding += 10;
		this.checkForFindingMeaningOfLife();
	}

	/**
	 * Checks if the understanding
	 * points(({@linkplain civilization_Game_Version2.Technology#understanding} of a technology
	 * object corresponding to a civilization have reached the limit which is
	 * supposed to mean that the civilization has Found the meaning of Life!
	 * 
	 * @author valentinos Pariza
	 * @since 5/3/2018
	 * @return
	 */
	public void checkForFindingMeaningOfLife() {

		if (this.understanding > 200)
			this.foundMeaningOfLife = true;
		
	}

	/**
	 * Increases the points of the building experience attribute !Also after this,it
	 * checks if this increase has completed the task of reaching totally 200 points
	 * in building experience and if it actually reached this level,it makes the
	 * flag-boolen attribute for Building the Wonder of the World true.
	 * 
	 * 
	 * @author valentinos Pariza
	 * @since 5/3/2018
	 * @return
	 */
	public void increaseExperience(int exp) {
		this.experienceLevel += exp;

		if (this.experienceLevel > 200)
			this.builtWonderOfTheWorld = true;
		
	}

	/**
	 * Checks whether a Found of meaning of Life
	 * {@linkplain civilization_Game_Version2.Technology#foundMeaningOfLife} and built a wonder of
	 * the world {@linkplain civilization_Game_Version2.Technology#builtWonderOfTheWorld} have
	 * achieved.In the reality it checks if the previous two attributes are true and
	 * returns the boolean answer.This class is overridden from the method 
	 * {@linkplain civilization_Game_Version2.Victories#hasTechnologyWin()} from superclass {@linkplain civilization_Game_Version2.Victories} 
	 * 
	 * @author valentinos Pariza
	 * @since 5/3/2018
	 * @return
	 */
	public boolean hasTechnologyWin() {
		this.update_Status_Victory();
		return super.getStatus_victoryHasAchieved();
	}

	/**
	 * Returns the points of understanding inside the attribute
	 * {@linkplain civilization_Game_Version2.Technology#understanding}
	 * 
	 * @author valentinos Pariza
	 * @since 5/3/2018
	 * @return the points earned in the section of understanding
	 */
	public int getUnderstanding() {
		return this.understanding;
	}

	/**
	 * Returns the points of building experience inside the attribute
	 * {@linkplain civilization_Game_Version2.Technology#experienceLevel}
	 * 
	 * @author valentinos Pariza
	 * @since 5/3/2018
	 * @return the points earned in the section of building experience
	 */
	public int getBuildExperience() {
		return this.experienceLevel;
	}
	
	
	
	/**
	 * 
	 * Update Victory status by using method which was inherited 
	 * {@linkplain civilization_Game_Version2.Victories#set_Status_Victory(boolean)}
	 * 
	 * @author valentinos Pariza
	 * @since 5/3/2018
	 * 
	 */
	public void update_Status_Victory() {
		this.set_Status_Victory(this.builtWonderOfTheWorld&&this.foundMeaningOfLife);
	}

}
