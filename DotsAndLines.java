import java.util.Scanner;

public class DotsAndLines
{
  public static void main (String[] args)
  {
    Scanner aa = new Scanner(System.in);
    boolean twoPlayer = true;
    
    System.out.println("Do you want to play an AI?");
    String response = aa.nextLine();
    
if (response.equals("yes")
      twoPlayer = false;

if (response.equals("no")
      twoPlayer = true;
    
    
    if (response.length() == 0)
    {
      System.out.println("Please give a response.");
    }
    
    
    System.out.println("How many rows and columns do you want there to be?");
    int rowcol = aa.nextInt();
    
//rows = Integer.parseInt(rows);
//columns = Integer.parseInt(columns);
    
    //int[][] a = new int[ rows ][ columns ];
    //talk to nick, leo, bobby
    
  }
}
