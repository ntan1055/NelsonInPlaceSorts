package com.company;

public class InPlaceSorts extends SortingUtil
{
    public static void bubbleSort(String[] arr)
    {
        for(int i = 1; i < arr.length; i++)
        {
            for(int j = 0; j < arr.length - i; j++)
            {
                if(arr[j].compareTo(arr[j + 1]) > 0)
                {
                    stringSwap(arr, i, j);
                }
            }
        }
    }

    public static void selectionSort(double[] arr)
    {
        int min;
        for(int i = 0; i < arr.length; i++)
        {
            min = i;
            for(int j = i + 1; j < arr.length; j++)
            {
                if(arr[j] < arr[min])
                {
                    min = j;
                }
            }
            if(min != i)
            {
                doubleSwap(arr, i, min);
            }
        }
    }

    public static void insertionSort(int[] arr)
    {
        int sub = 0;
        for(int i = 1; i < arr.length; i++)
        {
            for(int j = i; j > 0; j--)
            {
                if(arr[j] < arr[j-1])
                {
                    intSwap(arr, j, sub);
                }
            }
        }
    }
}
