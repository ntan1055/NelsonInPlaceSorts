package com.company;

public class SortingUtil
{
    public static void stringSwap(String[] arr, int j)
    {
        String x = arr[j];
        arr[j] = arr[j + 1];
        arr[j + 1] = x;
    }

    public static void doubleSwap(double[] arr, int i, int j)
    {
        double x = arr[i];
        arr[i] = arr[j];
        arr[j] = x;
    }

    public static void intSwap(int[] arr, int j, int sub)
    {
       sub = arr[j];
       arr[j] = arr[j-1];
       arr[j-1] = sub;
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

    public static void checkSum(int[] before, int[] after)
    {
        int beforeSum = 0;
        int afterSum = 0;
        for (int i = 0; i < before.length; i++) {
            beforeSum = beforeSum + before[i];
        }
        for (int j = 0; j < after.length; j++) {
            afterSum = afterSum + after[j];
        }
        if (beforeSum == afterSum)
        {
            System.out.println("The sum before and after are equal.");
        }
        else if (beforeSum != afterSum)
        {
            System.out.println("The sum before and after are not equal.");
        }
    }

    public static void isSorted(int[] array)
    {
        for(int j = 1; j < array.length; j++)
        {
            int i = j - 1;
            if(array[j] < array[i])
            {
                System.out.println("The array is not sorted.");
                j = j + array.length;
                i = i + j;
            }
            else
            {
                System.out.println("The array is not sorted.");
            }
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
