package ru.DZ;

public class DZ_1 {
    public static void main(String[] args) {
//        1. Задан массив, например, nums = [1,7,3,6,5,6]. Написать программу,
//        которая найдет индекс i для этого массива такой, что сумма элементов
//        с индексами < i равна сумме элементов с индексами > i.

        int[] numbers = {1,7,3,6,5,6};
        int index = 0;
        index = FindIndex(numbers);
        System.out.println(index == 0 ? "В массиве нет такого индекса" : index);

    }


    static int FindIndex(int[] array) {
        int index = 0;

        for (int i = 1; i < array.length - 1; i++) {
            int leftSum = 0;
            int rightSum = 0;

            for (int j = 0; j < i; j++) {
                leftSum = leftSum + array[j];
            }
            for (int j = i + 1; j < array.length; j++) {
                rightSum = rightSum + array[j];
            }
            if (leftSum == rightSum) {
                index = i;
            }
        }
        return index;
    }



}
