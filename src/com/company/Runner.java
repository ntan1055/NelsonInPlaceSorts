package com.company;

public class Runner {

    public static void main(String[] args)
    {
        String[] stringArr = {"Nelson", "John", "Bob", "Watermelon", "Array"};
        double[] doubleArr = {8.5, 6.6, 6.9, 1.1, 8.8, 9.9};
        int[] testArr = {8,6,7,5,3,0,9,10,1,2,3};

        SortingUtil.copyIntArray(testArr);
        String[] bubbleSortArr = SortingUtil.copyStringArray(stringArr);
        double[] selectionSortArr = SortingUtil.copyDoubleArray(doubleArr);
        int[] insertionSortArr = SortingUtil.copyIntArray(testArr);

        System.out.print("Before Sorting: ");
        for(int num:testArr)
            System.out.print(num + " ");
        System.out.println();

        InPlaceSorts.bubbleSort(stringArr);

        System.out.print("After Bubble Sort: ");
        for(String String:bubbleSortArr)
            System.out.print(String + " ");
        System.out.println();

        InPlaceSorts.selectionSort(selectionSortArr);

        System.out.print("After Selection Sort: ");
        for(double num:selectionSortArr)
            System.out.print(num + " ");
        System.out.println();

        InPlaceSorts.insertionSort(insertionSortArr);

        System.out.print("After Insertion Sort: ");
        for(int num:insertionSortArr)
            System.out.print(num + " ");
        System.out.println();

        long time = System.nanoTime();
        SortingUtil.randIntArr(11);
        time = System.nanoTime() - time;

        System.out.println("Time Taken: " + time);
    }
}
