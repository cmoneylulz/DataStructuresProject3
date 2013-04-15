/**
 * This Class defines a Monster in our game, it has the following parameters:
 * @param name the name of the monster
 * @param description the description of the monster
 * @param hp the health of the monster
 * @param attack the monsters attack value
 * @param defense the monsters defense value
 * @param isAlive is the monster alive or dead
 * @param isAttacking is the monster trying to beat you down?
 * @author Christopher Wilson & Kevin Phan
 *
 */

//TODO: Add the room the monster belongs in

public class GameMonster {
	private String name;
	private String description;
	private int hp;
	private int attack;
	private int defense;
	private boolean isAlive;
	private boolean isAttacking;
	
	public GameMonster(String n, String desc, int health, int att, int def){
		setName(n);
		setDescription(desc);
		setHp(health);
		setAttack(att);
		setDefense(def);
		setAlive(true);
		setAttacking(false);
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
	 * @return the hp
	 */
	public int getHp() {
		return hp;
	}

	/**
	 * @param hp the hp to set
	 */
	public void setHp(int hp) {
		this.hp = hp;
	}

	/**
	 * @return the attack
	 */
	public int getAttack() {
		return attack;
	}

	/**
	 * @param attack the attack to set
	 */
	public void setAttack(int attack) {
		this.attack = attack;
	}

	/**
	 * @return the defense
	 */
	public int getDefense() {
		return defense;
	}

	/**
	 * @param defense the defense to set
	 */
	public void setDefense(int defense) {
		this.defense = defense;
	}

	/**
	 * @return the isAttacking
	 */
	public boolean isAttacking() {
		return isAttacking;
	}

	/**
	 * @param isAttacking the isAttacking to set
	 */
	public void setAttacking(boolean isAttacking) {
		this.isAttacking = isAttacking;
	}

	/**
	 * @return the isAlive
	 */
	public boolean isAlive() {
		return isAlive;
	}

	/**
	 * @param isAlive the isAlive to set
	 */
	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}
	
}
