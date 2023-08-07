import java.util.*;

class sumsingledigit {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long n = s.nextLong();
        if (n % 9 == 0)
            System.out.println(9);
        System.out.println(n % 9);
    }
}
