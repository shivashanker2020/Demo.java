class ArrayDemo {
    public static void main(String[] args) {
        // declares an array of integers
        int[] anArray;

        // allocates memory for 10 integers
        anArray = new int[10];
           
        // initialize first element
        anArray[0] = 100;
        // initialize second element
        anArray[1] = 200;
        // and so forth
        anArray[2] = 300;
        anArray[3] = 400;
        anArray[4] = 500;
        anArray[5] = 600;
        anArray[6] = 700;
        anArray[7] = 800;
        anArray[8] = 900;
        anArray[9] = 1000;

        System.out.println("Element at first 0: "
                           + anArray[0]);
        System.out.println("Element at second 1: "
                           + anArray[1]);
        System.out.println("Element at third 2: "
                           + anArray[2]);
        System.out.println("Element at fourth 3: "
                           + anArray[3]);
        System.out.println("Element at fiveth 4: "
                           + anArray[4]);
        System.out.println("Element at sixth 5: "
                           + anArray[5]);
        System.out.println("Element at seventh 6: "
                           + anArray[6]);
        System.out.println("Element at eight 7: "
                           + anArray[7]);
        System.out.println("Element at nineth 8: "
                           + anArray[8]);
        System.out.println("Element at tenth 9: "
                           + anArray[9]);
    }
} 