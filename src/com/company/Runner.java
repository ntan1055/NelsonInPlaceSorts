package com.company;

public class Runner {

    public static void main(String[] args)
    {
        int[] testArr = {8,6,7,5,3,0,9,10,1,2,3};
        SortingUtil.copyIntArray(testArr);
        int[] bubbleSortArr = SortingUtil.copyIntArray(testArr);
        int[] selectionSortArr = SortingUtil.copyIntArray(testArr);
        int[] insertionSortArr = SortingUtil.copyIntArray(testArr);
        System.out.print("Before Sorting: ");
        for(int num:testArr)
            System.out.print(num + " ");
        System.out.println();

        InPlaceSorts.bubbleSort(bubbleSortArr);

        System.out.print("After Bubble Sort: ");
        for(int num:bubbleSortArr)
            System.out.print(num + " ");
        System.out.println();

        InPlaceSorts.selectionSort(selectionSortArr);

        System.out.print("After Selection Sort: ");
        for(int num:selectionSortArr)
            System.out.print(num + " ");
        System.out.println();

        InPlaceSorts.insertionSort(selectionSortArr);

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
