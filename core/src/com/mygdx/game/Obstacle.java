package com.mygdx.game;

import java.util.Arrays;
import java.util.Collection;

public class Obstacle extends Entity {
	
	Triangle[] t = new Triangle[2];
	
	public Obstacle(){

		this.x=400;
		this.y=20;
	
		//vectors.addAll(Arrays.asList(new Vector(0,0), new Vector(0,0)));
	}
	
	public Triangle[] getTriangleArray() {
		return t;
	}
	
	
	public void update(float delta){
		x-=3f;
	}


}
