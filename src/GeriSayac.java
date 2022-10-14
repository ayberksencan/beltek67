import java.util.Scanner;

public class GeriSayac {
    public static void main(String[] args) {

        Scanner tarayici = new Scanner(System.in);
        int sayi = 0;

        System.out.print("Lutfen bir sayi giriniz: ");
        sayi = tarayici.nextInt();

        for(int i = sayi; i>= 0; i--){
            System.out.println(i + "'den geri sayiliyor.");
        }
    }
}
