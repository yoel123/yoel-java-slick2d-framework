package entities;

import java.util.ArrayList;

import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;

import yengine.yengine;
import yengine.yentity;

public class extanded_entity extends yentity  
{
	String img_type = "img";

	public extanded_entity(float x, float y, float speed, String img) throws SlickException 
	{
		super( x, y, speed, img);
		
	}

	public void update() throws SlickException
	{
		move();
		colide_tst();
	}
	private void move()
	{
		boolean up,down,left,right,w,a,s,d;
		
		up = yengine.key_pressed(gc,Input.KEY_UP);
		down = yengine.key_pressed(gc,Input.KEY_DOWN);
		left = yengine.key_pressed(gc,Input.KEY_LEFT);
		right = yengine.key_pressed(gc,Input.KEY_RIGHT);
		w = yengine.key_pressed(gc,Input.KEY_W);
		a = yengine.key_pressed(gc,Input.KEY_A);
		s = yengine.key_pressed(gc,Input.KEY_S);
		d = yengine.key_pressed(gc,Input.KEY_D);
		
		if(up || w){move_by(0,-speed);}
		if(down || s){move_by(0,speed);}
		if(left || a){move_by(-speed,0);}
		if(right || d){move_by(speed,0);}
	}//end move
	
	private void colide_tst()
	{
		
		if(collide("enity2").size()>0)
		{
			yengine.o("collide");
		}
		
	}//end colide_tst

}//end extanded_entity
