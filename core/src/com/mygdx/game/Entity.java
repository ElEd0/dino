package com.mygdx.game;

import java.util.ArrayList;

public class Entity implements Collisionable{
	protected float x, y;
	protected float width, height;
	
	protected ArrayList<Vector> vectors;
	
	
	protected float getX(){
		return x;
	}
	protected float getY(){
		return y;
	}
	
	public float getWidth() {
		return width;
	}
	public float getHeight() {
		return height;
	}
	@Override
	public boolean isColliding(Collisionable c) {
		if(c instanceof Entity) return false;
		return true;
		
		/*
		float xRange = x+width;
		float yRange = y+height;
		
		float obX=0, obY=0, obXRange=0, obYRange=0;
		
		if (c instanceof Entity){
			obX =((Entity) c).getX();
			obY =((Entity) c).getY();
			obXRange= obX +((Entity) c).getWidth();
			obYRange= obY + ((Entity) c).getHeight();
		}
		
		if (x>=obX && xRange >= obXRange || 
				x <= obXRange && xRange <= obX)
			if (y>=obY && yRange <= obYRange ||
					y >= obYRange && yRange >= obY) {
				return true;
			}

		
		Entity e = null;
		if (c instanceof Entity){
			e = (Entity)c;
		}
		
		
		float thisx1 =x, thisx2 = x+width,
				thisx3 = thisx1, thisx4 = thisx2;
		float thisy1 =y+height, thisy2 = thisy1,
				thisy3 = y, thisy4 = thisy3;
		
		float obx1 =e.getX(), obx2 = e.getX()+e.getWidth(),
				obx3 = obx1, obx4 = obx2;
		float oby1 =e.getY()+e.getHeight(), oby2 = oby1,
				oby3 = e.getY(), oby4 = oby3;
		
		if ((thisx1> obx1 && thisx1< obx2) && (thisy1<oby1 && thisy1>oby3))
			System.out.println("collided!");
		if ((thisx2< obx2 && thisx2> obx1) && (thisy2<oby1 && thisy1>oby3))
			System.out.println("collided!");
		if ((thisx1> obx1 && thisx1< obx2) && (thisy1<oby1 && thisy1>oby3))
			System.out.println("collided!");
		if ((thisx1> obx1 && thisx1< obx2) && (thisy1<oby1 && thisy1>oby3))
			System.out.println("collided!");
		
		return false;
		*/
	}

}
