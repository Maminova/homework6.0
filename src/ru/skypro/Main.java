package ru.skypro;



import java.util.Random;
import java.util.Scanner;

public class Main {

    // write your code here


    int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {

            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void main(String[] args) {
        java.util.Random random = new java.util.Random();
        // задание 1
        int[] arr = new int[30];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
            sum += arr[i];
        }
        System.out.println("Сумма трат за месяц составила = " + sum + "руб");

        // задание 2
        int[] arrM = generateRandomArray();
        int max = arrM[0];
        for (int i = 0; i < arrM.length; i++) {
            if (max < arrM[i]) {
                max = arrM[i];
            }
        }
        System.out.println("Максимальная сумма трат за день составила " + max + "рублей");

        int[] arrMin = generateRandomArray();
        int min = arrMin[0];
        for (int i = 0; i < arrMin.length; i++) {
            if (max > arrM[i]) {
                max = arrMin[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + max + "рублей");

        // Задание 3
        int[] arrMed = generateRandomArray();
        for (int i = 0; i < arrMed.length; i++) {
            sum += arrMed[i];
        }
        sum /= arrMed.length;
        System.out.println("Средняя сумма трат за месяц: " + sum + "руб");
        // Задание 4
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
                System.out.print(reverseFullName[i]);
            }
        }

        }










        
        

   




    