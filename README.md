# Java
package com.company;
public class Main {
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
