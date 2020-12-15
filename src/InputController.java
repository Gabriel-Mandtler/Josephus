import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputController 
{
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    public InputController() throws IOException
    {
    }

    public int userInput(String showMessage, int maxValue) throws IOException
    {
        String userInput = "";
        int userInputAsInt;

        while(true)
        {
            System.out.println(showMessage);
            userInput = input.readLine();
            if(userInput.matches("^\\d+$"))
            {
                userInputAsInt = Integer.parseInt(userInput);
                if(userInputAsInt > 0 && userInputAsInt <= maxValue) break;
                else continue;
            } 
        }
        return userInputAsInt;
    }
}