// Common Multiples of 4 and 12 in range from 1 to 200

public class commonmultiple {
    public static void main(String[] args) {

        for (int i = 1; i <= 200; i++) {
            if (i % 4 == 0 && i % 12 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}