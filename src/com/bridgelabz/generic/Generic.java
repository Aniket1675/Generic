package com.bridgelabz.generic;

public class Generic
{
    static <E extends Comparable<E>>
    void compare(E[] arrayValue)
    {
        E maximum = arrayValue[0];
        for (int i = 1; i < arrayValue.length; i++)
        {
            int result = maximum.compareTo(arrayValue[i]);
            if(result < 0)
            {
                maximum = arrayValue[i];
            }
        }
        printMax(maximum);
    }
    public static <E> void printMax(E maximum)

    {
        System.out.println("The maximum value is " + maximum);
    }

}
