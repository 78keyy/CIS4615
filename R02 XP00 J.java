import java.io.File;

public class R02_XP00_J {
    
   
    public void deleteFileNonCompliant() {
        File someFile = new File("someFileName.txt");
        // Do something with someFile
        someFile.delete(); // Return value ignored
    }
    

    public void deleteFileCompliant() {
        File someFile = new File("someFileName.txt");
        // Do something with someFile
        if (!someFile.delete()) {
            // Handle failure to delete the file
            System.err.println("Failed to delete file: " + someFile.getName());
        }
    }
}
