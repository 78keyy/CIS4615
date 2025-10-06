import java.io.DataInputStream;
import java.io.IOException;
import java.io.ByteArrayInputStream;

public class R03_NUM03_J {
    
  
    public static int getIntegerNonCompliant(DataInputStream is) throws IOException {
        return is.readInt();
    }
    

    public static long getIntegerCompliant(DataInputStream is) throws IOException {
        return is.readInt() & 0xFFFFFFFFL;
    }
    
   
    public static void main(String[] args) {
        try {
            byte[] data = {0x12, 0x34, 0x56, 0x78};
            DataInputStream dis = new DataInputStream(new ByteArrayInputStream(data));
            
            int badResult = getIntegerNonCompliant(dis);
            System.out.println("Non-compliant result: " + badResult);
            
       
            dis = new DataInputStream(new ByteArrayInputStream(data));
            long goodResult = getIntegerCompliant(dis);
            System.out.println("Compliant result: " + goodResult);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
