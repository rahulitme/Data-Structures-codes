package firstprgm;

import java.util.Scanner;

class divisible {
    public static void main(String[] args) {
        int p = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the starting number: ");
        int n = sc.nextInt();
        System.out.println("Enter the ending number: ");
        int m = sc.nextInt();

        for (int i = n; i <= m; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                p = p + i;
            }
        }

        System.out.println("The sum of numbers divisible by both 3 and 5 between " + n + " and " + m + " is: " + p);
    }
}
