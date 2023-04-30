package Day5.multilevel;

public class Executor {
    public static void main(String[] args) {
        City c=new City();
        c.setArea(12546.12f);
        c.setCityName("Bengaluru");

        c.setStateName("Karnataka");
        c.setLanguage("kanaada");

        c.setCountryName("india");
        c.setCapital("new delhi");

        System.out.println(c);
    }
}
