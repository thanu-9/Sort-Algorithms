package com.sparta.tk.engineering50.JavaBasic;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] numbers = new int[]{8, 3, 6, 5, 7, 1, 9, 2};
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.BubbleSorting(numbers);
        for (int i:numbers){
            System.out.println(i+" ");
        }

    }
}
