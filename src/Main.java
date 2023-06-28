public class Main {
    public static void main(String[] args)
    {
        int i;

        for (i = 0; i <= 30; ++i) //Counting up to 30 from 0//
        {
            System.out.println(i);
        }
        System.out.println("\n"); //Using this to command to create a space so the different operations just dont run into each other when they are ran.

        for (i = 30; i >= 0; --i) //Counting down to 0 from 30//
        {
            System.out.println(i);
        }
        System.out.println("\n");

        for (i = 0; i <=18; i += 3) //Counting to 18 by 3//
        {
            System.out.println(i);
        }
        System.out.println("\n");

        for (i = 10; i >= 0; i -= 2) //Counting down from 10 by 2//
        {
            System.out.println(i);
        }
        System.out.println("\n");

    }
}