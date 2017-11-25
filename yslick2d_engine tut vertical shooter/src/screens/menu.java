package screens;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

import entities.btn;
import entities.extanded_entity;
import yengine.yworld;

public class menu extends yworld {

	public btn play_btn;
	public menu(int state) throws SlickException {
		super(state);
		
	}

	@Override
	public void yinit(GameContainer gc, StateBasedGame sbg) throws SlickException {
		//create play btn
		play_btn= new btn(150.0f,150.0f,"playNow.png",250.0f,50.0f);

		add(play_btn);
	}

	@Override
	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException {
		
		//if btn is clicked change world to game world
		if(play_btn.is_clicked)
		{
			sbg.getState( 1 ).init(gc, sbg);
			sbg.enterState(1);
		}
		super.update(gc, sbg, delta);
	}
	
	



}
