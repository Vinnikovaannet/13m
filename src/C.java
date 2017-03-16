import java.util.Scanner;


public class C {
    public static void main(String[] args) {
        int[] m = new int[5];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Будем считать среднее арифметическое из 5 чисел");

        System.out.print("Введите 1е число: ");
        m[0] = scanner.nextInt();

        System.out.print("Введите 2е число: ");
        m[1] = scanner.nextInt();

        System.out.print("Введите 3е число: ");
        m[2] = scanner.nextInt();

        System.out.print("Введите 4е число: ");
        m[3] = scanner.nextInt();

        System.out.print("Введите 5е число: ");
        m[4] = scanner.nextInt();

        int length = m.length;
        System.out.println("В массив введено " + length + " чисел. Как и предполагалось )");
        System.out.println("Вы ввели: " + m[0] + ", " + m[1] + ", " + m[2] + ", " + m[3] + ", " + m[4]);

        int sred = (m[0] + m[1] + m[2] + m[3] + m[4]) / length;
        System.out.println("Среднее арифметическое введенных чисел:" + sred);
    }
}
