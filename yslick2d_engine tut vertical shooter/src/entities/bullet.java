package entities;

import org.newdawn.slick.SlickException;

import yengine.yentity;

public class bullet extends yentity {

	public int dmg;
	
	public bullet(float x, float y, float speed, String img) throws SlickException 
	{
		super(x, y, speed, img);
		type = "bullet";
		dir = "up";
		init();
	}//end constractor

	@Override
	public void init() throws SlickException 
	{
		set_w_h(10,10);
		super.init();
		
	}//end init

	@Override
	public void update() throws SlickException 
	{
		move();
		super.update();
	}//end update
	
	public void move() throws SlickException 
	{
		bullet_movment();
		//if out of screen remove
		if(y<0){world.remove(this);}
		if(y>700){world.remove(this);}
	}//end move

}//end bullet class
