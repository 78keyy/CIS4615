import java.math.BigInteger;

public class R04_STR03_J {
    
    // Non-compliant code
    public void processBigIntegerNonCompliant() {
        BigInteger x = new BigInteger("530500452766");
        byte[] byteArray = x.toByteArray();
        String s = new String(byteArray); // Incorrect conversion
        byteArray = s.getBytes();
        x = new BigInteger(byteArray);
        System.out.println("Non-compliant result: " + x);
    }
    
    // Compliant solution
    public void processBigIntegerCompliant() {
        BigInteger x = new BigInteger("530500452766");
        String s = x.toString(); // Valid character data
        byte[] byteArray = s.getBytes();
        String ns = new String(byteArray);
        x = new BigInteger(ns);
        System.out.println("Compliant result: " + x);
    }
}