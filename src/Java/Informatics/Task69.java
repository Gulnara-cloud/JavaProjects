package Java.Informatics;

import java.util.Scanner;

public class Task69 {
    /*Переставить элементы в обратном порядке

Напишите программу, которая переставляет элементы массива
в обратном порядке без использования дополнительного массива.
Программа должна считать массив, поменять порядок его элементов,
затем вывести результат (просто вывести элементы массива
в обратном порядке – недостаточно!)

Входные данные
Сначала задано число 𝑁 — количество элементов в массиве (1≤𝑁≤35).
Далее через пробел записаны 𝑁 чисел — элементы массива.
Массив состоит из целых чисел.

Выходные данные
Необходимо вывести массив, полученный после перестановки элементов.

Примеры
Входные данные
6
4 5 3 4 2 3

Выходные данные
3 2 4 3 5 4
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];

        for(int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        for(int i = 0; i < n / 2; i++) {
            int temp = array[i];
            array[i] = array[n - 1 - i];
            array[n - 1 - i] = temp;
        }
        for(int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
