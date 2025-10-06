import java.util.logging.Logger;
import java.util.regex.Pattern;

public class R00_IDS03_J {
    private static final Logger logger = Logger.getLogger(R00_IDS03_J.class.getName());
    private boolean loginSuccessful = false;
    

    public void logLoginAttemptNonCompliant(String username) {
        if (loginSuccessful) {
            logger.severe("User login succeeded for: " + username);
        } else {
            logger.severe("User login failed for: " + username);
        }
    }
    

    public void logLoginAttemptCompliant(String username) {
        if (loginSuccessful) {
            logger.severe("User login succeeded for: " + sanitizeUser(username));
        } else {
            logger.severe("User login failed for: " + sanitizeUser(username));
        }
    }
    
    public String sanitizeUser(String username) {
        return Pattern.matches("[A-Za-z0-9]+", username) 
                ? username : "unauthorized user";
    }
}
