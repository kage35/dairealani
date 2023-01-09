import java.util.Scanner;
public class dairealan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Kullanıcıdan yarıçap girişi iste
        System.out.print("Dairenin yarıçapı (cm): ");
        double yariCap = sc.nextDouble();

        // Alan ve çevreyi hesapla
        double pi = 3.14;
        double alan = pi * yariCap * yariCap;
        double cevre = 2 * pi * yariCap;

        // Alan ve çevreyi ekrana yazdır
        System.out.println("Dairenin alanı: " + alan + " cm^2");
        System.out.println("Dairenin çevresi: " + cevre + " cm");
    }
}
