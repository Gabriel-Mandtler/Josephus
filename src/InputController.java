import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputController 
{
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    public InputController() throws IOException
    {
    }

    public int[] userInput() throws IOException
    {
        String userInput = "";
        int[] returnValue = new int[3];

        while(true)
        {
            System.out.println("Please input valid number between 1 and 1000 (participants)...");
            userInput = input.readLine();
            if(userInput.matches("^\\d+$"))
            {
                System.out.println("Please input a valid number between 1 and 100 (steps)...");
                returnValue[0] = Integer.parseInt(userInput);
                userInput = input.readLine();
                if(userInput.matches("^\\d+$"))
                {
                    System.out.println("Please input a valid number between 1 and 10000 (shooting interval in milliseconds)...");
                    returnValue[1] = Integer.parseInt(userInput);
                    userInput = input.readLine();
                    if(userInput.matches("^\\d+$"))
                    {
                        returnValue[2] = Integer.parseInt(userInput);
                        if(returnValue[0] > 0 && returnValue[0] < 1001 && returnValue[1] > 0 
                        && returnValue[1] < 101 && returnValue[2] > 0 && returnValue[2] < 10001) break;
                        else continue;
                    }                    
                }
            }            
        }
        return returnValue;
    }
}