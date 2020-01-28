package com.sparta.tk.engineering50.JavaBasic;

public class BubbleSort {
    public static void BubbleSorting(int[]numbers) {
       // numbers = new int[]{8, 3, 6, 5, 7, 1, 9, 2};
        int temp;
        boolean fixed = false;
        while (!fixed) {
            fixed = true;
            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    temp = numbers[i + 1];
                    numbers[i + 1] = numbers[i];
                    numbers[i] = temp;
                    fixed = false;
                }
            }
        }
    }
}