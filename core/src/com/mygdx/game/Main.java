package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;

public class Main extends Game {
	private Dinosaur player = new Dinosaur();
	private GameScreen screen;
	
	
	//PLACEHOLDEr
	private Obstacle obs = new Obstacle();
	
	@Override
	public void create () {
		screen  = new GameScreen(player, obs);
		setScreen(screen);
		

	}

	@Override
	public void render () {
		super.render();
		float delta = Gdx.graphics.getDeltaTime();
		player.update(delta);
		obs.update(delta);
		if(player.checkCollisions(obs)) System.out.println("WOWOWOW");
		
	}
	
	@Override
	public void dispose () {
	}
}
