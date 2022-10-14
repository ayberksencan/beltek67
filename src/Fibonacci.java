public class Fibonacci {

    public static void main(String[] args) {


        int i = 0;

        while (i <= 100){
            System.out.println("Fibonacci (" + i + "):" + fibonacci(i));
            i++;
        }


    }

    static int fibonacci(int x){
        int sonuc = fibonacci(x-1) + fibonacci(x-2);
        return sonuc;
    }
}
