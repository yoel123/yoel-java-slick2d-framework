package screens;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Music;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;


import entities.player;
import entities.stick;
import yengine.yengine;
import yengine.yworld;

public class game_world extends yworld
{
	public int score = 0;
	public String rank="none"; 
	public game_world(int state) throws SlickException 
	{
		super(state);
	
		
		
	}
	
	@Override
	public void yinit(GameContainer gc, StateBasedGame sbg) throws SlickException 
	{
		player p = new player(150.0f,50.0f,0.205f,"stick_picker.png");
		stick s = new stick(150.0f,150.0f,1.05f);
		
		add(p);
		add(s);
			
	}
	
	@Override
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException 
	{
		super.render( gc,sbg, g);
		yengine.ds(g, "score: "+score, 20, 20);
		yengine.ds(g, "rank: "+rank, 220, 20);
		if(score>4){rank="stick picker";}
		if(score>15){rank="pro stick picker";}
		if(score>25){rank="master stick picker";}
		if(score>30){rank="no life";}
		if(score>35){rank="you shod stop you know";}
		if(score>40){rank="this game never ends";}
		if(score>45){rank="just sying its youre life...";}
		
		
		
		
	}

}//end game_world
