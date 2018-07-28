class ex2 {
    public static void main(String[] args) {
        series(3, 7);
        series(-2, 2);
    }

    public static void series(int a, int b) {
        for (int i = a; i <= b; i++)
            System.out.println(i);
    }
}