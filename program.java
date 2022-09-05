
/*
 * program
 */
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class program {
    public static void main(String[] args) {
        //
        System.out.println("Hellow World"); // вывести на экран sysout
        System.out.println("bye World");

        // идентификация переменных
        String A = "123";
        System.out.println(A); // 123
        String B = null;
        System.out.println(B); // null

        int C = 10;
        System.out.println(C); // 10
        int D = 100_123_111;
        System.out.println(D); // 100123111
        System.out.println(Integer.MAX_VALUE); // 2147483647
        System.out.println(Integer.MIN_VALUE); // -2147483648

        double E = 145.45;
        System.out.println(E); // 145.45

        float F = 112.2f;
        System.out.println(F); // 112.2

        char ch = 123;
        System.out.println(ch); // {
        char ch2 = '{';
        System.out.println(ch2); // {

        boolean f = true && false;
        System.out.println(f); // false
        boolean flag1 = 123 <= 234;
        System.out.println(flag1); // true
        boolean flag2 = 123 >= 234 || flag1;
        System.out.println(flag2); // true
        boolean flag3 = flag1 ^ flag2;
        System.out.println(flag3); // false

        String msg = "Hello world";
        System.out.println(msg);

        String s = "qwer";
        System.out.println(s); // qwer
        System.out.println(s.length()); // 4
        System.out.println(s.charAt(2)); // e

        // неявная типизация
        var i = 123;
        System.out.println(i); // 123
        System.out.println(getType(i)); // Integer
        var j = 123.66;
        System.out.println(j); // 123
        System.out.println(getType(j)); // Double

        /*
         * операции
         * Присваивание: =
         * Арифметические: *, /, +, -, %, ++, --
         * Операции сравнения: <, >, ==, !=, >=, <=
         * Логические операции: ||, &&, ^, ! - если ставим одну | или одну & то
         * программа будет проверять оба выражения слева и справа
         * Побитовые операции <<, >>, &, |, ^
         */

        int a = 100;
        System.out.println(a);
        int b = --a - --a;
        System.out.println(b);

        // одномерные массивы
        int[] arr = new int[10]; // по умолчанию нули
        System.out.println(arr.length); // 10 (количество элементов)
        System.out.println(arr[3]); // 0
        arr[3] = 13;
        System.out.println(arr[3]); // 13

        int[] arr2 = new int[] { 1, 2, 3 }; // сразу добавить в массив элементы
        System.out.println(arr2);

        // двумерные
        int[] arr3[] = new int[3][5]; // объявление массива из 3 строк и 5 столбцов
        for (int[] line : arr3) {
            for (int item : line) {
                System.out.printf("%d", item);
            }
            System.out.println();
        }

        // int[][] arr4 = new int[2][3];
        // for (int k = 0; k < arr.length; k++) {
        // for (int m = 0; j < arr4[k].length; m++) {
        // System.out.printf("%d ", arr4[k][m]);
        // }
        // System.out.println();
        // }

        // ввод текста из консоли (import java.util.Scanner;)
        Scanner iScanner = new Scanner(System.in);

        // System.out.printf("name: ");
        // String name = iScanner.nextLine();
        // System.out.printf("Привет, %s!", name);

        // System.out.printf("int x: ");
        // int x = iScanner.nextInt();
        // System.out.printf("double y: ");
        // double y = iScanner.nextDouble();
        // System.out.printf("%d + %f = %f", x, y, x + y);

        // System.out.printf("int a: ");
        // boolean flag = iScanner.hasNextInt(); // обработка исключения
        // System.out.println(flag);
        // if (flag == true) {
        //     int p = iScanner.nextInt();
        //     System.out.println(p);
        // }

        iScanner.close();

        // операции  со строками (конкатенации)
        String ss = "qwe";
        int aa = 123;
        String q = ss + aa;
        System.out.println(q);

        int aaa = 1, bbb = 2;
        int ccc = aaa + bbb;

        String res = aaa + " + " + bbb + " = " + ccc;
        System.out.println(res);

        String result = String.format("%d + %d = %d \n", aaa, bbb, ccc);
        System.out.printf("%d + %d = %d \n", aaa, bbb, ccc);
        System.out.println(result);

        float pi = 3.1415f;
        System.out.printf("%f\n", pi);    // 3,141500
        System.out.printf("%.2f\n", pi);  // 3,14
        System.out.printf("%.3f\n", pi);  // 3,141
        System.out.printf("%e\n", pi);    // 3,141500e+00
        System.out.printf("%.2e\n", pi);  // 3,14e+00
        System.out.printf("%.3e\n", pi);  // 3,141e+00

        // вызвать из соседнего файла метод
        // lib.sayHi();
        
        int aaaa = 1;
        int bbbb = 2;
        int cccc;
        if (aaaa > bbbb) {
            cccc = aaaa;
        } else {
            cccc = bbbb;
        }
        System.out.println(cccc);

        int aaaaa = 1;
        int bbbbb = 2;
        int ccccc = 0;
        if (aaaaa > bbbbb) ccccc = aaaaa;
        if (bbbbb > aaaaa) ccccc = bbbbb;
        System.out.println(ccccc);

        int a1 = 1;
        int b1 = 2;
        int min = a1 < b1 ? a1 : b1; // тернарный ? (вернется перед : если верно, если не верно то после :)
        System.out.println(min);

        // метод выбора кейсов для выполнения
        int mounth = 1;
        String text = "";
        switch (mounth) {
            case 8:
                text = "Autumn";
                break;
            case 1:
                text = "Winter";
                break;
            default:
                text = "mistake";
                break;
        }
        System.out.println(text);
        iScanner.close();

        // wile 
        int value = 321;
        int count = 0;
        // просто wile
        while (value != 0) {
            value /= 10;
            count++;
        }
        System.out.println(count);
        // конструкция do wile
        do {
            value /= 10;
            count++;
        } while (value != 0);
        System.out.println(count);

        // for 
        int s0 = 0;
        for (int i1 = 1; i1 <= 10; i1++) {
            s0 += i1;
        }
        System.out.println(s0);

        int[] array = new int[] {1,2,3,4,5,77};
        for (int item : array) {
            System.out.println(item);
        }

        // работа с файлами
        // import java.io.FileWriter;
        // import java.io.IOException;
        try (FileWriter fw = new FileWriter("file.txt", false)) {
            fw.write("line 1");
            fw.append('\n');
            fw.append('2');
            fw.append('\n');
            fw.write("line 3");
            fw.flush();
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        // FileReader fr = new FileReader("file.txt");
        // int c;
        // while ((c = fr.read()) != -1) {
        //     char ch = (char) c;
        //     if (ch == '\n') {
        //         System.out.print(ch);
        //     } else {
        //         System.out.print(ch);
        //     }

        
        // BufferedReader br = new BufferedReader(new FileReader("file.txt"));
        // String str;
        // while ((str = br.readLine()) != null) {
        //     System.out.printf("== %s ==\n", str);
        // }
        // br.close();

    }

    static String getType(Object o) {
        return o.getClass().getSimpleName();
    }
}
