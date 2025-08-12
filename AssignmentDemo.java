public class AssignmentDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        a += b;  
        a -= b;  
        a *= b;  
        a /= b;  
        a %= b;  

        a = 12;
        a &= 5;  // Bitwise AND
        a |= 2;  // Bitwise OR
        a ^= 3;  // Bitwise XOR
        a <<= 1; // Left shift
        a >>= 1; // Right shift
        a >>>= 1;// Unsigned right shift

        System.out.println("Final value of a: " + a);
    }
}
