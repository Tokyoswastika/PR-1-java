import java.util.Random;
import java.util.Scanner;

public class Task1 {

    public static void RandomArray(int[] arr) {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(200) - 100;
        }
    }
    public static void createArray(int[] arr){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введіть елементи масиву: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
    }

    public static void OutputArray(int[] arr) {
        for (int val: arr)
            System.out.print(val + " ");
        System.out.println();
    }

    public static int MaxModuleElement(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(Math.abs(max) < Math.abs(arr[i]))
                max = arr[i];
        }
        return max;
    }

    public static int IndexLastZero(int[] arr) throws Exception {
        int lastI = arr[0]; boolean isNull = false;
        for (int i = arr.length - 1; i >= 0; i--) {
            if(arr[i] == 0) {
                lastI = arr[i];
                isNull = true;
            }
        }
        if (isNull)
            return lastI;
        else
            throw new Exception("Немає нульових елементів");
    }

    public static int SumAfter(int[] arr, int index) throws Exception {
        if(index == arr.length-1) throw new Exception("Нульовий елемент останій");

        int sum = 0;
        for (int i = index + 1; i < arr.length; i++) {
                sum += arr[i];
        }
        return sum;
    }

    public static void Task1() {
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
        createArray(arr);
        OutputArray(arr);

        System.out.println("Максимальний за модулем елемент масиву: " + MaxModuleElement(arr));

        try
        {
            System.out.println("Сума елементів масиву, розташованих після останнього нульового елемента: " +
                    SumAfter(arr, IndexLastZero(arr)));
        }
        catch(Exception exception)
        {
            System.out.println(exception.getMessage());
        }
    }


}
