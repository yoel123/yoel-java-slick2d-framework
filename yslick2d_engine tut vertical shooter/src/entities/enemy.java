package entities;

import java.util.ArrayList;

import org.newdawn.slick.SlickException;

import yengine.yengine;
import yengine.yentity;
import yengine.ytimer;

public class enemy extends yentity {
	
	public int hp=1,dmg=1;
	public ytimer fire_timr;
	public boolean can_fire = true;
	public enemy(float x, float y, float speed, String img) throws SlickException 
	{
		super(x, y, speed, img);
		type = "enemy";
		dir = "down";
		alpha = 0.5f;
		fire_timr = new ytimer(550);
	}//end constractor

	@Override
	public void init() throws SlickException 
	{
		// TODO Auto-generated method stub
		super.init();
	}//end init

	@Override
	public void update() throws SlickException 
	{
		move();
		collide();
		shot();
		super.update();
	}//end update
	
	private void shot() throws SlickException
	{
		bullet b;
		fire_timr.update();
		if(fire_timr.finished() && can_fire)
		{
			//create bullet
			b = new bullet(x,y+15,0.4f,"blue_box.png");
			b.type = "enemy_bullet";
			b.dir = "down";
			b.dmg = dmg;
			world.add(b);
			//yengine.o("fire");
		}
		
	}//end shot

	public void move() throws SlickException 
	{
		bullet_movment();
	}//end move
	
	public void take_dmg(int dmg2) throws SlickException 
	{
		hp -=dmg2;
		if(hp<=0)
		{
			world.remove(this);
		}
		
	}//end take_dmg
	
	public void collide() throws SlickException 
	{
		//////collide bullet///////
		ArrayList<yentity> b = collide("bullet");
		if(b.size()>0)
		{
			//loop all colided bullets
			for (int i = 0; i < b.size(); i++) 
			{
				bullet cb = (bullet) b.get(0);//current bullet
				take_dmg(cb.dmg);//take damege
				world.remove(cb);//remove bullet from world
			}
			
		}
		//////collide ship///////
		ArrayList<yentity> s = collide("ship");
		if(s.size()>0)
		{
			ship cs = (ship) s.get(0);//current ship
			 cs.take_dmg(dmg);
			yengine.o("collide ship");
		}
	}//end collide
	
}//end enemy classs
