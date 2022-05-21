import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void RandomArray(int[] arr) {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(200) - 100;
        }
    }

    public static void OutputArray(int[] arr) {
        for (int val: arr)
            System.out.print(val + " ");
        System.out.println();
    }

    public static int AVGNotPair(int[] arr) throws Exception {
        int n = arr.length;
        if(n == 0) throw new Exception("Масив пустий");
        if(n == 1) throw new Exception("Масив не містить елементів з непарним індексом");

        int sum = 0;
        int count = 0;
        for (int i = 1; i < n; i+=2) {
            sum+=arr[i];
            count++;
        }

        return sum/count;
    }

    public static void Task2() {
        Scanner in = new Scanner(System.in);
        int n;

        do {
            System.out.print("Введіть розмір масиву:");
            n = in.nextInt();
            if(n < 1) System.out.println("Розмір масиву не може бути меньше 1!");
        }
        while (n < 1);

        int[] arr = new int[n];

        System.out.println("Масив: ");
        RandomArray(arr);
        OutputArray(arr);

        try {
            System.out.println("Середнє арифметичне непарних елементів: " + AVGNotPair(arr));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
