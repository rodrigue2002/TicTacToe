import processing.core.PGraphics;
import java.util.*;
import java.util.PrimitiveIterator.OfLong;

import javax.sound.sampled.Line;
import javax.swing.border.LineBorder;

import processing.core.PApplet;

 class MySketch extends PApplet{
    int countMousePress = 0;
    int player = 1;
    int P1 =1;
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
        if(player == 1){
            P1 = 1;
            g.fill(255,0,0);
            textSize(25);
            g.text("PLAYER " + P1,250,500);
        }
        if(player == -1){
            P1 = 2;
            g.fill(0,0,255);
            textSize(25);
            g.text("PLAYER " + P1,250,500);
        }
        jeu();
        for(int i = 0; i < 1;i++){
            if((a.board[0] == 1 && a.board[1] == 1 &&  a.board[2] == 1) ||(a.board[3] == 1 && a.board[4] == 1 &&  a.board[5] == 1)||(a.board[6] == 1 && a.board[7] == 1 &&  a.board[8] == 1)|| (a.board[0] == 1 && a.board[3] == 1 &&  a.board[6] == 1)||  (a.board[1] == 1 && a.board[4] == 1 &&  a.board[7] == 1)||(a.board[2] == 1 && a.board[5] == 1 &&  a.board[8] == 1) || (a.board[0] == 1 && a.board[4] == 1 &&  a.board[8] == 1) || (a.board[2] == 1 && a.board[4] == 1 &&  a.board[6] == 1) ){
                fill(255,0,0);
                background(0);
                textSize(50);
                text("PLAYER 1 hat gewonnen" ,50,300);
                break;
            }
            if((a.board[0] == -1 && a.board[1] == -1 &&  a.board[2] == -1) ||(a.board[3] == -1 && a.board[4] == -1 &&  a.board[5] == -1)||(a.board[6] == -1 && a.board[7] == -1 &&  a.board[8] == -1)|| (a.board[0] == -1 && a.board[3] == -1 &&  a.board[6] == -1)||  (a.board[1] == -1 && a.board[4] == -1 &&  a.board[7] == -1)||(a.board[2] == -1 && a.board[5] == -1 &&  a.board[8] == -1) || (a.board[0] == -1 && a.board[4] == -1 &&  a.board[8] == -1) || (a.board[2] == -1 && a.board[4] == -1 &&  a.board[6] == -1) ){
                fill(0,0,255);
                background(0);
                textSize(50);
                text("PLAYER 2 hat gewonnen",50,300);
                break;
            }
            if(countMousePress == 9){
                int circleX = 0;
                fill(255,255,0);
                background(0);
                ellipse(20,20,40,40);
                line(10,10,15,15);
                line(15,15,10,18);
                line(30,10,25,15);
                line(25,15,30,18);
                if(circleX == 0)
                    fill(255,150,0);
                    arc(20,25,15,15,0,PI);
                if(circleX == 0) 
                    fill(255,0,200);
                    arc(20,32,8,12,-1,4f);
                textSize(45);
                text("NIEMAND HAT GEWONNEN ",50,300);
            }
        }
        
    }
    
    public void jeu(){
        for(int i = 0; i < 9; i++){
            if(a.board[i] == 1 && i == 0){
                fill(255,0,0);
                stroke(255,255,255);
                ellipse(100,100,200,200);
            }
            else if(a.board[i] == -1 && i == 0){
                stroke(0,0,255);
                line(0,0,200,200);
                line(0,200,200,0);
            }
            if(a.board[i] == 1 && i == 1){
                fill(255,0,0);
                stroke(255,255,255);
                ellipse(300,100,200,200);
            }
            else if(a.board[i] == -1 && i == 1){
                stroke(0,0,255);
                line(200,0,400,200);
                line(200,200,400,0);
            }
            if(a.board[i] == 1 && i == 2){
                fill(255,0,0);
                stroke(255,255,255);
                ellipse(500,100,200,200);
            }
            else if(a.board[i] == -1 && i == 2){
                stroke(0,0,255);
                line(400,0,600,200);
                line(400,200,600,0);
            }
            if(a.board[i] == 1 && i == 3){
                fill(255,0,0);
                stroke(255,255,255);
                ellipse(100,300,200,200);
            }
            else if(a.board[i] == -1 && i == 3){
                stroke(0,0,255);
                line(0,200,200,400);
                line(0,400,200,200);
            }
            if(a.board[i] == 1 && i == 4){
                fill(255,0,0);
                stroke(255,255,255);
                ellipse(300,300,200,200);
            }
            else if(a.board[i] == -1 && i == 4){
                stroke(0,0,255);
                line(200,200,400,400);
                line(200,400,400,200);
            }
            if(a.board[i] == 1 && i == 5){
                fill(255,0,0);
                stroke(255,255,255);
                ellipse(500,300,200,200);
            }
            else if(a.board[i] == -1 && i == 5){
                stroke(0,0,255);
                line(400,200,600,400);
                line(400,400,600,200);
            }
            if(a.board[i] == 1 && i == 6){
                fill(255,0,0);
                stroke(255,255,255);
                ellipse(100,500,200,200);
            }
            else if(a.board[i] == -1 && i == 6){
                stroke(0,0,255);
                line(0,600,200,400);
                line(0,400,200,600);
            }
            if(a.board[i] == 1 && i == 7){
                fill(255,0,0);
                stroke(255,255,255);
                ellipse(300,500,200,200);
            }
            else if(a.board[i] == -1 && i == 7){
                stroke(0,0,255);
                line(200,400,400,600);
                line(200,600,400,400);
            }
            if(a.board[i] == 1 && i == 8){
                fill(255,0,0);
                stroke(255,255,255);
                ellipse(500,500,200,200);
            }
            else if(a.board[i] == -1 && i == 8){
                stroke(0,0,255);
                line(400,400,600,600);
                line(400,600,600,400);
            }
        }
    }
    public void mousePressed(){
       if(mouseX < 200 && mouseY <200 && (a.Board[0] !='O' && a.Board[0]!= 'X') ){
            player = - player;
            countMousePress++;
            a.pos = 0;
            a.newMakeMoov(a.pos);
            a.setzPlayer(a.pos);
             
       }
       if(mouseX >200 && mouseX <400 && mouseY < 200 &&  (a.Board[1] !='O' && a.Board[1]!= 'X')){
            player = - player;
            countMousePress++;
            a.pos = 1;
            a.newMakeMoov(a.pos);
            a.setzPlayer(a.pos);
       }
       if(mouseX >400 && mouseX <600 && mouseY < 200 &&  (a.Board[2] !='O' && a.Board[2]!= 'X')){
            countMousePress++;
            player = - player;
            a.pos = 2;
            a.newMakeMoov(a.pos);
            a.setzPlayer(a.pos);
       }
       if(mouseX <200  && mouseY > 200 && mouseY<400 &&  (a.Board[3] !='O' && a.Board[3]!= 'X')){
            countMousePress++;
            player = - player;
            a.pos = 3;
            a.newMakeMoov(a.pos);
            a.setzPlayer(a.pos);
        }
        if(mouseX >200 && mouseX < 400  && mouseY > 200 && mouseY<400 &&  (a.Board[4] !='O' && a.Board[4]!= 'X')){
            countMousePress++;
            player = - player;
            a.pos = 4;
            a.newMakeMoov(a.pos);
            a.setzPlayer(a.pos);
        }
        if(mouseX >400  && mouseY > 200 && mouseY<400 &&  (a.Board[5] !='O' && a.Board[5]!= 'X')){
            countMousePress++;
            player = - player;
            a.pos = 5;
            a.newMakeMoov(a.pos);
            a.setzPlayer(a.pos);
        }
        if(mouseX <200  && mouseY > 400 && mouseY<600 &&  (a.Board[6] !='O' && a.Board[6]!= 'X')){
            countMousePress++;
            player = - player;
            a.pos = 6;
            a.newMakeMoov(a.pos);
            a.setzPlayer(a.pos);
        }
        if(mouseX >200 && mouseX <400  && mouseY > 400 && mouseY<600 &&  (a.Board[7] !='O' && a.Board[7]!= 'X')){
            countMousePress++;
            player = - player;
            a.pos = 7;
            a.newMakeMoov(a.pos);
            a.setzPlayer(a.pos);
        }
        if(mouseX >400  && mouseY > 400 &&  (a.Board[8] !='O' && a.Board[8]!= 'X')){
            countMousePress++;
            player = - player;
            a.pos = 8;
            a.newMakeMoov(a.pos);
            a.setzPlayer(a.pos);
        }
      
    }

}




public class TicTacToe {
    int [] a = new int [9];
    static int pos;
    public void draw(PGraphics g){
        g.background(0);
        g.stroke(255);
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
            setzPlayer(pos);
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
    
    public static void setzPlayer(int pos){
        if(board[pos] == 1){
            Board[pos] = 'O';
        }
        if(board[pos] == -1){
            Board[pos] = 'X';
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
    
    public static void newMakeMoov(int pos){
        board[pos] = turn;
        turn = -turn;
    }
}   
