import java.io.IOException;

public class Main 
{   
   public static void main(String[] args) throws IOException, InterruptedException
   {
      new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

      JosephusGame circle = new JosephusGame();
      InputController inputController = new InputController();

      int[] userInput = inputController.userInput();
  
      for(int i = 0; i < userInput[0]; i++) circle.addNode(i+1); 
        
      circle.showNthPerson(userInput[1], userInput[2]);  
      
   }
}