import java.lang.*;
import java.io.*;
import java.util.*;

class ReverseString
{
    public static void main(String[] args)
    {
        String inputString = "ILoveJava";

        char[] chrSet = inputString.toCharArray();

        for (int i = chrSet.length-1; i>=0; i--)
            System.out.print(chrSet[i]);
    }
}