package entities;

import java.util.ArrayList;

import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;

import screens.game_world;
import yengine.yengine;
import yengine.yentity;

public class player extends yentity 
{
	public float height2=180;
	public float width2=150;
	public player(float x, float y, float speed, String img) throws SlickException 
	{
		super( x, y, speed, img);
		type = "player";
	}
	public void init() throws SlickException
	{
		  
		 height2=36;
		 width2=37;
		 set_w_h(width2,height2);
		 set_img_type("sprite");
		 set_sxy(0,0);
		 set_sxy(0,1);
	
		 super.init();
		
		
	}//end init
	
	public void update() throws SlickException
	{
		move();
		pick_stick();
	}//end update
	public void move()
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
		
		if(up || w){move_by(0,-speed); set_sxy(0,1);}
		if(down || s){move_by(0,speed);set_sxy(0,3);}
		if(left || a){move_by(-speed,0);set_sxy(0,4);}
		if(right || d){move_by(speed,0);set_sxy(0,2);}
	}
	
	public void pick_stick()
	{
		ArrayList<yentity> sticks = collide("stick");
		if(sticks.size()>0)
		{
			//yengine.o("collide");
			stick s = (stick)sticks.get(0);
			s.rand_poos();
			game_world yworld = (game_world)world;
			yworld.score++;
			
		}
	}
}//end player
