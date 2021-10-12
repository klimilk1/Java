package com.company;
//номер 16
import java.util.Scanner;
public class Lesson {
    public static void main(String args[]) {
        int[] newArray1 = {1, 3, 5};
        int[] newArray2 = addinArray(newArray1, 5);
        for (int value : newArray2) {
            System.out.println(value);
        }
    }

    public static int[] addinArray(int[] arr, int val) {
        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        System.out.println(newArr.length);
        newArr[arr.length] = val;
        return newArr;
    }

}
//номер 15
//public class Lesson {
//    public static void main(String[] args) {
//        int[] a = new int[] { 1, 2, 4 };
//
//        System.out.println(isStepEven(a));
//    }
//
//    public static boolean isStepEven(int[] array) {
//        if (array.length < 2) return false;
//
//        for (int i = 0; i < array.length - 1; i++) {
//            if ((array[i + 1] - array[i]) % 2 == 0) continue;
//            return false;
//        }
//
//        return true;
//    }
//}


