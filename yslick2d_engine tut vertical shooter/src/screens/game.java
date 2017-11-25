package screens;

import java.util.ArrayList;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

import entities.bullet;
import entities.enemy;
import entities.extanded_entity;
import entities.ship;
import yengine.yentity;
import yengine.yworld;

public class game extends yworld {

	public game(int state) throws SlickException {
		super(state);
		
	}
	
	@Override
	public void yinit(GameContainer arg0, StateBasedGame arg1) throws SlickException
	{
		mc = new ArrayList<yentity>();//resets entity arraylist 
		
		ship ship_tst= new ship(150.0f,550.0f,0.4f,"blue_box.png");
		enemy ee= new enemy(200.0f,150.0f,0.05f,"blue_box.png");
		ee.can_fire=false;
		enemy ee2= new enemy(250.0f,150.0f,0.02f,"blue_box.png");
		
		add(ship_tst);
		add(ee);
		add(ee2);
	}

}
