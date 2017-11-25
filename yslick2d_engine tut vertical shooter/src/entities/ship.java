package entities;

import java.util.ArrayList;

import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;

import yengine.yengine;
import yengine.yentity;
import yengine.ytimer;

public class ship extends yentity {

	public int hp=3,max_hp=3,dmg=1;
	public ytimer fire_timr;
	public ship(float x, float y, float speed, String img) throws SlickException 
	{
		super(x, y, speed, img);
		type = "ship";
	this.img.setCenterOfRotation((this.img.getWidth()/2), (this.img.getHeight()/2));
	//rotation=30;
	
	fire_timr = new ytimer(200);//defult timer can be changed later
}//end constractor

@Override
public void init() throws SlickException 
{
	super.init();
}//end init

@Override
public void update() throws SlickException
{
	controls();
	collide();
	
	super.update();
}//end update

public void controls() throws SlickException 
{
	boolean space;//space key
	keyboard_control();
	
	//bounderis
	if(x<0){x=0;}
	if(x>600){x=600;}
	if(y>600){y=600;}
	if(y<0){y=0;}
	
	//shot
	space = yengine.key_pressed(gc,Input.KEY_SPACE);
	if(space)
	{
		
		shot();
	}
}//end controls

public void shot() throws SlickException 
{
	bullet b;
	fire_timr.update();
	
	if(fire_timr.finished())
	{
		//create bullet
		b = new bullet(x+15,y+15,0.5f,"blue_box.png");
		b.dmg = dmg;
		world.add(b);
		//yengine.o("fire");
	}
}//end shot

public void collide() throws SlickException 
{
	ArrayList<yentity> b = collide("enemy_bullet");
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
	

}//end collide

public void take_dmg(int dmg2) throws SlickException
{
	hp -=dmg2;
	//go to game over
	
	if(hp<=0)
	{
		
		sbg.getState( 0 ).init(gc, sbg);
		sbg.enterState(0);
	//	world.remove(this);
	}
	
	
}//end take_dmg
}//end class ship
