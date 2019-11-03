package chapter2;

import java.util.Scanner;

public class Exercise6
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 1000: ");
        int value = input.nextInt();

        int sum = 0;
        while (value != 0)
        {
            sum += value % 10;
            value /= 10;
        }

        System.out.println("The sum of the digits is: " + sum);

        input.close();
    }
}
