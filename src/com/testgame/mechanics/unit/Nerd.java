package com.testgame.mechanics.unit;

import com.testgame.mechanics.map.GameMap;
import com.testgame.scene.GameScene;

/**
 * The nerd unit.
 * @author Alen Lukic
 *
 */
public class Nerd extends AUnit {
	   
	/**
	 * Constructor. Sets mutable and immutable stats.
	 * @param map The map being used for this game.
	 * @param x The initial x-coordinate of the unit.
	 * @param y The initial y-coordinate of the unit.
	 */
	public Nerd(GameMap map, int x, int y, GameScene game, String color) {
		super(0, 0, game.resourcesManager.nerd_tileset, game.vbom);
		this.game = game;
		this.map = map;
		this.x = x;
		this.y = y;
		this.maxHealth = 100;
		this.currentHealth = 100;
		this.attack = 50;
		this.attackEnergy = 50;
		this.attackRange = 6;
		this.movementRange = 40;
		this.energy = 100;
		this.energyUsedLastTurn = 0;
		this.isDefending = false;
		map.setOccupied(x, y, this);
		this.unitType = "Nerd";
		int redStart = game.resourcesManager.nerd_tileset.getTileCount() / 2;
		if (color.equals("red")) {
			this.start_frame = redStart;
		}
		//Log.d("AndEngine", "start frame of " + color + " is " + start_frame);
		this.setCurrentTileIndex(start_frame);
		
		this.IDLE_START_FRAME = 0;
		this.IDLE_END_FRAME = 1;
		
		this.WALK_DOWN_START_FRAME = 1;
		this.WALK_DOWN_END_FRAME = 3;
		
		this.WALK_LEFT_START_FRAME = 13;
		this.WALK_LEFT_END_FRAME = 15;
		
		this.WALK_UP_START_FRAME = 10;
		this.WALK_UP_END_FRAME = 12;
		
		this.WALK_RIGHT_START_FRAME = 16;
		this.WALK_RIGHT_END_FRAME = 18;
		
		this.GUARD_FRAME = 4;
		
		this.ATTACKED_START_FRAME = 20;
		this.ATTACKED_END_FRAME = 21;
	}

}
