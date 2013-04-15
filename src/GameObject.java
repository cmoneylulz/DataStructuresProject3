
/**
 * This class defines an object used by the game, It has the following attributes
 * @param name the name of the object
 * @param description the description of the object
 * @param unlocks the GameRoom that this object is used to unlock
 * @author Christopher Wilson & Kevin Phan
 *
 */

public class GameObject {
	private String name;
	private String description;
	private GameRoom unlocks;
	
	public GameObject(String n, String desc, GameRoom unlock){
		setName(n);
		setDescription(desc);
		setUnlocks(unlock);
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the unlocks
	 */
	public GameRoom getUnlocks() {
		return unlocks;
	}

	/**
	 * @param unlocks the unlocks to set
	 */
	public void setUnlocks(GameRoom unlocks) {
		this.unlocks = unlocks;
	}
	
}
