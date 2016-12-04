package screens;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

import entities.extanded_entity;
import yengine.yworld;

public class game_world extends yworld
{

	public game_world(int state) throws SlickException {
		super(state);
		
	}
	
	@Override
	public void init(GameContainer gc, StateBasedGame abg) throws SlickException 
	{
		extanded_entity ee = new extanded_entity(50.0f,50.0f,1.05f,"blue_box.png");
		add(ee);
	}

}//end game_world
