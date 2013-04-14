/**
 * This class represents the edges of our graph implementation
 * it holds 2 instances of GameRooms (the Nodes of our graph) 
 * and the direction keyword used by the player to access this edge.
 * @param currentRoom The current Node
 * @param nextRoom the destination Node
 * @author Christopher Wilson & Kevin Phan
 *
 */
public class GamePath {
	private GameRoom currentRoom;
	private GameRoom nextRoom;
	private String direction;
	
	public GamePath(GameRoom current, GameRoom next, String dir){
		setCurrentRoom(current);
		setNextRoom(next);
		setDirection(dir);
	}

	/**
	 * @return the currentRoom
	 */
	public GameRoom getCurrentRoom() {
		return currentRoom;
	}

	/**
	 * @param currentRoom the currentRoom to set
	 */
	public void setCurrentRoom(GameRoom currentRoom) {
		this.currentRoom = currentRoom;
	}

	/**
	 * @return the nextRoom
	 */
	public GameRoom getNextRoom() {
		return nextRoom;
	}

	/**
	 * @param nextRoom the nextRoom to set
	 */
	public void setNextRoom(GameRoom nextRoom) {
		this.nextRoom = nextRoom;
	}

	/**
	 * @return the direction
	 */
	public String getDirection() {
		return direction;
	}

	/**
	 * @param direction the direction to set
	 */
	public void setDirection(String direction) {
		this.direction = direction;
	}
	
	
}
