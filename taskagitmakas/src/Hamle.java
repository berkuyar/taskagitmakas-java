public class Hamle {
    public static final String TAS = "Taş";
    public static final String KAGIT = "Kağıt";
    public static final String MAKAS = "Makas";

    public static boolean gecerliHamleMi(String hamle){
        return hamle.equals(TAS)|| hamle.equals(KAGIT)|| hamle.equals(MAKAS);
    }
}
