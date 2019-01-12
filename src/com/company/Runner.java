package com.company;

public class Runner {

    public static void main(String[] args)
    {
        String[] stringArr = {"Nelson", "Bob", "Watermelon", "Humpty-Dumpty"};
        double[] doubleArr = {8.5, 6.6, 6.9, 1.1, 8.8, 9.9};
        int[] intArr = {8,6,7,5,3,0,9,10,1,2,3};

        String[] bubbleSortArr = SortingUtil.copyStringArray(stringArr);
        double[] selectionSortArr = SortingUtil.copyDoubleArray(doubleArr);
        int[] insertionSortArr = SortingUtil.copyIntArray(intArr);

        System.out.print("Before Bubble Sorting: ");
        for(String String:bubbleSortArr)
            System.out.print(String + " ");
        System.out.println();

        InPlaceSorts.bubbleSort(bubbleSortArr);

        System.out.print("After Bubble Sorting: ");
        for(String String:bubbleSortArr)
            System.out.print(String + " ");
        System.out.println();

        System.out.print("Before Selection Sorting: ");
        for(double num:selectionSortArr)
            System.out.print(num + " ");
        System.out.println();

        InPlaceSorts.selectionSort(selectionSortArr);

        System.out.print("After Selection Sorting: ");
        for(double num:selectionSortArr)
            System.out.print(num + " ");
        System.out.println();

        System.out.print("Before Insertion Sorting: ");
        for(int num:insertionSortArr)
            System.out.print(num + " ");
        System.out.println();

        InPlaceSorts.insertionSort(insertionSortArr);

        System.out.print("After Insertion Sorting: ");
        for(int num:insertionSortArr)
            System.out.print(num + " ");
        System.out.println();

        SortingUtil.checkDoubleSum(doubleArr, selectionSortArr);
        SortingUtil.checkIntSum(intArr, insertionSortArr);

        SortingUtil.areStringsSorted(bubbleSortArr);
        SortingUtil.areDoubleValuesSorted(selectionSortArr);
        SortingUtil.areIntValuesSorted(insertionSortArr);

        long time = System.nanoTime();
        SortingUtil.randIntArr(11);
        time = System.nanoTime() - time;

        System.out.println("Time Taken: " + time);
    }
}
