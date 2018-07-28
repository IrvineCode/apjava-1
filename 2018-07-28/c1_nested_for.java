class c1_nested_for {
    public static void main(String[] args) {
        for(int i=0; i<3; i++) {

            for(int j=i; j<3; j++) {
                System.out.println(i + "," + j);
            }

            System.out.println("----");
        }
        
    }
}