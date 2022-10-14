public class Yildiz {
    public static void main(String[] args) {



        String yazi1 = "Gazi";
        String yazi2 = "Teknoloji";
        String yazi3 = "Beltek";
        String yazi4 = "gazi";

        boolean sonuc = yazi1.equalsIgnoreCase(yazi4);

        System.out.println("Karsilastirilan yazilarin sonucu:" + sonuc);

        //Satilar icin i ve sutunlar icin j
        //Satir degiskeni basilmak istenen satir sayisi
        int i, j, satir = 6;
        //satirlar icin dis for dongusu
        for (i = 0; i < satir; i++) {
        //Kolonlar icin ic for dongusu
            for (j = 0; j <= i; j++) {
                //Yildiz Yazdir
                System.out.print("* ");
            }
            //Her satir yazildiktan sonra yeni satira gec
            System.out.println();
        }
    }
}
