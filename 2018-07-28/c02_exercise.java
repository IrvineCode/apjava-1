class c02_exercise {
    public static void main(String[] args) {
        // //Q7
        // int x = 1;
        // for(int i=0; i<4; i++) {
        //     x = x * 10 + 1;
        // }
        // System.out.println(x);

        // //Q11
        // int y = 1;
        // System.out.println(x);
        // for(int i=0; i<4; i++) {
        //     y = y * 10 + 1;
        //     System.out.println(y);
        // }

        // for(int i=0; i<5; i++) {
        //     System.out.println(12345);
        // }

        q8();
        q10();
    }

    public static void q6() {
        for(int i=0; i<20; i+=4) {
            System.out.println(i + " " + (i+1));
            System.out.println((i+3) + " " + (i+2));
        }
    }

    public static void q8() {
        int x = 0;

        for(int i=1; i<=5; i++) {
            x = x * 10 + i;
        }

        // equivalent to
        // x = x*10+1;      //1
        // x = x*10+2;     //12
        // x = x*10+3;     //123
        // x = x*10+4;     //1234
        // x = x*10+5;     //12345

        System.out.println(x);
    }

    public static void q10() {
        for(int j=0; j<5; j++) {
            q8();
        }
    }
}