package screens;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

import entities.extanded_entity;
import yengine.yworld;

public class game extends yworld {

	public game(int state) throws SlickException {
		super(state);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void yinit(GameContainer arg0, StateBasedGame arg1) throws SlickException
	{
		//pupulate game world with two blue boxes
		extanded_entity ee= new extanded_entity(150.0f,150.0f,0.025f,"blue_box.png");
		extanded_entity ee2= new extanded_entity(200.0f,150.0f,0.025f,"blue_box.png");
		
		add(ee);
		add(ee2);
	}

}
