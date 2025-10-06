import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class R11_SEC00_J {
    
  
    public void processDataNonCompliant(Set<String> sensitiveData) {
        HashSet<String> dataSet = new HashSet<>(sensitiveData);
        for (String data : dataSet) {
            System.out.println(data);
        }
    }
    
    
    public void processDataCompliant(Set<String> sensitiveData) {
        LinkedHashSet<String> dataSet = new LinkedHashSet<>(sensitiveData);
        for (String data : dataSet) {
            System.out.println(data);
        }
    }
}
