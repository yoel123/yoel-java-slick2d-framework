package screens;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Music;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

import entities.extanded_entity;

import yengine.yengine;
import yengine.yworld;

public class game_world extends yworld
{

	public game_world(int state) throws SlickException {
		super(state);
	
		
		
	}
	
	@Override
	public void yinit(GameContainer gc, StateBasedGame sbg) throws SlickException 
	{
		extanded_entity ee = new extanded_entity(150.0f,50.0f,0.05f,"boom.png");
	
		add(ee);

		
		
		
	}

}//end game_world
