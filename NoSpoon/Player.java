import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Don't let the machines win. You are humanity's last hope...
 **/
class Player {
    

    ArrayList<Node> outP = new ArrayList<Node>();
    
    

    public static void main(String args[]) {
        
        Player p = new Player();
        Scanner in = new Scanner(System.in);
        int width = in.nextInt(); // the number of cells on the X axis
        int height = in.nextInt(); // the number of cells on the Y axis
        if (in.hasNextLine()) {
            in.nextLine();
        }
        
        char[][] rawOutP = new char[height][width];
        String line = "";
        
        for (int i = 0; i < height; i++) {
             line = in.nextLine();// width characters, each either 0 or .
             char[] chArr = line.toCharArray();
             for(int j = 0; j <chArr.length; j++){
                 rawOutP[i][j] =  chArr[j];
               
             }
        }
        
        p.setNodeArr(rawOutP);
//         for(int o=0; o<rawOutP.length; o++){
//         System.out.println(rawOutP[o]);
// }
        // Write an action using System.out.println()
        // To debug: System.err.println("Debug messages...");


        // Three coordinates:  a node, its right neighbor, its bottom neighbor
        for(Node n : p.outP){
         System.out.println(p.toOutput(n));   
        }
    }
    
    public void setNodeArr(char[][] chArr){
     for(int i = 0; i<chArr.length; i++){
         for(int j = 0; j<chArr[i].length; j++){
             boolean left = false;
             boolean down = false;
             
            if(j!=(chArr[i].length-1)){
                if((chArr[i][j]=='0')&&(chArr[i][j+1]=='0'))
             {left = true; }  
            }
            if(i!=(chArr.length-1)){
                if((chArr[i][j]=='0')&&(chArr[i+1][j]=='0'))
               { down = true;}
         
         }
         if(chArr[i][j]=='0'){
          outP.add(new Node(i, j, left, down));   
         }
         
    }
    }
    
    }
    
    public String toOutput(Node node){
        StringBuilder line = new StringBuilder("");
        line.append(
        for(Node n1: p.outP){
            if((n.getY()==n1.getY())&&(n.getX()<n1.getX())){
                
        
        String ln = String.valueOf(line);
        return ln;
    }
    }
    
    class Node{
    boolean left;
     boolean down;
     int x;
     int y;
     
    Node (int y, int x, boolean left, boolean down){
     this.left = left;
     this.down = down;
     this.x = x;
     this.y = y;
     
    }
    
    public boolean getLeft(){
     return left;   
    }
    
    public boolean getDown(){
     return down;   
    }
    
    public int getX(){
     return x;
    }
    
    public int getY(){
     return y;   
    }
    }
