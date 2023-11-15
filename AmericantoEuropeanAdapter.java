public class AmericantoEuropeanAdapter implements EuropeanPS{
    private Americanpp americanpp;

    public AmericantoEuropeanAdapter(Americanpp americanpp) {
        this.americanpp = americanpp;
    }
    public void plugin() {
        americanpp.pluginAmericanPS();
        System.out.println("The adapter converts to European socket");
    }
}
