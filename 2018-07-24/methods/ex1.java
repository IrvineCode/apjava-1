class ex1 {
    public static void main(String[] args) {
        isEven(10);
        isEven(5);
        add(4, 5);
        max(1, 2);
        max(20, 5);
        max(5, 6, 7);
    }

    public static void isEven(int num) {
        if (num % 2 == 0)
            System.out.println(num + " is even");
    }

    public static void add(int a, int b) {
        System.out.println(a + b);
    }

    public static void max(int a, int b) {
        if (a > b)
            System.out.println(a);
        else
            System.out.println(b);
    }

    public static void max(int a, int b, int c) {
        if (c > a && c > b) {
            System.out.println(c);
        }
        else if (b > a) {
            System.out.println(b);
        }
        else {
            System.out.println(a);
        }
    }
}





