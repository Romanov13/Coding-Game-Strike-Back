import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
 class Player {
    
    int thrust;
    boolean boostB = true;
    

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        
        Player p = new Player();
        
        

        // game loop
        while (true) {
            int x = in.nextInt();
            int y = in.nextInt();
            int nextCheckpointX = in.nextInt(); // x position of the next check point
            int nextCheckpointY = in.nextInt(); // y position of the next check point
            int nextCheckpointDist = in.nextInt(); // distance to the next checkpoint
            int nextCheckpointAngle = in.nextInt(); // angle between your pod orientation and the direction of the next checkpoint
            int opponentX = in.nextInt();
            int opponentY = in.nextInt();
            
            
            String dir;
            
            if((nextCheckpointAngle>90)||(nextCheckpointAngle<(-90))){
                p.thrust = 0;
                
              
            
            } else {
                p.thrust = 100;
                 
                
            }
            }
            
                

            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");


            // You have to output the target position
            // followed by the power (0 <= thrust <= 100)
            String thr = p.thrust(nextCheckpointX, nextCheckpointY, nextCheckpointDist);
            // i.e.: "x y thrust"
            System.out.println(thr);
            }
        
        
        public String thrust(int x, int y, int dist){
            String thrust;
            if(boostB&&((dist<5500)&&(dist>1000))){
                thrust =  x + " " + y + " BOOST";
                boostB = false;
            } else {
                
        thrust =  x + " " + y + " " + p.thrust;
            }
         return  thrust;
        }
        
        
    }
