public class FirstLetterExtraCredit
{
    public static void main(String[] args)
    {
        int top = 8; //Creates the height of the upper half//

        //Creates upper half of the M//
        for (int row = 0; row < top; row++)
        {
            for (int col = 0; col <= row; col++)
            {
                System.out.print("*");
            }
            for (int mid = 0; mid < (2 * (top - row - 1)); mid++)
            {
                System.out.print(" ");
            }
            for (int col = 0; col <= row; col++)
            {
                System.out.print("*");
            }
            for (int mid = 0; mid < (top - row); mid++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }

        //Creates the the lower half
        for (int row = 1; row <=5; row++)
        {
            for (int col = 1; col <= 16; col++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("\n");
    }

}
