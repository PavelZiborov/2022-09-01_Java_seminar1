package ru.geekbrains;

public class Task3 {
    public static void main(String[] args) {

        String str = "asdas asdasdasd dfgdfg dfdfgdfaaaaa asa bbb aaa";
        String[] words = str.split(" ");

        System.out.print("Изначальная строка:\n");
        for (int i = 0; i < words.length; i++) 
            System.out.print(words[i] + " ");
        
        System.out.print("\nПолучившаяся строка:\n");
        for (int i = words.length -1; i >= 0; i--) 
            System.out.print(words[i] + (i > 0 ? " " : "\n"));
        
    }
    
}
