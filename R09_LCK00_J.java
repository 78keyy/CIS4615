public class R09_LCK00_J {
    private int count = 0;
    
    //non-compliant code
    public synchronized void incrementNonCompliant() {
        count++;
    }
    
    public synchronized int getCountNonCompliant() {
        return count;
    }
    
    private final Object lock = new Object();
    
    public void incrementCompliant() {
        synchronized (lock) {
            count++;
        }
    }
    
    public int getCountCompliant() {
        synchronized (lock) {
            return count;
        }
    }
}