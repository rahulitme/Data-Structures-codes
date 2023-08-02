
class first {
    public static void main(String[] args) {
        int[] a = { 5, 1, 4, 2 };
        int flag = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    flag = 1;

                } else {
                    flag = 0;
                    break;
                }
            }
            if (flag == 1) {
                System.out.println(a[i]);
            }

        }
    }
}
