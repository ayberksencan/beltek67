import java.util.Scanner;

public class Toplam2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int sayi = 0;
        int toplam = 0;

        System.out.print("Lutfen bir sayi giriniz:");
        sayi = scan.nextInt();

        for(int i=1; i<=sayi; i++){
            toplam += i;
        }

        System.out.println("1'den " + sayi + "'e kadar olan sayilarin toplami:" + toplam);

    }

}
