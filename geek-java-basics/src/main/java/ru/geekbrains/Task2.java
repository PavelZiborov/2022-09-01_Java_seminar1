package ru.geekbrains;

public class Task2 {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 0, 1, 1, 1, 0, 1, 1 };
        int count = 0;
        int maxElements = 0;
        for (int i : arr) {
            if (i == 1) {
                count++;
            }
            else
            {
                if (maxElements < count)
                    maxElements = count;
                count = 0;
            }
        }
        System.out.println(count > maxElements ? count : maxElements);      
    }
}
