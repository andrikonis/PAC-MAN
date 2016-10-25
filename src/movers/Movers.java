/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movers;

import java.util.Random;
import main.PacPrint;

/**
 *
 * @author Andrius
 */
public abstract class Movers implements PacPrint {
    

    
    private int x;
    private int y;
    protected int speed;
    public enum Direction{UP,DOWN,LEFT,RIGHT};
    protected Direction direction;

    public Movers(int x, int y, int speed, Direction direction) {
        this.x = x;
        this.y = y;
        this.speed = speed;
        this.direction = direction;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
    @Override
    public String getAscii() {
        return "";
    }
    public void move(){
        switch (direction) {
            case UP:
                y+=speed;
                break;
            case DOWN:
                y-=speed;
                break;
            case RIGHT:
                x+=speed;
                break;
            case LEFT:
                x-=speed;
                break;
            default:
                System.out.println("ERROR!!!");
                break;
        }
    }
    public void move(int speed){
        if(null!=direction)switch (direction) {
            case UP:
                y+=speed;
                break;
            case DOWN:
                y-=speed;
                break;
            case RIGHT:
                x+=speed;
                break;
            case LEFT:
                x-=speed;
                break;
            default:
                System.out.println("ERROR!!!");
                break;
        }
    }
    public void setDirection(Direction direction){
        this.direction=direction;
    }
    public void setDirection(){
        Random rand=new Random();
        int n=rand.nextInt(4);
        switch(n){
            case 0:
                direction=Movers.Direction.UP;
                break;
            case 1:
                direction=Movers.Direction.DOWN;
                break;
            case 2:
                direction=Movers.Direction.RIGHT;
                break;
            case 3:
                direction=Movers.Direction.LEFT;
                break;
            default:
                System.out.println("ERROR!!!");
                break;
        }
    }
}
