	package com.engine;

import com.game.Wuefel;

public abstract class AbstractGame {
	
	public abstract void update(GameContainer gc, float dt) ;
	public abstract void render(GameContainer gc, Renderer r);
	
	
	
	}