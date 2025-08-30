import java.util.Random;

public class Bilgisayar {

    private String ad;
    private Random random;

    public Bilgisayar(String ad) {
        this.ad = ad;
        this.random = new Random();
    }

    public String secimYap() {
        int rastgeleSayi = random.nextInt(3); // 0, 1, 2

        switch (rastgeleSayi) {
            case 0: return Hamle.TAS;
            case 1: return Hamle.KAGIT;
            case 2: return Hamle.MAKAS;
            default: return Hamle.TAS; // Bu satır hiç çalışmaz ama güvenlik için
        }
    }

    public String getAd() {
        return ad;
    }
}
