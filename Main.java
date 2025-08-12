public class Main {
    public static void main(String[] args) {
        // Byte
        System.out.println("Byte Minimum Value: " + Byte.MIN_VALUE);
        System.out.println("Byte Maximum Value: " + Byte.MAX_VALUE);

        // Short
        System.out.println("Short Minimum Value: " + Short.MIN_VALUE);
        System.out.println("Short Maximum Value: " + Short.MAX_VALUE);

        // Integer
        System.out.println("Int Minimum Value: " + Integer.MIN_VALUE);
        System.out.println("Int Maximum Value: " + Integer.MAX_VALUE);

        // Long
        System.out.println("Long Minimum Value: " + Long.MIN_VALUE);
        System.out.println("Long Maximum Value: " + Long.MAX_VALUE);

        // Float
        System.out.println("Float Minimum Value: " + Float.MIN_VALUE);
        System.out.println("Float Maximum Value: " + Float.MAX_VALUE);

        // Double
        System.out.println("Double Minimum Value: " + Double.MIN_VALUE);
        System.out.println("Double Maximum Value: " + Double.MAX_VALUE);

        // Character
        System.out.println("Char Minimum Value: " + (int) Character.MIN_VALUE);
        System.out.println("Char Maximum Value: " + (int) Character.MAX_VALUE);

        // Boolean (no min/max, just true/false)
        System.out.println("Boolean Values: " + Boolean.TRUE + " and " + Boolean.FALSE);
    }
}

// public class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Kitne numbers input karna chahte ho? ");
//         int count = scanner.nextInt();

//         if (count <= 0) {
//             System.out.println("Valid number of inputs dena hoga.");
//             return;
//         }

//         int min, max;

//         System.out.print("Enter number 1: ");
//         int num = scanner.nextInt();
//         min = max = num; // Initialize min and max with first input

//         for (int i = 2; i <= count; i++) {
//             System.out.print("Enter number " + i + ": ");
//             num = scanner.nextInt();

//             if (num < min) min = num;
//             if (num > max) max = num;
//         }

//         System.out.println("\nMinimum value: " + min);
//         System.out.println("Maximum value: " + max);

//         scanner.close();
//     }
// }

// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in); // Create Scanner object

//         // String input
//         System.out.print("Enter your name: ");
//         String name = scanner.nextLine();

//         // byte input
//         System.out.print("Enter your age (byte): ");
//         byte age = scanner.nextByte();

//         // short input
//         System.out.print("Enter your lucky number (short): ");
//         short luckyNumber = scanner.nextShort();

//         // int input
//         System.out.print("Enter your roll number (int): ");
//         int rollNumber = scanner.nextInt();

//         // long input
//         System.out.print("Enter your phone number (long): ");
//         long phoneNumber = scanner.nextLong();

//         // float input
//         System.out.print("Enter your height in meters (float): ");
//         float height = scanner.nextFloat();

//         // double input
//         System.out.print("Enter your weight in kg (double): ");
//         double weight = scanner.nextDouble();

//         // boolean input
//         System.out.print("Are you a student? (true/false): ");
//         boolean isStudent = scanner.nextBoolean();

//         // char input (workaround using String)
//         System.out.print("Enter your grade (char): ");
//         char grade = scanner.next().charAt(0); // Read first character of input

//         // Output all values
//         System.out.println("\n--- User Details ---");
//         System.out.println("Name: " + name);
//         System.out.println("Age: " + age);
//         System.out.println("Lucky Number: " + luckyNumber);
//         System.out.println("Roll Number: " + rollNumber);
//         System.out.println("Phone Number: " + phoneNumber);
//         System.out.println("Height: " + height + " m");
//         System.out.println("Weight: " + weight + " kg");
//         System.out.println("Student: " + isStudent);
//         System.out.println("Grade: " + grade);

//         scanner.close(); // Close the scanner
//     }
// }




// import java.util Scanner;
// // Main class definition
// public class Main {
//     // Main method: Entry point of the Java application
//    /* public static void main(String[] args) {
//         // Declare and initialize the age integer variable
//         int age = 22;
//         // Print the age and name  to the console
//         System.out.println(age); 
//         System.out.println("Rishabh pathak");
//     }*/
// public static void permutation(int a[]){
//     int pivot=-1;
//     for(int i=a.length-2;i>=0;i--){
//         if(a[i]<a[i+1]){
//             pivot=i;
//             break;
//         }
//     }
//     if(pivot==-1){
//         Arrays.sort(a);
//         return;
//     }
//     else{
//         for(int i=a.length-1;i>=0;i--){
//             if(a[i]>a[pivot]){
//             int temp=a[pivot];
//             a[pivot]=a[i];
//             a[i]=temp;
//         }
//     }
//     int si=pivot+1,ei=a.length-1;
//     while(si<ei){
//         int temp=a[ei];
//         a[ei]=a[si];
//         a[si]=temp;
//         si++;ei--;
//     }
//     print(a);
// } 
// }
// public static void print(int a[]){
//     for(int i=0;i<a.length;i++){
//         System.out.print(a[i]+" ");
//     }
// } 
// public static void main(String args[]){
//      scanner
//     // int a=1;
//     // float b=2f;
//     // long c=3;
//     // double d=4;
//     // char e='r';
//     // short f=12;
//     // byte g=1;
//     // boolean t=true;
//     // System.out.println( a+","+b+","+c+","+d+","+e+","+f+","+g+","+t);
// }
// }
