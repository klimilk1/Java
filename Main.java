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
//номер 9
//import java.util.Arrays;
//
//public class Main {
//    public static void main(String[] args) {
//        int[] array1 = {1,2};
//        int[] array2 = {3,4};
//
//        System.out.println(Arrays.toString(concat(array1.length, array1, array2.length, array2)));
//    }
//
//    public static int[] concat(int array1Length, int[] array1, int array2Length, int[] array2) {
//        int[] newArray = new int[array1Length + array2Length];
//
//        for (int i = 0; i < array1Length; i++) {
//            newArray[i] = array1[i];
//        }
//
//        for (int i = 0; i < array2Length; i++) {
//            newArray[array1Length + i] = array2[i];
//        }
//
//        return newArray;
//    }
//}
//номер 4
//public static void main(String [] args) {
// Scanner input = new Scanner(System.in);
// System.out.println("Введите первое число: ");
// int a =input.nextInt();
// System.out.println("Введите второе число: ");
// int b =input.nextInt();
// System.out.println("Введите третье число: ");
// int c =input.nextInt();
// if(a>b)
// if(a>c)
// System.out.println(a);
// else {
// if(b>c)
// System.out.println(b);
// }else {
// System.out.println(c);
// }
//}
//}
//номер 3
//System.out.println("Введите первое число: ");
// int a =input.nextInt();
// System.out.println("Введите второе число: ");
// int b =input.nextInt();
// if (a == b)
// System.out.println(true);
// else {
// System.out.println(false);
// }
// }
//}





