/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movers;

/**
 *
 * @author Andrius
 */
public class ScaredGhost extends Ghost {

    public ScaredGhost(int x, int y, int speed, Direction direction) {
        super(x, y, speed, direction);
    }
    @Override
    public String getAscii(){
        return "µ";
    }
}
