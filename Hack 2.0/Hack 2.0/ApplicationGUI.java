import java.util.Scanner;
/**
 * Write a description of class ApplicationGUI here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ApplicationGUI
{
    // instance variables - replace the example below with your own
    private Application app;
    private User currentUser;
    private TestAuthenticator auth;

    /**
     * Constructor for objects of class ApplicationGUI
     */
    public ApplicationGUI()
    {
        auth = new TestAuthenticator();
        Scanner scanObj = new Scanner(System.in);
        String username;
        String password;
        
        while (!auth.getLoggedIn()) {
            System.out.println("Username: ");
            username = scanObj.nextLine();
            
            System.out.println("Password: ");
            password = scanObj.nextLine();
            
            currentUser = auth.login(username, password);
            
            if (!auth.getLoggedIn()) {
                System.out.println("Login Failed!");
            }
            else {
                System.out.println("Login Success!");
            }
        }
        
        app = new Application(currentUser);
    }
}
