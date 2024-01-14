public class proje10AsalSayıYazdırma {
    public static void main(String[] args) {
        int adet = 20;

        int sayi = 2;
        int sayac = 0;

        System.out.println("İlk " + adet + " Asal Sayı:");

        while (sayac < adet) {
            if (asalMi(sayi)) {
                System.out.print(sayi + " ");
                sayac++;
            }
            sayi++;
        }
    }


    private static boolean asalMi(int sayi) {
        if (sayi < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(sayi); i++) {
            if (sayi % i == 0) {
                return false;
            }
        }
        return true;
    }
}
