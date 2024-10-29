import static packyMcPackage.UneAutreClasse.faisUnTruc;

public class Main {
    public static void main(String[] args) {


        boolean isMachin = true;
        byte aByte = 23;
        short aShort = 23000;
        int aInt = 230000456;
        long aLong = 230000456;

        float aFloat = 230000456.0235F;
        double aDouble = 230000456.0235456454545;
        char aChar = 'm';


        Bidule monBidule = new Bidule("name");
      //  monBidule.name = "michel";
        System.out.println("Hello world!");
        System.out.println(monBidule.passeUnBidule());

        faisUnTruc();

    }
}