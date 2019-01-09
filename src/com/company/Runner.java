package com.company;

public class Runner {

    public static void main(String[] args)
    {
        int[] testArr = {8,6,7,5,3,0,9,10,1,2,3};
        int[] before = testArr;
        int[] bubbleSortArr = testArr;
        int[] selectionSortArr = testArr;
        System.out.print("Before Sorting: ");
        for(int num:testArr)
            System.out.print(num + " ");
        System.out.println();

        InPlaceSorts.bubbleSort(bubbleSortArr);
        int[] afterBubble = bubbleSortArr;

        InPlaceSorts.selectionSort(selectionSortArr);
        int[] afterSelection = selectionSortArr;

        System.out.print("After Bubble Sort: ");
        for(int num:afterBubble)
            System.out.print(num + " ");
        System.out.println();

        System.out.print("After Selection Sort: ");
        for(int num:afterSelection)
            System.out.print(num + " ");
        System.out.println();

        SortingUtil.checkSum(before, afterBubble);
        SortingUtil.checkSum(before, afterSelection);

        long time = System.nanoTime();
        SortingUtil.randIntArr(11);
        time = System.nanoTime() - time;

        System.out.println("Time Taken: " + time);
    }
}
