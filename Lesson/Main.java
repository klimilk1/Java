package com.company;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        var random = new SecureRandom();
        var list = Arrays.asList("Белов Матвей", "Волощенко Егор", "Ермакова Анастаcия", "Корнеев Иван", "Кулаев Денис");
        var randomElement = list.get(random.nextInt(list.size()));
        System.out.println(randomElement);
        Scanner scanner = new Scanner(System.in);
//        System.out.println("print");

        if (randomElement == "Белов Матвей") {
            System.out.println("Оценка 4");
        }
        else if (randomElement == "Волощенко Егор"){
            System.out.println("Оценка 4");
        }
        else if (randomElement == "Ермакова Анастаcия"){
            System.out.println("Оценка 5");
        }
        else if (randomElement == "Корнеев Иван"){
            System.out.println("Оценка 4");
        }
        else if (randomElement == "Кулаев Денис"){
            System.out.println("Оценка 5");
        }

    }
}
