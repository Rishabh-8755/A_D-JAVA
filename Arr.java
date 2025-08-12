import java.util.Scanner;
public class Arr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println("a = " + a + ", b = " + b);
        System.out.println("Addition      = " + (a + b));
        System.out.println("Subtraction     = " + (a - b));
        System.out.println("Multiplication  = " + (a * b));
        System.out.println("Division       = " + (a / b));
        System.out.println("Modulus        = " + (a % b));
    }
}

// import java.util.Arrays;

// public class Arr {
//     public static void main(String[] args) {
//         int arr[] = {1, 2, 3};
//         System.out.println(Arrays.toString(arr));
//     }
// }