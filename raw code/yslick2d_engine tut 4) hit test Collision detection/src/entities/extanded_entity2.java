package entities;

import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;

import yengine.yengine;
import yengine.yentity;

public class extanded_entity2 extends yentity  
{
	String img_type ="img";

	public extanded_entity2(float x, float y, float speed, String img) throws SlickException 
	{
		super( x, y, speed, img);
		type = "enity2";
		
	}

	public void update() throws SlickException
	{
		
	}
	

}//end extanded_entity
