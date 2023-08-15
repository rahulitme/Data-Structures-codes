/* Online Java Compiler and Editor */

public class charcount {
    public static void main(String[] args) {
        System.out.println(solve("rahul34"));
    }

    public static int solve(String str) {
        int count = 0;
        char[] str1 = str.toCharArray();
        for (int i = 0; i < str1.length; i++) {
            if ((str1[i] >= 'A' && str1[i] <= 'Z') || (str1[i] >= 'a' && str1[i] <= 'z'))
                count++;
            if (str1[i] >= '0' && str1[i] <= '9')
                count++;
        }

        return count;
    }
}

