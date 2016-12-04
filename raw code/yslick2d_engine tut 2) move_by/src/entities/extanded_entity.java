package entities;

import org.newdawn.slick.SlickException;

import yengine.yentity;

public class extanded_entity extends yentity  
{
	String img_type ="img";
	public extanded_entity(float x, float y, float speed, String img) throws SlickException 
	{
		super( x, y, speed, img);
	}

	public void update() throws SlickException
	{
		move_by(speed,0);
	}
}//end extanded_entity
