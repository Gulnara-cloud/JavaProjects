package Java.Informatics;

import java.util.Scanner;

public class Task2945 {
    /* Следующее четное
Дано целое число n. Выведите следующее за ним четное число.
При решении этой задачи нельзя использовать условную инструкцию if и циклы.

Примечание. До 01 марта 2019 г. задачу нельзя сдать на языке Паскаль.
Входные данные
Вводится натуральное число.

Выходные данные
Выведите ответ на задачу.

Примеры
Входные данные
7
Выходные данные
8
Входные данные
8
Выходные данные
10
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nextEven = ((n / 2 + 1) * 2);
        System.out.println(nextEven);
    }
}
