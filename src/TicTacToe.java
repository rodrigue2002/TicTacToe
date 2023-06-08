import processing.core.PGraphics;
import java.util.*;
import processing.core.PApplet;

 class MySketch extends PApplet{
    TicTacToe a = new TicTacToe();
    int[] b = new int[9];
    public static void main(String[]args){
        PApplet.runSketch(new String[]{"TESTprogramm"}, new MySketch());
    }
    public void settings(){
        size(600,600);
    }

    public void draw(){
        a.draw(super.g);
        if(b[0] == 1){
            ellipse(100,100,40,40);
            fill(255,0,0);
        }
    }

    public void mousePressed(){
       
        
    }
}



public class TicTacToe {

    int [] a = new int [9];

    public void draw(PGraphics g){
        g.background(255,255,255);
        g.line(200,0,200,600);
        g.line(400,0,400,600);
        g.line(600,0,600,600);
        g.line(0,200,600,200);
        g.line(0,400,600,400);
        g.line(0,600,600,600);
    }

    static char[] Board = new char[9];
    static Scanner sc = new Scanner(System.in);
    static int[] board = new int[9];
    static int turn = 1;
    static int neuerPlayer ;

    public static void main(String[]args){
       for(int i = 0; i<9; i++){
            Board[i] = '.';
        }
        construction();
        for(int i = 0; i < 9; i++){
            int a;
            if(i%2 == 0) a = 1;
            else a = 2;
            System.out.println("\n\n PLAYER " + a + ": auf welche position möchtest du dein Stein einsetzen? (zwischen 0 bis 8)");
            makeMove();
            setzPlayer();
            construction();
            winner();
        }
        
       
    }
       
    public static void winner(){
        for(int i = 0; i<1; i++){
            if((board[0] == 1 && board[1] == 1 &&  board[2] == 1) ||(board[3] == 1 && board[4] == 1 &&  board[5] == 1)||(board[6] == 1 && board[7] == 1 &&  board[8] == 1)|| (board[0] == 1 && board[3] == 1 &&  board[6] == 1)||  (board[1] == 1 && board[4] == 1 &&  board[7] == 1)||(board[2] == 1 && board[5] == 1 &&  board[8] == 1) || (board[0] == 1 && board[4] == 1 &&  board[8] == 1) || (board[2] == 1 && board[4] == 1 &&  board[6] == 1) ){
                System.out.println("\nplayer 1 hat gewonnen");
                break;
            }
            if((board[0] == -1 && board[1] == -1 &&  board[2] == -1) ||(board[3] == -1 && board[4] == -1 &&  board[5] == -1)||(board[6] == -1 && board[7] == -1 &&  board[8] == -1)|| (board[0] == -1 && board[3] == -1 &&  board[6] == -1)||  (board[1] == -1 && board[4] == -1 &&  board[7] == -1)||(board[2] == -1 && board[5] == -1 &&  board[8] == -1) || (board[0] == -1 && board[4] == -1 &&  board[8] == -1) || (board[2] == -1 && board[4] == -1 &&  board[6] == -1) ){
                System.out.println("\nplayer 2 hat gewonnen");
                break;
            }
        }     
    }

    public static void construction(){
        for(int i = 0; i<9; i++){
            if(i%3 == 0){
                System.out.println("\n");
            }
            System.out.print(Board[i] + "  ");
        }
    }
    
    public static void setzPlayer(){
        if(board[neuerPlayer] == 1){
            Board[neuerPlayer] = 'O';
        }
        if(board[neuerPlayer] == -1){
            Board[neuerPlayer] = 'X';
        }
    }

    public static void makeMove(){
        neuerPlayer = sc.nextInt();
        while(neuerPlayer < 0 || neuerPlayer > 8){
            System.out.println("geben Sie bitte eine richtige Zahl (zwischen 0 und 8)");
            neuerPlayer = sc.nextInt();
        }
        assert neuerPlayer >= 0 && neuerPlayer < 9;
        if (board[neuerPlayer] != 0){
            while(board[neuerPlayer] != 0){
                System.out.println("schon besetzt. wähle bitte einen anderen Platz"); 
                neuerPlayer = sc.nextInt();
                sc.nextLine();
            
            }     
        }
        board[neuerPlayer] = turn;
        turn = -turn;
       
        
    }

}
