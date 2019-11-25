package _02_gotta_catchem_all;

import _01_introduction.CustomException;

public class ExceptionMethods
{
    public double divide(double firstNumber, double secondNumber)
    {
        if (secondNumber == 0)
        {
            throw new IllegalArgumentException();
        }
        return firstNumber/secondNumber;
    }

    public String reverseString(String e)
    {
        if (e.equals(null)){
            throw new IllegalStateException();
        }
        String backwardsString = new String();
        for (int i = e.length() - 1; i >= 0; i--)
        {
        backwardsString += e.charAt(i);
        }
        System.out.println(backwardsString);
        return backwardsString;
    }
}