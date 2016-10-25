/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package world;

import food.Food;
import java.util.ArrayList;
import main.PacPrint;
import movers.*;
import food.*;

/**
 *
 * @author Andrius
 */
public class World {
    private final int GAME_WIDTH=30;
    private final int GAME_HEIGHT=10;
    private PacPrint[][] game=new PacPrint[GAME_WIDTH][GAME_HEIGHT];
    private PacMan pacMan;
    private ArrayList<Ghost> ghosts=new ArrayList<Ghost>();
    private ArrayList<Food> someFood=new ArrayList<Food>();
    private ArrayList<Wall> walls=new ArrayList<Wall>();

    public World() {
        this(new PacMan(15,6, 1, Movers.Direction.LEFT));
    }
    
    public World(PacMan pacMan) {
        this.pacMan = pacMan;
    }
    public void createMockup(){
        for (int i = 0; i < GAME_WIDTH; i++) {
            walls.add(new Wall(i,0));
            walls.add(new Wall(i,GAME_HEIGHT-1));
        }
        for (int i = 0; i < GAME_HEIGHT; i++) {
            walls.add(new Wall(0,i));
            walls.add(new Wall(GAME_WIDTH-1,i));
        }
        ghosts.add(new NormalGhost(10, 3, 1, Movers.Direction.DOWN));
        ghosts.add(new NormalGhost(3, 8, 1, Movers.Direction.UP));
        ghosts.add(new NormalGhost(22,5,1,Movers.Direction.DOWN));
    }
    @Override
    public String toString(){
        update();
        String gameString="";
        for(int j=0;j<GAME_HEIGHT;j++){
            for(int i=0;i<GAME_WIDTH;i++){
                gameString+=game[i][j]==null?" ":game[i][j].getAscii();
            }
            gameString+="\n";
        }
        return gameString;
    }

    public PacMan getPacMan() {
        return pacMan;
    }
    public void update(){
        reset();
        Wall wall;
        Ghost ghost;
        game[pacMan.getX()][pacMan.getY()]=pacMan;
        pacMan.move();
        for (int i = 0; i < walls.size(); i++) {
            wall=walls.get(i);
            game[wall.getX()][wall.getY()]=wall;
        }
        for(int i=0;i<ghosts.size();i++){
            ghost=ghosts.get(i);
            game[ghost.getX()][ghost.getY()]=ghost;
            ghost.move();
        }
    }
    public void reset(){
        for (int j = 0; j < GAME_HEIGHT; j++) {
            for (int i = 0; i < GAME_WIDTH; i++) {
                game[i][j]=null;
            }
        }
    }
}
