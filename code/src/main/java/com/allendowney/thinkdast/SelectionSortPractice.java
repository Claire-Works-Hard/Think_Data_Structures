package com.allendowney.thinkdast;

public class SelectionSortPractice {
    public void swapElement(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public int indexLowest(int[] array, int start) {
        int indexLowest = start;

        for (int i = start; i < array.length; i++) {
            if (array[i] < array[indexLowest]) {
                indexLowest = i;
            }
        }

        return indexLowest;
    }

    public int[] selectionSort(int[] array) {
        for(int i=0; i<array.length; i++) {
            int j = indexLowest(array, i);
            swapElement(array, i, j);
        }

        return array;
    }

    public static void main(String[] args) {
        SelectionSortPractice ssp = new SelectionSortPractice();

        int[] intArray = {9, 6, 0, 6, 2, 0};

        System.out.print("selectionSort 전 array {");
        for (int i = 0; i < intArray.length; i++) {
            if(i != intArray.length-1) {
                System.out.print(intArray[i] + ",");
            } else {
                System.out.print(intArray[i]);
            }
        }
        System.out.println("}");

        ssp.selectionSort(intArray);

        System.out.print("selectionSort 후 array {");
        for (int i = 0; i < intArray.length; i++) {
            if(i != intArray.length-1) {
                System.out.print(intArray[i] + ",");
            } else {
                System.out.print(intArray[i]);
            }
        }
        System.out.println("}");

    }
}
