import java.util.Scanner;

public class DotsAndLines
{
  public static void main (String[] args)
  {
    String g[][] = { //gameboard grid
      {  "   ", "0   ", "1   ", "2   ", "3   ", "4   \n" },
      {  "   ", "    ", "    ", "    ", "    ", "    \n" },
      {  "A  ", ".   ", ".   ", ".   ", ".   ", ".   \n" },  
      {  "   ", "    ", "    ", "    ", "    ", "    \n" },
      {  "B  ", ".   ", ".   ", ".   ", ".   ", ".   \n" },
      {  "   ", "    ", "    ", "    ", "    ", "    \n" },
      {  "C  ", ".   ", ".   ", ".   ", ".   ", ".   \n" },
      {  "   ", "    ", "    ", "    ", "    ", "    \n" },
      {  "D  ", ".   ", ".   ", ".   ", ".   ", ".   \n" },
      {  "   ", "    ", "    ", "    ", "    ", "    \n" },
      {  "E  ", ".   ", ".   ", ".   ", ".   ", ".   \n" },
      {  "   ", "    ", "    ", "    ", "    ", "    \n" },
      {  "   ", "    ", "    ", "    ", "    ", "    \n" }
      
    }; 
    
    Scanner aa = new Scanner(System.in);
    boolean p1Turn = false;//boolean to determine if it is player 1's or player 2's turn
    String player1 = "P1";
    String player2 = "P2";
    String lastPlayer;//Stores the player who made the move last so that their name can be added to the box if they complete it
    String move = "    ";
    int moveCounter = 0;//in to determine how many moves have been made. Optimal run through should be 40
    int turn = 1;//int to determine if it is player 1's or player 2's turn
    boolean won = false;
    boolean lastMove = false;//boolean used in code that allows player to go again if he completes a box
    int p1Counter = 0;//player 1 score
    int p2Counter = 0;//player 2 score
    boolean check = false;//Win condition part
    
    
    System.out.println();
    System.out.println("Welcome to Dots&Lines, a 2 Player game!");
    System.out.println("Make moves to create squares and gain points.");
    System.out.println("If you complete a square, you get another turn.");
    System.out.println("For example type \"A0A1\" to draw a horizontal line connecting the first two dots.");
    System.out.println("Make moves left to right, and up to down. Have fun!");
    System.out.println();    
    System.out.println("Here is the gameboard:");
    System.out.println();
    
    for(int i = 0; i<g.length; i++)//prints out gameboard
      for(int j = 0; j<g[0].length; j++)
    {
      System.out.print(g[i][j]);
    }
    
    while(won == false)
    {
      
      if(turn % 2 == 0)//determines whose move it is by using the turn counter
      {
        lastPlayer = player2;
        p1Turn = true;
      }
      else 
      {
        lastPlayer = player1;
        p1Turn = false;
      }
      
      System.out.println("There have been " + moveCounter + " moves.");
      System.out.println();
      
      if(p1Turn == false)
      {
        System.out.println("It is Player 1's turn, please enter your move.");
      }
      else if (p1Turn == true)
      {
        System.out.println("It is Player 2's turn, please enter your move.");
      }
      
      //---------------------------------------------------------------------------------------------------------------------------
      
      move = aa.nextLine();
      move = move.toUpperCase();
      
      if (move.length() == 0)
      {
        System.out.println("Please give a response.");
        turn--;
        moveCounter --;
      }
      
      if(move.equals("A0A1"))
        g[2][1]= ".___";
      if(move.equals("A1A2"))
        g[2][2]= ".___";
      if(move.equals("A2A3"))
        g[2][3]= ".___";
      if(move.equals("A3A4"))
        g[2][4]= ".___";
      
      if(move.equals("B0B1"))
        g[4][1]= ".___";
      if(move.equals("B1B2"))
        g[4][2]= ".___";
      if(move.equals("B2B3"))
        g[4][3]= ".___";
      if(move.equals("B3B4"))
        g[4][4]= ".___";
      
      if(move.equals("C0C1"))
        g[6][1]= ".___";
      if(move.equals("C1C2"))
        g[6][2]= ".___";
      if(move.equals("C2C3"))
        g[6][3]= ".___";
      if(move.equals("C3C4"))
        g[6][4]= ".___";
      
      if(move.equals("D0D1"))
        g[8][1]= ".___";
      if(move.equals("D1D2"))
        g[8][2]= ".___";
      if(move.equals("D2D3"))
        g[8][3]= ".___";
      if(move.equals("D3D4"))
        g[8][4]= ".___";
      
      if(move.equals("E0E1"))
        g[10][1]= ".___";
      if(move.equals("E1E2"))
        g[10][2]= ".___";
      if(move.equals("E2E3"))
        g[10][3]= ".___";
      if(move.equals("E3E4"))
        g[10][4]= ".___";
      
      if(move.equals("A0B0"))
        g[3][1]= "|   ";
      if(move.equals("A1B1"))
        g[3][2]= "|   ";
      if(move.equals("A2B2"))
        g[3][3]= "|   ";
      if(move.equals("A3B3"))
        g[3][4]= "|   ";
      if(move.equals("A4B4"))
        g[3][5]= "|   \n";
      
      if(move.equals("B0C0"))
        g[5][1]= "|   ";
      if(move.equals("B1C1"))
        g[5][2]= "|   ";
      if(move.equals("B2C2"))
        g[5][3]= "|   ";
      if(move.equals("B3C3"))
        g[5][4]= "|   ";
      if(move.equals("B4C4"))
        g[5][5]= "|   \n";
      
      if(move.equals("C0D0"))
        g[7][1]= "|   ";
      if(move.equals("C1D1"))
        g[7][2]= "|   ";
      if(move.equals("C2D2"))
        g[7][3]= "|   ";
      if(move.equals("C3D3"))
        g[7][4]= "|   ";
      if(move.equals("C4D4"))
        g[7][5]= "|   \n";
      
      if(move.equals("D0E0"))
        g[9][1]= "|   ";
      if(move.equals("D1E1"))
        g[9][2]= "|   ";
      if(move.equals("D2E2"))
        g[9][3]= "|   ";
      if(move.equals("D3E3"))
        g[9][4]= "|   ";
      if(move.equals("D4E4"))
        g[9][5]= "|   \n";
      
      
      turn ++;
      moveCounter ++;
      System.out.println();
      
      //---------------------------------------------------------------------------------------------------------------------------
      
      for(int i = 0; i<g.length; i++)
        for(int j = 0; j<g[0].length; j++)//checks to see if a box has been completed
      { 
        if (g[i][j] == ".___" 
              && g[i+2][j] == ".___" 
              && (g[i+1][j] == "|   " ) 
              && (g[i+1][j+1] == "|   " || g[i+1][j+1] == "|   \n" || g[i+1][j+1].equals("|P1 ") || g[i+1][j+1].equals("|P2 ")))
        {
          g[i+1][j] = "|" + lastPlayer + " ";
          lastMove = true;
          if (lastMove == true)
            turn --;//removes 1 from turn so that the player who completed the box can go again
        }
        lastMove = false;
        System.out.print(g[i][j]);
      }
      
      for(int i = 0; i<g.length; i++)//checks the score of each player
        for(int j = 0; j<g[0].length; j++)
      {
        if(g[i][j].equals("|P1 "))
          p1Counter ++;
        if(g[i][j].equals("|P2 "))
          p2Counter ++;
      }
      
      System.out.println("Player 1 has a score of " + p1Counter + " and Player 2 has a score of " + p2Counter +".");
      System.out.println();
      
//      ---------------------------------------------------------------------------------------------------------------------------
      
      if (p1Counter + p2Counter == 16)//win condition to see if all the boxes are filled
      {
        check = true;
      }
      
      //      ---------------------------------------------------------------------------------------------------------------------------
      
      
      
      if(p1Counter == p2Counter && check == true)
      {
        won = true;
        System.out.println("The game is a tie.");
      }
      
      if(p1Counter > p2Counter && check == true)
      {
        won = true;
        System.out.println("Player 1 wins!!!");
      }
      if(p2Counter > p1Counter && check == true)
      {
        won = true;
        System.out.println("Player 2 wins!!!");
      }
      
      p1Counter = 0;//resets the p1 and p2 scores so that the score is not added to every turn if a box is not completed.
      p2Counter = 0;
      
      
      
      
      //---------------------------------------------------------------------------------------------------------------------------
      
    }
    
    
  }
}
