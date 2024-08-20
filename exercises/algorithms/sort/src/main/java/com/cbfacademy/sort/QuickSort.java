package com.cbfacademy.sort;

public class QuickSort implements ArraySorter {

    public void sort(int[] arr, int startIndex, int endIndex) {
        if (startIndex < endIndex) {
            int pivotIndex = partition(arr, startIndex, endIndex);
            sort(arr, startIndex, pivotIndex - 1);
            sort(arr, pivotIndex + 1, endIndex);
        }


    }
    public int partition (int arr[], int startIndex, int endIndex) {
        int pivot = arr[endIndex];
       int boundaryIndex = startIndex - 1;
        for (int currentIndex = startIndex ; currentIndex < endIndex; currentIndex++) {
            if (arr[currentIndex++] <= pivot) {
                boundaryIndex = boundaryIndex + 1;
                swap(arr, boundaryIndex, currentIndex);
            }
        }

        swap(arr, boundaryIndex + 1, endIndex);
        return boundaryIndex + 1;
    }

   public void swap(int arr[], int leftIndex, int rightIndex) {

       int temp = arr[leftIndex];
       arr[leftIndex] = arr[rightIndex];
       arr[rightIndex] = temp;
   }

    }


//{ 55, 18, -9, 3, 107, 24, 66, 5 } prim. tracker, sec. tracker, temp
//
//        { 55, 18, -9, 3, 107, 24, 66, 5 }
//
//                { 55, 18, -9, 3, 107, 24, 66, 5 }
//
//                { -9, 3, 55, 18, 107, 24, 66, 5 }
//
//                { -9, 18, 55, 3, 107, 24, 66, 5 }