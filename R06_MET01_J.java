public class R06_MET01_J {
    

    public static int getAbsAddNonCompliant(int x, int y) {
        assert x != Integer.MIN_VALUE;
        assert y != Integer.MIN_VALUE;
        int absX = Math.abs(x);
        int absY = Math.abs(y);
        assert (absX <= Integer.MAX_VALUE - absY);
        return absX + absY;
    }
    
  
    public static int getAbsAddCompliant(int x, int y) {
        if (x == Integer.MIN_VALUE || y == Integer.MIN_VALUE) {
            throw new IllegalArgumentException();
        }
        int absX = Math.abs(x);
        int absY = Math.abs(y);
        if (absX > Integer.MAX_VALUE - absY) {
            throw new IllegalArgumentException();
        }
        return absX + absY;
    }
    
    public static void main(String[] args) {
        
        try {
            getAbsAddNonCompliant(Integer.MIN_VALUE, 1);
        } catch (Exception e) {
            System.out.println("Non-compliant method failed: " + e.getMessage());
        }
        
        try {
            getAbsAddCompliant(Integer.MIN_VALUE, 1);
        } catch (IllegalArgumentException e) {
            System.out.println("Compliant method properly threw exception");
        }
    }
}
