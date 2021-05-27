import java.io.IOException;

public class Main 
{   
   public static void main(String[] args) throws IOException, InterruptedException
   {
      new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

      JosephusGame circle = new JosephusGame();
      InputController inputController = new InputController();

      int participants = inputController.userInput("Participants (any integer between 1 and 1000): ", 1000);
  
      for(int i = 0; i < participants; i++) circle.addNode(i+1); 
        
      circle.showNthPerson(inputController.userInput("Steps (any integer between 1 and 100: ", 100), 
         inputController.userInput("Shooting interval in milliseconds (any number between 1 and 1000: ", 1000)); 
      System.out.println("HAI");
   }
}