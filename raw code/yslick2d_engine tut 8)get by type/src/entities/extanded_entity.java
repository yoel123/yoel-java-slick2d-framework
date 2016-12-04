package entities;

import java.util.ArrayList;

import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.Music;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.SpriteSheet;
import org.newdawn.slick.geom.Rectangle;

import yengine.yengine;
import yengine.yentity;
import yengine.ytimer;

public class extanded_entity extends yentity  
{
	
	public String img_type = "sprite";
	public float height2=180;
	public float width2=150;
	ytimer tst_timr = new ytimer(100);
	
	public extanded_entity(float x, float y, float speed, String img) throws SlickException 
	{
		super( x, y, speed, img);
		type = "extanded_entity";
	}

	public void init() throws SlickException
	{
		  
		 height2=180;
		 width2=150;
		 set_w_h(width2,height2);
		 set_img_type("sprite");
		// set_sxy(1,0);
		// set_sxy(2,0);
		// set_sxy(3,0);
		 set_sxy(4,0);//set spritemap xy
		 super.init();
		
		
	}//end init
	
	public void update() throws SlickException
	{
		move_all();
	}//end update
	public void move_all()
	{
		ArrayList<yentity> mcs = get_by_type(type);
		for(yentity e : mcs)
		{
			e.move_by(e.speed,0);
		}
	}


}//end extanded_entity
