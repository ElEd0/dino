package com.mygdx.game;

public class Triangle {
	
	private Vector[] v;
	

	Triangle(Vector v0, Vector v1, Vector v2) {
		v = new Vector[3];
		v[0] = v0;
		v[1] = v1;
		v[2] = v2;
	}
	
	public Triangle(Point p0, Point p1, Point p2){
		v = new Vector[3];
		v[0] = new Vector(p0, p1);
		v[1] = new Vector(p0, p2);
		v[2] = new Vector(p1, p2);
	}
	
	public Triangle(Point[] p){
		v = new Vector[3];
		v[0] = new Vector(p[0], p[1]);
		v[1] = new Vector(p[0], p[2]);
		v[2] = new Vector(p[1], p[2]);		
	}
	
	
	public boolean checkColisions(Triangle t) {
		
		boolean collide = false;
		
		for (int i = 0; i < v.length; i++) {
			for (int j = 0; j < v.length; j++) {
				if(v[i].collide(v[j])) {
					collide = true;
					break;
				}
			}
			if(collide) break;
		}
		
		return collide;
	}
	
	
	
	public void updatePositions(float x, float y){
		
	}
	
	public Vector getVector(int index) {return v[index];}
	
	public Vector[] getVector() {return v;}
}
