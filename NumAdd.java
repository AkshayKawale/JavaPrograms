import java.io.*;

public class NumAdd {

    static int additionNum (int number)
    {
        int sum = 0;

        while (number != 0)
        {
            sum = sum + number % 10;
            number = number/10;
        }

    return sum;
    }

    public static void main(String[] args)
    {
        int number = 142;

        System.out.println(additionNum(number));
    }
}
