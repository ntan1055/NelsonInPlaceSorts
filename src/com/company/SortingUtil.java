package com.company;

public class SortingUtil
{
    public static void stringSwap(String[] arr, int i, int j)
    {
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void doubleSwap(double[] arr, int i, int j)
    {
        double temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void intSwap(int[] arr, int j, int temp)
    {
       temp = arr[j];
       arr[j] = arr[j-1];
       arr[j-1] = temp;
    }

    public static int[] randIntArr(int count)
    {
        int[] array = new int[count];
        for(int i = 0; i < count; i++)
        {
            array[i] = (int)(Math.random() * 10001);
        }
        return array;
    }

    public static void checkDoubleSum(double[] before, double[] after)
    {
        double beforeSum = 0;
        double afterSum = 0;
        for (int i = 0; i < before.length; i++)
        {
            beforeSum = beforeSum + before[i];
        }
        for (int j = 0; j < after.length; j++)
        {
            afterSum = afterSum + after[j];
        }
        if (beforeSum == afterSum)
        {
            System.out.println("The sum before and after are equal for the double arr.");
        }
        else if (beforeSum != afterSum)
        {
            System.out.println("The sum before and after are not equal for the double array.");
        }
    }

    public static void checkIntSum(int[] before, int[] after)
{
    int beforeSum = 0;
    int afterSum = 0;
    for (int i = 0; i < before.length; i++)
    {
        beforeSum = beforeSum + before[i];
    }
    for (int j = 0; j < after.length; j++)
    {
        afterSum = afterSum + after[j];
    }
    if (beforeSum == afterSum)
    {
        System.out.println("The sum before and after are equal for the int array.");
    }
    else if (beforeSum != afterSum)
    {
        System.out.println("The sum before and after are not equal for the int array.");
    }
}
    public static void areStringsSorted(String[] arr)
    {
        boolean sorted = true;
        for(int i = 0; i < arr.length - 1; i++)
        {
            if(arr[i].length() > arr[i + 1].length())
            {
                sorted = false;
            }
        }
        if(sorted == false)
        {
            System.out.println("The string array is not sorted.");
        }
        if(sorted == true)
        {
            System.out.println("The string array is sorted.");
        }
    }

    public static void areDoubleValuesSorted(double[] arr)
    {
        boolean sorted = true;
        for(int i = 0; i < arr.length - 1; i++)
        {
            if(arr[i] > arr[i + 1])
            {
                sorted = false;
            }
        }
        if(sorted == false)
        {
            System.out.println("The double array is not sorted.");
        }
        if(sorted == true)
        {
            System.out.println("The double array is sorted.");
        }
    }

    public static void areIntValuesSorted(int[] arr)
    {
        boolean sorted = true;
        for(int i = 0; i < arr.length - 1; i++)
        {
            if(arr[i] > arr[i + 1])
            {
                sorted = false;
            }
        }
        if(sorted == false)
        {
            System.out.println("The int array is not sorted.");
        }
        if(sorted == true)
        {
            System.out.println("The int array is sorted.");
        }
    }

    public static String[] copyStringArray(String[] arr)
    {
        String[] copy = new String[arr.length];
        int j = 0;
        for(int i = 0; i < arr.length; i++)
        {
            copy[j] = arr[i];
            j = j + 1;
        }
        return copy;
    }

    public static int[] copyIntArray(int[] arr)
    {
        int[] copy = new int[arr.length];
        int j = 0;
        for(int i = 0; i < arr.length; i++)
        {
            copy[j] = arr[i];
            j = j + 1;
        }
        return copy;
    }

    public static double[] copyDoubleArray(double[] arr)
    {
        double[] copy = new double[arr.length];
        int j = 0;
        for(int i = 0; i < arr.length; i++)
        {
            copy[j] = arr[i];
            j = j + 1;
        }
        return copy;
    }
}
