import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        tasks_from_1to4 ();
    }
    public static void tasks_from_1to4()
    {
        System.out.println("Задача 1");
        int[] number = new int [3];
        number[0]=1;
        number[1]=2;
        number[2]=3;

        double[] number2;
        number2 = new double[]{1.57, 7.654, 9.986};

        char[] number3 = {'a', 'b', 'c'};

        System.out.println("Задача 2");
        for (int i = 0; i <= (number.length - 2); i++) {
            System.out.print(number[i] + ", ");
        }
        System.out.print(number[number.length - 1]);
        System.out.println();

        for (int i = 0; i <= (number.length - 2); i++) {
            System.out.print(number2[i] + ", ");
        }
        System.out.print(number2[number2.length - 1]);
        System.out.println();

        for (int i = 0; i <= (number3.length - 2); i++) {
            System.out.print(number3[i] + ", ");
        }
        System.out.print(number3[number.length - 1]);
        System.out.println();

        System.out.println("Задача 3");
        for (int i = (number.length - 1); i >= 1; i--) {
            System.out.print(number[i] + ", ");
        }
        System.out.print(number[0]);
        System.out.println();

        for (int i = (number.length - 1); i >= 1; i--) {
            System.out.print(number2[i] + ", ");
        }
        System.out.print(number2[0]);
        System.out.println();

        for (int i = (number.length - 1); i >= 1; i--) {
            System.out.print(number3[i] + ", ");
        }
        System.out.print(number3[0]);
        System.out.println();

        System.out.println("Задача 4");
        for (int i = 0; i <= (number.length - 1); i++) {
            if (number[i]%2 != 0) number [i]++;
        }
        System.out.print(Arrays.toString(number));
        System.out.println();
    }
}