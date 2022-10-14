import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hangi tur grubuyla ilgileniyorsunuz?");
        System.out.println("1) Kuzey Amerika \n2) Avrupa \n3) Asya");

        Scanner tarayici = new Scanner (System.in);
        String secim = tarayici.next();

        switch (secim){
            case "1":
                System.out.println("Kuzey Amerika turları 1500₺");
                System.out.println("Almak istiyor musunuz? (e/h)");
                String onay = tarayici.next();
                if(onay.equalsIgnoreCase("e")){
                    System.out.println("Ücret çekilmiştir.");
                }
                else if(onay.equalsIgnoreCase("h")){
                    System.out.println("sistemden çıkış yapılıyor.");
                }
                else{
                    System.out.println("Yanlış giriş yaptınız.");
                }

                break;
            case "2":
                System.out.println("Avrupa turları 2000₺");
                break;
            case "3":
                System.out.println("Asya turları 3000₺");
                break;
            default:
                System.out.println("Yanlış seçim yaptınız.");
        }









    }
}
