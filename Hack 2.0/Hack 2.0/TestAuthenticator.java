
/**
 * Write a description of class TestAuthenticator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TestAuthenticator
{
    private boolean loggedIn;

    /**
     * Constructor for objects of class TestAuthenticator
     */
    public TestAuthenticator()
    {
        loggedIn = false;
    }

    public User login(String username, String password) {
        //if username matches with password in csv file
        if (true) { 
            loggedIn = true;
            return new User("", "", 9, 12, 21, 0.3);
        }
        else {
        
        }
    }
    
    public boolean getLoggedIn() {
        return loggedIn;
    }
    
}
