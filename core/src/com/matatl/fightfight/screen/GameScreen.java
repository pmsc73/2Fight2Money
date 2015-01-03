package com.matatl.fightfight.screen;


import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.matatl.fightfight.camera.OrthoCamera;
import com.matatl.fightfight.tile.TileManager;

public class GameScreen extends Screen {
    private OrthoCamera camera;
    private TileManager tileManager;
    @Override
    public void create() {
        camera = new OrthoCamera();
        camera.resize();
        tileManager = new TileManager(camera);
    }
    @Override
    public void update() {
        camera.update();
        tileManager.update();
        camera.resize();
    }
    @Override
    public void render(SpriteBatch spriteBatch) {
        spriteBatch.setProjectionMatrix(camera.combined);
        spriteBatch.begin();
        tileManager.render(spriteBatch);
        spriteBatch.end();
    }
    @Override
    public void resize(int width, int height) {
        camera.resize();
    }
    @Override
    public void dispose() {
    }
    @Override
    public void pause() {
    }
    @Override
    public void resume() {
    }
}
