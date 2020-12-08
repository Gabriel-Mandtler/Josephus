import java.util.*;
public class Main
{   
   public static void main(String[] args)
   {
      int participants = 800;
      int steps = 77;

      JosephusGame circle = new JosephusGame();
  
      for(int i = 0; i<participants; i++)
      {
         circle.addNode(i+1);
      } 
        
      circle.showNthPerson(steps);      
   }
}