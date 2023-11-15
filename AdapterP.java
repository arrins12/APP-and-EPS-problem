public class AdapterP {
    public static void main(String[] args) {

        Americanpp americanpp = new Americanpp();

        // Using adapter to plug into European socket
        EuropeanPS europeanPS = new AmericantoEuropeanAdapter(americanpp);
        europeanPS.plugin();
    }
}
