/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movers;

import java.util.Random;

/**
 *
 * @author Andrius
 */
public abstract class Ghost extends Movers {
    
    public Ghost(int x, int y, int speed, Direction direction) {
        super(x, y, speed, direction);
    }
    @Override
    public void move(){
        setDirection();
        super.move();
    }
    public void move(Direction direction){
        setDirection(direction);
        super.move();
    }
}
