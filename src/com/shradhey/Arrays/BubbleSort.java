package com.shradhey.Arrays;

public class BubbleSort {

    public static void main(String[] args) {

        int[] myarray = {10,9,8,7,6,5,4,3,2,1};
        BubbleSort bubbleSort = new BubbleSort();
        int[] sortedArray = bubbleSort.sort(myarray);

        for(int item : sortedArray) {
            System.out.println(item);
        }

    }

    public int[] sort(int array[]) {
        int temp;
        for(int i = 0;i < array.length;i++) {
            for(int j = i + 1;j < array.length;j++) {
                if(array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
       return  array;
    }
}
