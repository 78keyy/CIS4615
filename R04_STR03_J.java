import java.math.BigInteger;

public class R04_STR03_J {
    
    public void processBigIntegerNonCompliant() {
        BigInteger x = new BigInteger("530500452766");
        byte[] byteArray = x.toByteArray();
        String s = new String(byteArray); 
        byteArray = s.getBytes();
        x = new BigInteger(byteArray);
        System.out.println("Non-compliant result: " + x);
    }
    

    public void processBigIntegerCompliant() {
        BigInteger x = new BigInteger("530500452766");
        String s = x.toString(); // Valid character data
        byte[] byteArray = s.getBytes();
        String ns = new String(byteArray);
        x = new BigInteger(ns);
        System.out.println("Compliant result: " + x);
    }
}
