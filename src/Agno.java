import java.util.Scanner;

public class Agno {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double agno = 0;
        double notToplam = 0;
        int kredi = 0;
        int krediToplam = 0;
        int dersSayisi = 0;
        int basarilanKredi = 0;
        String not;

        System.out.println("Gazi Üniversitesi BELTEK AGNO Hesaplama Uygulamasına Hoşgeldiniz:");


        do {
            ++dersSayisi;
            System.out.print("Lütfen "+ dersSayisi +". dersin kredisini giriniz: ");
            kredi = scan.nextInt();
            krediToplam += kredi;

            System.out.print("Lütfen " +dersSayisi+ ". dersin harf notunu giriniz: ");
            not = scan.next();

            if (not.equalsIgnoreCase("aa")){
                notToplam += 4*kredi;
                basarilanKredi += kredi;
            } else if (not.equalsIgnoreCase("ba")) {
                notToplam += 3.5*kredi;
                basarilanKredi += kredi;
            } else if (not.equalsIgnoreCase("bb")) {
                notToplam += 3*kredi;
                basarilanKredi += kredi;
            } else if (not.equalsIgnoreCase("cb")) {
                notToplam += 2.5*kredi;
                basarilanKredi += kredi;
            } else if (not.equalsIgnoreCase("cc")) {
                notToplam += 2*kredi;
                basarilanKredi += kredi;
            } else if (not.equalsIgnoreCase("dc")) {
                notToplam += 1.5*kredi;
                basarilanKredi += kredi;
            } else if (not.equalsIgnoreCase("dd")) {
                notToplam += 1.0*kredi;
                basarilanKredi += kredi;
            } else if (not.equalsIgnoreCase("fd")) {
                notToplam += 0.5*kredi;
            } else if (not.equalsIgnoreCase("ff")) {
                notToplam += 0;
            } else --dersSayisi;
            System.out.print("Ders girişine devam etmek için 'h' girişi yapın: ");
        }while(!scan.next().equalsIgnoreCase("h"));

        agno = notToplam / krediToplam;
        System.out.println("Alınan ders sayısı: " + dersSayisi);
        System.out.println("AGNO: " + agno);
        System.out.println("Toplam Kredi: " + krediToplam);
        System.out.println("Başarılan Kredi: " + basarilanKredi);

        if(agno >= 3.0 && agno<=3.49){
            System.out.println("Onur belgesine hak kazandınız!");
        } else if (agno >= 3.50) {
            System.out.println("Yüksek onur belgesine hak kazandınız!");
        }


    }

}
