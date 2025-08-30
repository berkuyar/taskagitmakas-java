public class Skor {

    private int oyuncuSkoru;
    private int bilgisayarSkoru;

    public Skor() {
        this.oyuncuSkoru = 0;
        this.bilgisayarSkoru = 0;
    }
    public void oyuncuSkorArtir(){
        oyuncuSkoru++;
    }
    public void bilgisayarSkorArtir(){
        bilgisayarSkoru++;
    }
    public void skorGoster() {
        System.out.println("\n=== SKOR ===");
        System.out.println("Oyuncu: " + oyuncuSkoru);
        System.out.println("Bilgisayar: " + bilgisayarSkoru);
    }
        public int getOyuncuSkoru() {
            return oyuncuSkoru;
        }

        public int getBilgisayarSkoru() {
            return bilgisayarSkoru;
        }
    }
