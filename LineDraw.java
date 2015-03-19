public class LineDraw
{
  public static void main (String[] args)
  {
    boolean box = false;
    String player1 = "P1";
    String player2 = "P2";
    String lastPlayer;
    int turn = 1;
    //add incrementing turn code
    if(turn % 2 == 0)
    {
      lastPlayer = player2;
    }
    else 
    {
      lastPlayer = player1;
    }
        
//    System.out.println();
//    
//    System.out.println("               " + "  " + "0 " + "1 " + "2 " + "3 ");
//    
//    System.out.println("               " + "0 " + ". " + "._" + "._" + ". ");
//    
//    System.out.println("               " + "1 " + ". " + "|_" + "|_" + "| ");
//    
//    System.out.println("               " + "2 " + ". " + ". " + ". " + ". ");
//    
//    System.out.println("               " + "3 " + ". " + ". " + ". " + ". ");
//    
//    System.out.println();
//    
//    System.out.println();
//    
//    System.out.println("               " + "  " + "0 " + "1 " + "2 " + "3 ");
//    
//    System.out.println("               " + "0 " + ". " + ". " + ". " + ". ");
//    
//    System.out.println("               " + "1 " + ". " + ". " + ". " + ". ");
//    
//    System.out.println("               " + "2 " + ". " + ". " + ". " + ". ");
//    
//    System.out.println("               " + "3 " + ". " + ". " + ". " + ". ");
//    
//    System.out.println();
//    
    
    
    
    System.out.println();
    
    System.out.println("               " + "  " + "0   " + "1   " + "2   " + "3   " + "4   " + "5   " + "6   " + "7   " + "8   " + "9   " );
    
    System.out.println("               " + "0 " + ".___" + ".___" + ".___" + ".   " + ".   " + ".   " + ".   " + ".   " + ".   " + ".   " );
    
    System.out.println("               " + "  " + "| A " + "| A " + "| A " + "|   " + "    " + "    " + "    " + "    " + "    " + "   " );
    
    System.out.println("               " + "1 " + ".___" + ".___" + ".___" + ".   " + ".   " + ".   " + ".   " + ".   " + ".   " + ".   " );
    
    System.out.println("               " + "  " + "| B " + "| B " + "| A " + "|   " + "    " + "    " + "    " + "    " + "    " + "   " );
    
    System.out.println("               " + "2 " + ".___" + ".___" + ".___" + ".   " + ".   " + ".   " + ".   " + ".   " + ".   " + ".   " );
    System.out.println();
    
    System.out.println("               " + "3 " + ".   " + ".   " + ".   " + ".   " + ".   " + ".   " + ".   " + ".   " + ".   " + ".   " );
    System.out.println();
    
    System.out.println("               " + "4 " + ".   " + ".   " + ".   " + ".   " + ".   " + ".   " + ".   " + ".   " + ".   " + ".   " );
    System.out.println();
    
    System.out.println("               " + "5 " + ".   " + ".   " + ".   " + ".   " + ".   " + ".   " + ".   " + ".   " + ".   " + ".   " );
    System.out.println();
    
    System.out.println("               " + "6 " + ".   " + ".   " + ".   " + ".   " + ".   " + ".   " + ".   " + ".   " + ".   " + ".   " );
    System.out.println();
    
    System.out.println("               " + "7 " + ".   " + ".   " + ".   " + ".   " + ".   " + ".   " + ".   " + ".   " + ".   " + ".   " );
    System.out.println();
    
    System.out.println("               " + "8 " + ".   " + ".   " + ".   " + ".   " + ".   " + ".   " + ".   " + ".   " + ".   " + ".   " );
    System.out.println();
    
    System.out.println("               " + "9 " + ".   " + ".   " + ".   " + ".   " + ".   " + ".   " + ".   " + ".   " + ".   " + ".   " );
    System.out.println();
    
    
    System.out.println();    
    System.out.println("               " + "  " + "0   " + "1   " + "2   " + "3   " + "4   " );
    
    System.out.println("               " + "A " + ".   " + ".   " + ".   " + ".   " + ".   " );
    System.out.println("               " + "  " + "    " + "    " + "    " + "    " + "    " );
    
    System.out.println("               " + "B " + ".   " + ".   " + ".   " + ".   " + ".   " );
    System.out.println("               " + "  " + "    " + "    " + "    " + "    " + "    " );
    
    System.out.println("               " + "C " + ".   " + ".   " + ".   " + ".   " + ".   " );
    System.out.println("               " + "  " + "    " + "    " + "    " + "    " + "    " );
    
    System.out.println("               " + "D " + ".   " + ".   " + ".   " + ".   " + ".   " );
    System.out.println("               " + "  " + "    " + "    " + "    " + "    " + "    " );
    
    System.out.println("               " + "E " + ".   " + ".   " + ".   " + ".   " + ".   " );
    System.out.println("               " + "  " + "    " + "    " + "    " + "    " + "    " );
    
    
    
    //print player 1 and player 2 score by incrementing string and finding how many As or Bs there are
    //print player turn
    
    String t[][] = { 
      { "               ", "  ", "0   ", "1   ", "2   ", "3   ", "4   ", "5   ", "6   ", "7   ", "8   ", "9   \n" },
      { "               ", "0 ", ".   ", ".   ", ".   ", ".   ", ".   ", ".   ", ".   ", ".   ", ".   ", ".   \n" },  
      { "               ", "1 ", ".   ", ".   ", ".   ", ".   ", ".   ", ".   ", ".   ", ".   ", ".   ", ".   \n" },
      { "               ", "2 ", ".   ", ".   ", ".   ", ".   ", ".   ", ".   ", ".   ", ".   ", ".   ", ".   \n"  },
      { "               ", "3 ", ".   ", ".   ", ".   ", ".   ", ".   ", ".   ", ".   ", ".   ", ".   ", ".   \n"  },
      { "               ", "4 ", ".   ", ".   ", ".   ", ".   ", ".   ", ".   ", ".   ", ".   ", ".   ", ".   \n"  },
      { "               ", "5 ", ".   ", ".   ", ".   ", ".   ", ".   ", ".   ", ".   ", ".   ", ".   ", ".   \n"  },
      { "               ", "6 ", ".   ", ".   ", ".   ", ".   ", ".   ", ".   ", ".   ", ".   ", ".   ", ".   \n"  },
      { "               ", "7 ", ".   ", ".   ", ".   ", ".   ", ".   ", ".   ", ".   ", ".   ", ".   ", ".   \n"  },
      { "               ", "8 ", ".   ", ".   ", ".   ", ".   ", ".   ", ".   ", ".   ", ".   ", ".   ", ".   \n"  },
      { "               ", "9 ", ".   ", ".   ", ".   ", ".   ", ".   ", ".   ", ".   ", ".   ", ".   ", ".   \n"  }
    }; 
    
    for(int i = 0; i<t.length; i++)
      for(int j = 0; j<t[0].length; j++)
    {
      System.out.print(t[i][j]);
    }
    
    System.out.println();
    
    String g[][] = { 
      { "               ", "   ", "0   ", "1   ", "2   ", "3   ", "4   \n" },
      { "               ", "   ", "    ", "    ", "    ", "    ", "    \n" },
      { "               ", "A  ", ".   ", ".   ", ".   ", ".   ", ".   \n" },  
      { "               ", "   ", "    ", "    ", "    ", "    ", "    \n" },
      { "               ", "B  ", ".   ", ".   ", ".   ", ".   ", ".   \n" },
      { "               ", "   ", "    ", "    ", "    ", "    ", "    \n" },
      { "               ", "C  ", ".   ", ".   ", ".   ", ".   ", ".   \n" },
      { "               ", "   ", "    ", "    ", "    ", "    ", "    \n" },
      { "               ", "D  ", ".   ", ".   ", ".   ", ".   ", ".   \n" },
      { "               ", "   ", "    ", "    ", "    ", "    ", "    \n" },
      { "               ", "E  ", ".   ", ".   ", ".   ", ".   ", ".   \n" },
      { "               ", "   ", "    ", "    ", "    ", "    ", "    \n" },
      
    }; 
    

    
    for(int i = 0; i<g.length; i++)
      for(int j = 0; j<g[0].length; j++)
    {
      System.out.print(g[i][j]);
    }
    
    g[2][2] = ".___";
    g[4][2] = ".___";
    g[3][2] = "|   ";
    g[3][3] = "|   ";
    
    if (g[2][2] == ".___" && g[4][2] == ".___" && g[3][2] == "|   " && g[3][3] == "|   ")
    {
      g[3][2] = "|" + lastPlayer + " ";
    }
    
    
     for(int i = 0; i<g.length; i++)
      for(int j = 0; j<g[0].length; j++)
    {
      System.out.print(g[i][j]);
    }
 
    
  }
}