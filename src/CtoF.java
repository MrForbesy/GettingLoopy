
import java.util.Scanner;
public class CtoF
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        //defining variables//
        double celsius = 0; //defining celsius here, so it gets initialized in the in bedded if statement.//
        double fahrenheit;
        boolean validInput;

        do
        {
            System.out.print("Enter a temperature in Celsius: ");
            if (in.hasNextDouble())
            {
                celsius = in.nextDouble();//stores the imputed number into celsius variable.//
                fahrenheit = (celsius * 9 / 5) + 32;
                System.out.println("The temperature in Fahrenheit: " + fahrenheit);
                validInput = true;

                if (celsius == 0)//Will check to see if the user has inputed the freezing or boiling point//
                {
                    System.out.println("You have entered the freezing point!");
                    validInput = true;
                }
                else if (celsius == 100)
                {
                    System.out.println("You have entered the boiling point!");
                    validInput = true;
                }
                else
                {

                }
            }

            else
            {
                System.out.println("Invalid input. Please enter a valid number.");//Will inform user of error and will continue to ask for a new input until a correct one is received.//
                in.nextLine();
                validInput = false;
            }
        }
        while (!validInput);

        in.close();
    }
}
