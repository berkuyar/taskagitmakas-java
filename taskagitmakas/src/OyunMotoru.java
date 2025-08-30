public class OyunMotoru {

    public String karsilastir(String oyuncuHamlesi, String bilgisayarHamlesi){

        if(oyuncuHamlesi.equals(bilgisayarHamlesi)){
            System.out.println("Berabere");
        }
        if(oyuncuHamlesi.equals(Hamle.TAS) && bilgisayarHamlesi.equals(Hamle.MAKAS) ||
        oyuncuHamlesi.equals(Hamle.MAKAS) && bilgisayarHamlesi.equals(Hamle.KAGIT) ||
        oyuncuHamlesi.equals(Hamle.KAGIT) && bilgisayarHamlesi.equals(Hamle.TAS)){

            return "Oyuncu";
        }else{
           return  "Bilgisayar";
        }




    }


}
