package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите массив: ");
        int[] arr = {1, 3, 4, 5};
        int[] arr2 = swapArr(arr);
        for (int value: arr2){
            System.out.print(value);

        }
    }
    public static int[] swapArr(int[] arr){
        int first = arr[0];
        int last = arr[arr.length-1];
        arr[0] = last;
        arr[arr.length-1] = first;
        return arr;
    }
}





