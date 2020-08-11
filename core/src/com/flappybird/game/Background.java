package com.flappybird.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

public class Background {
    class BGPicture {
        private Texture tx;
        private Texture tx2;
        private Vector2 pos;

        public BGPicture(Texture tx, Vector2 pos) {
            this.tx = tx;
            this.tx2 = tx;
            this.pos = pos;
        }
    }
    private int speed;
    private BGPicture [] backs;

    public Background(){
        speed = 4;
        backs = new BGPicture[2];
        backs [0] = new BGPicture(new Texture("background.png"), new Vector2(0,0) );
        backs [1] = new BGPicture(new Texture("background2.png"), new Vector2(900,0) );

    }

    public void render(SpriteBatch batch){
        for (int i = 0; i < backs.length; i++) {
              batch.draw(backs[i].tx, backs[i].pos.x, backs[i].pos.y);
        }

    }
    public void update(){
        backs[0].pos.x -= speed;
        backs[1].pos.x -= speed;
        if (backs[0].pos.x == -900){
            backs[0].pos.x = 900;
        }
        if (backs[1].pos.x == -900){
            backs[1].pos.x = 900;
        }
    }
}

