package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;

public class GameScreen implements Screen{
	private SpriteBatch batch;
	private ShapeRenderer sr;
	private Texture dinoText;
	private Dinosaur player;
	
	
	//
	private Obstacle obs;

	
	public GameScreen(Dinosaur player, Obstacle obs){
		this.player=player;
		this.obs=obs;
	}
	
	@Override
	public void show() {
		batch = new SpriteBatch();
		sr = new ShapeRenderer();
		dinoText = new Texture("dino.png");
		
	}

	@Override
	public void render(float delta) {
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		Gdx.gl.glClearColor(255, 255, 255, 1);
		batch.enableBlending();
		batch.begin();
		batch.draw(dinoText, player.getX(), player.getY());
		batch.draw(dinoText, obs.getX(), obs.getY());
		batch.end();
		
		
		sr.setAutoShapeType(true);
		sr.begin();
		sr.set(ShapeType.Line);
		sr.setColor(Color.RED);
		for(Triangle t : player.getTriangles()){
			for(Vector v : t.getVector()){
				sr.line(v.getX0(), v.getY0(), v.getX1(), v.getY1());
			}
		}
		sr.end();
		
		
	}

	@Override
	public void resize(int width, int height) {
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}

}
