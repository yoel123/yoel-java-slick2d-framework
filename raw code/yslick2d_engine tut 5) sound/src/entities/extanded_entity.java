package entities;

import java.util.ArrayList;

import org.newdawn.slick.Input;
import org.newdawn.slick.Music;
import org.newdawn.slick.SlickException;

import yengine.yengine;
import yengine.yentity;

public class extanded_entity extends yentity  
{
	String img_type = "img";

	public extanded_entity(float x, float y, float speed, String img) throws SlickException 
	{
		super( x, y, speed, img);
		Music music_tst = new Music("res/ludom_dare.wav");
		//music_tst.setVolume(0.02f);
		music_tst.play();
		//music_tst.stop();
		//music_tst.loop();
		
	}

	public void update() throws SlickException
	{
	
	}//end update


}//end extanded_entity
