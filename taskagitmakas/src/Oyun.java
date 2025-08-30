import java.util.Scanner;

class Oyun {
    private Oyuncu oyuncu;
    private Bilgisayar bilgisayar;
    private OyunMotoru oyunMotoru;
    private Skor skor;
    private Scanner scanner;

    public Oyun() {
        // Constructor'da tüm nesneleri oluştur
        this.scanner = new Scanner(System.in);
        this.oyunMotoru = new OyunMotoru();
        this.skor = new Skor();

        System.out.print("Adınızı girin: ");
        String oyuncuAdi = scanner.nextLine();
        this.oyuncu = new Oyuncu(oyuncuAdi);
        this.bilgisayar = new Bilgisayar("Bilgisayar");
    }

    public void oyna() {
        System.out.println("\n=== TAŞ KAĞIT MAKAS OYUNU ===");
        System.out.println("Oyun başladı! (Çıkmak için 0'a basın)\n");

        while (true) {
            // Menu göster
            System.out.println("1. Oyun Oyna");
            System.out.println("2. Skor Görüntüle");
            System.out.println("0. Çıkış");
            System.out.print("Seçiminiz: ");

            int secim = scanner.nextInt();
            scanner.nextLine();

            switch (secim) {
                case 1: birRoundOyna(); break;
                case 2: skor.skorGoster(); break;
                case 0:
                    System.out.println("Oyun bitti! Final skoru:");
                    skor.skorGoster();
                    return;
                default:
                    System.out.println("Geçersiz seçim!");
            }

            System.out.println("\nDevam etmek için Enter'a basın...");
            scanner.nextLine();
        }
    }

    private void birRoundOyna() {
        // 1. Oyuncu seçim yapsın
        String oyuncuHamlesi = oyuncu.secimYap();

        // 2. Bilgisayar seçim yapsın
        String bilgisayarHamlesi = bilgisayar.secimYap();

        // 3. Seçimleri göster
        System.out.println("\n=== SONUÇ ===");
        System.out.println(oyuncu.getAd() + ": " + oyuncuHamlesi);
        System.out.println(bilgisayar.getAd() + ": " + bilgisayarHamlesi);

        // 4. Karşılaştır
        String kazanan = oyunMotoru.karsilastir(oyuncuHamlesi, bilgisayarHamlesi);

        // 5. Sonucu göster ve 6. Skoru güncelle
        switch (kazanan) {
            case "Oyuncu":
                System.out.println("🎉 " + oyuncu.getAd() + " kazandı!");
                skor.oyuncuSkorArtir();
                break;
            case "Bilgisayar":
                System.out.println("🤖 " + bilgisayar.getAd() + " kazandı!");
                skor.bilgisayarSkorArtir();
                break;
            case "Berabere":
                System.out.println("🤝 Berabere!");
                break;
        }
    }

    public static void main(String[] args) {
        Oyun oyun = new Oyun();
        oyun.oyna();
    }
}