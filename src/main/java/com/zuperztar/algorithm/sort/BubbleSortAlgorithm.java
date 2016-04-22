package com.zuperztar.algorithm.sort;

public class BubbleSortAlgorithm {

    public static void bubbleSort(int[] arr) {
        boolean switched;
        do {
            switched = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i + 1] < arr[i]) {
                    int temp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = temp;
                    switched = true;
                }
            }
        } while (switched);
    }

    public static void main(String[] args) {
        int[] numbers = {2, 7, 1, 3, 5, 6, 4};

        for (int i : numbers)
            System.out.print(i + " ");

        System.out.println("");
        System.out.println("Bubble Sort");

        bubbleSort(numbers);

        for (int i : numbers)
            System.out.print(i + " ");

    }

}
