package com.testgame.player;

import java.util.ArrayList;

import com.testgame.mechanics.unit.AUnit;

/**
 * Abstract class which implements the IPlayer interface.
 * @author Alen Lukic
 *
 */
public class APlayer implements IPlayer {
	
	/**
	 * The player's name.
	 */
	protected String playerName;
	
	protected int turncount;
	
	/**
	 * Indicates if it's the player's turn. Determines what the player's current capabilities are.
	 */
	protected boolean isTurn;
	
	/**
	 * List of the units which a player currently controls.
	 */
	private ArrayList<AUnit> activeUnits;
	
	/**
	 * Constructor.
	 * @param name The player's name.
	 */
	public APlayer(String name) {
		turncount = 0;
		playerName = name;
		setActiveUnits(new ArrayList<AUnit>());
		isTurn = false;
	}

	@Override
	public void beginTurn() {
		for(AUnit unit : getActiveUnits()){
			unit.turnInit();
		}
		isTurn = true;
	}

	@Override
	public void endTurn() {
		
		isTurn = false;
	}

	@Override
	public boolean isTurn() {
		return isTurn;
	}
	
	@Override
	public void addUnit(AUnit unit) {
		getActiveUnits().add(unit);
		unit.setPlayer(this);
	}
	
	@Override
	public void removeUnit(AUnit unit) {
		getActiveUnits().remove(unit);
	}
	
	@Override
	public ArrayList<AUnit> getUnits() {
		return getActiveUnits();
	}
	
	public String getName() {
		return playerName;
	}

	public ArrayList<AUnit> getActiveUnits() {
		return activeUnits;
	}

	public void setActiveUnits(ArrayList<AUnit> activeUnits) {
		this.activeUnits = activeUnits;
	}
	
	

}
