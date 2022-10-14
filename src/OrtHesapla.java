import java.util.Scanner;

public class OrtHesapla {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        int toplam = 0;
        int ortalama = 0;

        for(int i = 0; i<10; i++){
            System.out.print("Lutfen bir sayi giriniz: ");
            toplam += scan.nextInt();
        }

        ortalama = toplam / 10;
        System.out.println("Girilen sayilarin ortalamasi: " + ortalama);

    }

}
