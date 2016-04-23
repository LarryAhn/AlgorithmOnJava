package com.zuperztar.algorithm.sort;

public class SelectionSortAlgorithm {

    public static void selectionSort(int[] data) {
        int tempSwap = 0;

        for (int i = 0; i < data.length - 1; i++) {
            for (int j = i + 1; j < data.length; j++) {
                if (data[i] > data[j]) {
                    tempSwap = data[i];
                    data[i] = data[j];
                    data[j] = tempSwap;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] numbers = {2, 7, 1, 3, 5, 6, 4};

        for (int i : numbers)
            System.out.print(i + " ");

        System.out.println("");
        System.out.println("Selection Sort");

        selectionSort(numbers);

        for (int i : numbers)
            System.out.print(i + " ");
    }

}
