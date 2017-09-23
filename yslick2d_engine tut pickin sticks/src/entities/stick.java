package entities;

import java.util.Random;

import org.newdawn.slick.SlickException;

import yengine.yentity;

public class stick extends yentity
{
	public stick(float x, float y, float speed) throws SlickException 
	{
		super( x, y, speed, "stick.png");
		type = "stick";
		rand_poos();
	}
	
	public void rand_poos()
	{
		x = rand(350);
		y = rand(300)+25;
		
	}
	public int rand(int x)
	{
		Random r = new Random();
		
		return 1+r.nextInt(x);
	}//end
}//end stick
