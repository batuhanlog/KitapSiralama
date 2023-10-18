
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String dosyaAdi = "sayilar.txt";

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

                    System.err.println("Hatalı bir sayı bulundu: " + satir);
                }
            }

            System.out.println("Toplam: " + toplam);

            bufferedReader.close();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
