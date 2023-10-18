
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class deneme {
    public static void main(String[] args) {
        String dosyaAdi = "sayilar.txt"; // Okunacak dosyanın adını belirtin

        try {
            FileReader fileReader = new FileReader(dosyaAdi);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String satir;
            int toplam = 0;

            while ((satir = bufferedReader.readLine()) != null) {
                try {
                    int sayi = Integer.parseInt(satir);
                    toplam += sayi;
                } catch (NumberFormatException e) {
                    // Sayıya dönüştürme hatası
                    System.err.println("Hatalı bir sayı bulundu: " + satir);
                }
            }

            System.out.println("Toplam: " + toplam);

            bufferedReader.close();
        } catch (IOException e) {
            System.err.println("Dosya okuma hatası: " + e.getMessage());
        }
    }
}
