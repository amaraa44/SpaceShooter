package com.amaraa.main.objects.entities;

import com.amaraa.main.objects.GameObject;
import com.amaraa.main.objects.ID;

import java.awt.*;

public class Player extends GameObject {


    public Player(int x, int y, ID id) {
        super(x, y, id);
    }

    public void tick() {



    }

    public void render(Graphics g) {
        g.setColor(Color.white);
        g.fillRect(x,y,32,32);
    }
}
