public class NestingForLoop
{
    public static void main(String[] args)
    {
        //Creates the shape by adding an * to each line and stopping where there is a line with 5 *//
        for (int row = 1; row <= 5; row++)
        {
            for (int col = 1; col <= row; col++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("\n");

        //Creates the shape starting with 5 * and subtracts one from each line until there is only 1 in the last line//
        for (int row = 5; row >=1; row-- )
        {
            for (int col = 1; col <= row; col++ )
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("\n");

        //Creates 5 rows that each have 5 * in them//
        for (int row = 1; row <= 5; row++)
        {
            for (int col = 1; col <=5; col++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("\n");

    }
}

