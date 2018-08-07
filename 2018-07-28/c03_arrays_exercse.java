class c03_arrays_exercse {
    public static void main(String[] args) {
        int[] ar = { 11, 3, 4, 9, 2 };

        // System.out.println(sum(ar));
        // System.out.println(max(ar));
        // System.out.println(evenMax(ar));
        // System.out.println("avg: " + avg(ar));
        // System.out.println("evenAvg: " + evenAvg(ar));

        // System.out.println("more even? : " + moreEven(ar));

        // HARD
        int[] ar2 = { 1, 1, 1, 2, 2, 3, 3, 4, 5, 6, 6, 6, 6, 6, 2, 2, 2, 2 };
        System.out.println(longestStreak(ar2));

    }

    public static int sum(int[] ar) {
        int sum = 0;

        for (int i = 0; i < ar.length; i++) {
            sum += ar[i];
        }

        return sum;
    }

    public static int max(int[] ar) {
        int max = ar[0];

        for (int i = 0; i < ar.length; i++) {
            if (max < ar[i])
                max = ar[i];
        }

        return max;
    }

    public static int evenMax(int[] ar) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < ar.length; i++) {
            if (max < ar[i] && ar[i] % 2 == 0)
                max = ar[i];
        }

        return max;
    }

    public static double avg(int[] ar) {
        int sum = 0;

        for (int i = 0; i < ar.length; i++) {
            sum += ar[i];
        }

        return (double) sum / ar.length;
    }

    public static double evenAvg(int[] ar) {
        int sum = 0, cnt = 0;

        for (int i = 0; i < ar.length; i++) {
            if (ar[i] % 2 == 0) {
                sum += ar[i];
                cnt++;
            }

        }

        return (double) sum / cnt;
    }

    public static boolean moreEven(int[] ar) {
        int cntEven = 0;

        for (int i = 0; i < ar.length; i++) {
            if (ar[i] % 2 == 0) {
                cntEven++;
            }
        }

        return cntEven > ar.length / 2.0;
    }

    /*
     * return the LENGTH of the longest streak
     */
    public static int longestStreak(int[] ar) {
        int len = 0, maxLen = 0;

        for (int i = 0; i < ar.length; i++) {

            if (i == 0)
                len = 1;
            else if (ar[i] == ar[i-1])
                len++;
            else
                len = 1;
            
            if (len > maxLen)
                maxLen = len;

            System.out.println(ar[i] + " , " + len + " , " + maxLen);
        }

        return maxLen;
    }
}
