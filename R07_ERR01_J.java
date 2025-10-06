public class R07_ERR01_J {
    

    public boolean loginUserNonCompliant(String username, String password) {
        if (!isValidUser(username)) {
            throw new SecurityException("Invalid user: " + username);
        }
        if (!isValidPassword(username, password)) {
            throw new SecurityException("Invalid password for user: " + username);
        }
        return true;
    }
    
    public boolean loginUserCompliant(String username, String password) {
        if (!isValidUser(username) || !isValidPassword(username, password)) {
            throw new SecurityException("Invalid credentials");
        }
        return true;
    }
    
    private boolean isValidUser(String username) {
        return "admin".equals(username);
    }
    
    private boolean isValidPassword(String username, String password) {
        return "password123".equals(password);
    }
}
