package com.mygdx.game;

public class Vector {

	private float x0,x1,y0,y1;
	
	public Vector(float x0, float x1, float y0, float y1){
		this.x0=x0;
		this.x1=x1;
		this.y0=y0;
		this.y1=y1;
	}
	
	public Vector(Point p0, Point p1){
		x0=p0.x;
		y0=p0.y;
		x1=p1.x;
		y1=p1.y;
	}
	
	public boolean collide(Vector v){
		if (((x0<=v.x0 && x1>=v.x0) || (x0>=v.x0 && x0<=v.x1)) &&
				((y0<=v.y0 && y1>=v.y0) || (y0>=v.y0 && y0<=v.y1))){
			return true;
		}
		return false;
	}
	
	public float getX0() {
		return x0;
	}

	public void setX0(float x0) {
		this.x0 = x0;
	}

	public float getX1() {
		return x1;
	}

	public void setX1(float x1) {
		this.x1 = x1;
	}

	public float getY0() {
		return y0;
	}

	public void setY0(float y0) {
		this.y0 = y0;
	}

	public float getY1() {
		return y1;
	}

	public void setY1(float y1) {
		this.y1 = y1;
	}

	public float getDistance() {return x1 - x0;}
	
	public float getP0() {return x0;}
	public float getP1() {return x1;}
	
	public void setP0(float p0) {this.x0 = p0;}
	public void setP1(float p1) {this.x1 = p1;}
}
