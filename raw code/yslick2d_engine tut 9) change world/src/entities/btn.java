package entities;

import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Rectangle;

import yengine.yengine;
import yengine.yentity;

public class btn extends yentity 
{
	public boolean is_clicked;
	
	public btn(float x, float y, String img,float w,float h ) throws SlickException {
		super(x, y, 0, img);
		
		width = w;
		height = h;
		init();//need to init here to pass new w/h values
	}
	
	



	@Override
	public void update() throws SlickException 
	{
		click();
		super.update();
	}//end update


	public void click() throws SlickException
	{
		
		//chack if clicked
		if(clicked(0))
		{
			is_clicked = true;
		}
		
	}//end click
	
}//end btn
