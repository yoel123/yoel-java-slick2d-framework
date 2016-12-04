package main;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

import screens.game_world;
import yengine.yworld;



public class ymain  extends StateBasedGame
{


	public static final String gameName = "Game template";
	public static final int menu = 0;
	public static final int play = 1;


	public ymain() throws SlickException 
	{
		super(gameName);
		this.addState(new game_world(menu));
		this.addState(new yworld(play));
	}

	public static void main(String[] args)  throws SlickException
	{
		AppGameContainer appg;

		appg = new AppGameContainer(new ymain());
		appg.setDisplayMode(640,350, false);
		appg.setShowFPS(false);
		appg.start();

	}

	@Override
	public void initStatesList(GameContainer gc) throws SlickException
	{
		//this.getState(menu).init(gc,this);
		//this.getState(play).init(gc,this);
		this.enterState(menu);

	}

}
