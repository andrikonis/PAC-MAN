/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import movers.PacMan;
import world.World;

/**
 *
 * @author Andrius
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        World w=new World();
        w.createMockup();
        for(int i=0;i<5;i++){
            System.out.print(w.toString());
        }
        // TODO code application logic here
    }
    
}
