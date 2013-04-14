import java.util.ArrayList;

/**
 * This class represents the nodes of our graph implementation
 * @author Christopher Wilson & Kevin Phan
 *
 */
public class GameRoom {
	private ArrayList<GamePath> adjacentRooms;
	private ArrayList<GameObject> roomObjects;
	private ArrayList<GameMonster> roomMonsters;
	private String description;
	private Boolean isLocked;
	
	public GameRoom(String desc, Boolean lock){
		setDescription(desc);
		setIsLocked(lock);
		setAdjacentRooms(new ArrayList<GamePath>());
		setRoomObjects(new ArrayList<GameObject>());
		setRoomMonsters(new ArrayList<GameMonster>());
	}

	/**
	 * @return the adjacentRooms
	 */
	public ArrayList<GamePath> getAdjacentRooms() {
		return adjacentRooms;
	}

	/**
	 * @param adjacentRooms the adjacentRooms to set
	 */
	public void setAdjacentRooms(ArrayList<GamePath> adjacentRooms) {
		this.adjacentRooms = adjacentRooms;
	}

	/**
	 * @return the roomObjects
	 */
	public ArrayList<GameObject> getRoomObjects() {
		return roomObjects;
	}

	/**
	 * @param roomObjects the roomObjects to set
	 */
	public void setRoomObjects(ArrayList<GameObject> roomObjects) {
		this.roomObjects = roomObjects;
	}

	/**
	 * @return the roomMonsters
	 */
	public ArrayList<GameMonster> getRoomMonsters() {
		return roomMonsters;
	}

	/**
	 * @param roomMonsters the roomMonsters to set
	 */
	public void setRoomMonsters(ArrayList<GameMonster> roomMonsters) {
		this.roomMonsters = roomMonsters;
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
	 * @return the isLocked
	 */
	public Boolean getIsLocked() {
		return isLocked;
	}

	/**
	 * @param isLocked the isLocked to set
	 */
	public void setIsLocked(Boolean isLocked) {
		this.isLocked = isLocked;
	}
	
	

}
