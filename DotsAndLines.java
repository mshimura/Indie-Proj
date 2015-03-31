import java.util.Scanner;

public class DotsAndLines
{
  public static void main (String[] args)
  {
    String g[][] = { 
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
      
    }; 
    
    boolean box = false;
    boolean p1Turn = false;
    String player1 = "P1";
    String player2 = "P2";
    String lastPlayer;
    String move = "";
    int turn = 1;
    
    //write code to print update player turn every turn
    
    Scanner aa = new Scanner(System.in);
    boolean twoPlayer = true;
    
//    if (g[2][2] == ".___" && g[4][2] == ".___" && g[3][2] == "|   " && g[3][3] == "|   ")
//    {
//      g[3][2] = "|" + lastPlayer + " ";
//    }
    
     if(turn % 2 == 0)
    {
      lastPlayer = player2;
      p1Turn = true;
    }
    else 
    {
      lastPlayer = player1;
      p1Turn = false;
    }
    
    if(p1Turn == false)
    {
      System.out.println("It is Player 1's turn, please enter your move.");
    }
    else if (p1Turn == true)
    {
      System.out.println("It is Player 2's turn, please enter your move.");
    }
     //Only works for first or last turn
    
//    System.out.println("Do you want to play an AI?");
//    String response = aa.nextLine();
//    
//    if (response=="yes")
//      twoPlayer = false;
//    
//    if (response=="no")
//      twoPlayer = true;
    
//    if (response.length() == 0)
//    {
//      System.out.println("Please give a response.");
//    }
    
//    System.out.println("How many rows and columns do you want there to be?");
//    int rowcol = aa.nextInt();
    
    // if(twoPlayer == true)
    System.out.println("Here is the gameboard:");
    System.out.println();
    System.out.println("It is turn number " + turn);
    System.out.println();
    
    for(int i = 0; i<g.length; i++)
      for(int j = 0; j<g[0].length; j++)
    {
      System.out.print(g[i][j]);
    }
    
    if(move == "A0A1")
      g[2][1]= ".___";
    if(move == "A1A2")
      g[2][2]= ".___";
    if(move == "A2A3")
      g[2][3]= ".___";
    if(move == "A3A4")
      g[2][4]= ".___";
    
    if(move == "B0B1")
      g[4][1]= ".___";
    if(move == "B1B2")
      g[4][2]= ".___";
    if(move == "B2B3")
      g[4][3]= ".___";
    if(move == "B3B4")
      g[4][4]= ".___";
    
    if(move == "C0C1")
      g[6][1]= ".___";
    if(move == "C1C2")
      g[6][2]= ".___";
    if(move == "C2C3")
      g[6][3]= ".___";
    if(move == "C3C4")
      g[6][4]= ".___";
    
    if(move == "D0D1")
      g[8][1]= ".___";
    if(move == "D1D2")
      g[8][2]= ".___";
    if(move == "D2D3")
      g[8][3]= ".___";
    if(move == "D3D4")
      g[8][4]= ".___";
    
    if(move == "E0E1")
      g[10][1]= ".___";
    if(move == "E1E2")
      g[10][2]= ".___";
    if(move == "E2E3")
      g[10][3]= ".___";
    if(move == "E3E4")
      g[10][4]= ".___";
    
    if(move == "A0B0")
      g[3][1]= "|   ";
    if(move == "A1B1")
      g[3][2]= "|   ";
    if(move == "A2B2")
      g[3][3]= "|   ";
    if(move == "A3B3")
      g[3][4]= "|   ";
    
    if(move == "B0C0")
      g[5][1]= "|   ";
    if(move == "B1C1")
      g[5][2]= "|   ";
    if(move == "B2C2")
      g[5][3]= "|   ";
    if(move == "B3C3")
      g[5][4]= "|   ";
    
    if(move == "C0D0")
      g[7][1]= "|   ";
    if(move == "C1D1")
      g[7][2]= "|   ";
    if(move == "C2D2")
      g[7][3]= "|   ";
    if(move == "C3D3")
      g[7][4]= "|   ";
    
    if(move == "D0E0")
      g[9][1]= "|   ";
    if(move == "D1E1")
      g[9][2]= "|   ";
    if(move == "D2E2")
      g[9][3]= "|   ";
    if(move == "D3E3")
      g[9][4]= "|   ";
    
    
    System.out.println("Player 1 please input your first turn. For example type \"A0A1.\"");
    move = aa.nextLine();
    turn ++;
    System.out.println();
    System.out.println("It is turn number " + turn);
    System.out.println();
    
    for(int i = 0; i<g.length; i++)
      for(int j = 0; j<g[0].length; j++)
    {
      System.out.print(g[i][j]);
    }
    
    System.out.println("Player 2 please input your first turn.");
    move = aa.nextLine();
    turn ++;
    System.out.println();
    System.out.println("It is turn number " + turn);
    System.out.println();
    
    for(int i = 0; i<g.length; i++)
      for(int j = 0; j<g[0].length; j++)
    {
      System.out.print(g[i][j]);
    }
    
 System.out.print(g[2][2]);
   
   
    
    
    
//rows = Integer.parseInt(rows);
//columns = Integer.parseInt(columns);
    
    //int[][] a = new int[ rows ][ columns ];
    //talk to nick, leo, bobby
    
  }
}
