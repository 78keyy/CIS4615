public class R08_VNA00_J {
    private int counter = 0;
    private volatile boolean done = false;
    
    //non-compliant code
    public void setDoneNonCompliant() {
        done = true;
    }
    
    public boolean isDoneNonCompliant() {
        return done;
    }
    
    public void setDoneCompliant() {
        done = true;
    }
    
    public boolean isDoneCompliant() {
        return done;
    }
    
    public synchronized void setDoneSync() {
        done = true;
    }
    
    public synchronized boolean isDoneSync() {
        return done;
    }
}