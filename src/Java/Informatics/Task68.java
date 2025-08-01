package Java.Informatics;

import java.util.Scanner;

public class Task68 {
    /* Количество элементов больших обоих соседей
Дан массив, состоящий из целых чисел.Напишите программу,
которая в данном массиве определит количество элементов,
у которых два соседних и, при этом, оба соседних элемента меньше данного.

Входные данные
Сначала задано число 𝑁 — количество элементов в массиве (1≤𝑁≤100).
Далее через пробел записаны 𝑁 чисел — элементы массива.
Массив состоит из целых чисел.

Выходные данные
Необходимо вывести количество элементов массива,
у которых два соседа и которые при этом строго больше обоих своих соседей.

Примеры
Входные данные
5
1 2 3 4 5

Выходные данные
0
5
Входные данные
5
1 5 1 5 1

Выходные данные
2
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 1; i < n - 1; i++) {
            if (a[i] > a[i - 1] && a[i] > a[i + 1]) {
                count++;
            }
        }
        System.out.println(count);
    }
}
