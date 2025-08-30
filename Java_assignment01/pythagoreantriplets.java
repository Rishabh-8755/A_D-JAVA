//11. Pythagorean tripets 
import java.util.Scanner;

public class pythagoreantriplets{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the limit: ");
        int limit = sc.nextInt();

        System.out.println("Pythagorean Triplets less than " + limit + ":");

        for (int a = 1; a < limit; a++) {
            for (int b = a; b < limit; b++) { 
                int cSquared = a * a + b * b;
                int c = (int) Math.sqrt(cSquared);

                if (c * c == cSquared && c < limit) {
                    System.out.println(a + ", " + b + ", " + c);
                }
            }
        }

        sc.close();
    }
}
