import java.util.Scanner;

public class flight {
    public static void main(String[] args) {
        int km, yas, ucusTipi;
        Scanner giris = new Scanner(System.in);

        System.out.print("Lütfen Uçuş Mesafenizi Giriniz(Km) : ");
        km = giris.nextInt();

        System.out.print("Lütfen Yaşınızı Giriniz : ");
        yas = giris.nextInt();

        System.out.println("---UÇUŞ TİPİ---");
        System.out.println("1\\Tek Yön");
        System.out.println("2\\Gidiş-Geliş");
        System.out.print("Uçuş Tipinizi Seçiniz : ");
        ucusTipi = giris.nextInt();

        if ((km <= 0 || yas <= 0) || (ucusTipi != 1 && ucusTipi != 2)) {
            System.out.println("Hatalı Veri Girdiniz!");
            return;
        }

        double biletIlkTutar = km * 0.1;
        double indirimliTutar = biletIlkTutar;

        if (yas < 12) {
            indirimliTutar *= 0.5;
        } else if (yas >= 12 && yas < 24) {
            indirimliTutar *= 0.9;
        } else if (yas > 65) {
            indirimliTutar *= 0.7;
        }

  
        if (ucusTipi == 2) {
            indirimliTutar *= 0.8 * 2;
        }

    
        int biletTutar = (int) indirimliTutar;

        
        System.out.println("Bilet Tutarınız : " + biletTutar + " TL'dir.");

        giris.close();
    }
}
