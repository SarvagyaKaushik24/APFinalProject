package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Tank extends Game {

    private SpriteBatch batch;
    private BitmapFont font;

    public SpriteBatch getBatch() {
        return batch;
    }

    public BitmapFont getFont() {
        return font;
    }


    @Override
    public void create() {
        batch = new SpriteBatch();
        font = new BitmapFont();
        this.setScreen(new MainMenu(this));
    }
    @Override
    public void render(){
        super.render();
    }
    @Override
    public void dispose(){
        batch.dispose();
        font.dispose();
    }
}
