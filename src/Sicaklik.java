import java.util.Scanner;

public class Sicaklik {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int toplamSicaklik = 0;
        int count = 0;
        int ortSicaklik;
        int anlikSicaklik = 0;

        do {
            System.out.print("Lutfen bir sicaklik degeri giriniz:");
            anlikSicaklik = scan.nextInt();
            toplamSicaklik += anlikSicaklik;
            count++;
        }while (anlikSicaklik != -1);
        ortSicaklik = (toplamSicaklik+1) / (count-1);
        System.out.println(ortSicaklik);
    }

}
