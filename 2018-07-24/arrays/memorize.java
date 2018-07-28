import java.util.Arrays;

class memorize {
    public static void main(String[] args) {
        int[] ar = { 1, 1, 2, 3, 3, 4, 4, 4, 1, 1, 2 };
        int len = 1;
        int max = 1;

        for(int i=1; i<ar.length; i++) {

            if (ar[i] == ar[i-1]) {
                len++;
            } else {
                len = 1;
            }

            if (len > max) {
                max = len;
            }

            System.out.println( ar[i] + "," + len + "," + max);
        }

        System.out.println(max);
    }
}