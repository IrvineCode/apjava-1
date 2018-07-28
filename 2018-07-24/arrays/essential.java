class essential {
    public static void main(String[] args) {
        int[] ar = {1, 3, 2, 5, 4};

        int sum = 0;
        int cnt = 0;

        for(int i=0; i<ar.length; i++) {
            if (ar[i] % 2 == 0) {
                sum += ar[i];
                cnt++;
            }
        }

        System.out.println((double)sum / cnt);

        
    }
}