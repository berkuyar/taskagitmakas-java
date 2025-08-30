import java.util.Scanner;

public class Oyuncu {
    private String ad;
    private Scanner scanner;

    public Oyuncu(String ad){
        this.ad = ad;
        this.scanner = new Scanner(System.in);
    }

    public String secimYap(){
        System.out.println("\n" + ad + ", seçiminizi yapın:");
        System.out.println("1. " + Hamle.TAS);
        System.out.println("2. " + Hamle.KAGIT);
        System.out.println("3. " + Hamle.MAKAS);
        System.out.print("Seçiminiz (1-3): ");
        int secim = scanner.nextInt();

        switch (secim){
            case 1 : return Hamle.TAS;
            case 2 : return Hamle.KAGIT;
            case 3 : return Hamle.MAKAS;
            default:
                System.out.println("Geçirsiz seçim tekrar deneyin.");
                return secimYap();
        }
    }
    public String getAd(){
        return ad;
    }
}
