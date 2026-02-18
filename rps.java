import java.util.*;
public class rps{
    public static void main(String[] args){
      Random r=new Random();
      int c = r.nextInt(1, 4);
      String g ="";
      switch(c){
        case 1:
          g="R";
          break;
        case 2:
          g="P";
          break;
        case 3:
          g="S";
          break;
      }
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter \"R\" or \"S\" or \"P\":");
      String u = sc.nextLine();
      if(!u.equals("R")&& !u.equals("P")&& !u.equals("S")){
        System.out.println("Enter R or P or S");
      }
      else{
        if((g.equals("R")&&u.equals("P"))||
        (g.equals("P")&&u.equals("S"))||
        (g.equals("S")&&u.equals("R"))){
          System.out.println(g);
           System.out.println("You Won");
        }
        else if(g.equals(u)){
          System.out.println(g);
          System.out.println("Draw");
        }
        else{
          System.out.println(g);
          System.out.println("Computer Won");
        }
      }
    }
}