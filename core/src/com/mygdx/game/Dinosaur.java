package com.mygdx.game;

import java.util.Arrays;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;

public class Dinosaur extends Entity{
	private float yVelocity=0;
	private float GRAVITY = 9.81f;
	private boolean touchingFloor = true;
	private Triangle[] t;
	
	public Dinosaur(){
		this.x=100;
		this.y=20;
		this.width=43;
		this.height=43;
		t = new Triangle[2];
		t[0] = new Triangle(new Point(100, 20), new Point(143, 20), new Point(143, 63));
		t[1] = new Triangle(new Point(100, 20), new Point(100, 63), new Point(143, 63));
	}

	public void update(float delta){
		
		if (Gdx.input.isKeyPressed(Keys.SPACE) && touchingFloor){
			yVelocity=6f;
		}
		
		if (touchingFloor){
			y+=yVelocity;
			yVelocity-=.2f;
		}
		
		if (y>=20 && !touchingFloor) y-=GRAVITY*delta;
		
		touchingFloor = y == 20 ? true : false;
		
	}
	
	public boolean checkCollisions(Collisionable c) {
		
		Triangle[] aux = ((Obstacle) c).getTriangleArray();
		for (int i = 0; i < t.length; i++) {
			for (int j = 0; j < aux.length; j++) {
				if(t[i].checkColisions(aux[j])) {
					return true;
				}
			}
		}
		return false;
	}


	public float getX() {
		return x;
	}

	public float getY() {
		return y;
	}
	
	public Triangle[] getTriangles() {
		return t;
	}

	public void setTriangles(Triangle[] t) {
		this.t = t;
	}
	
}
