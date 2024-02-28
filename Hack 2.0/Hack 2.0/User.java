
public class User
{
    private String username;
    private String legalName;
    
    private int householdMembers;
    private int totalUsage;
    private int dailyUsage;
    
    private double waterScore;

    /**
     * Constructor for objects of class User
     */
    public User(String un, String ln, int hm, int tu, int du, double ws)
    {
        username = un;
        legalName = ln;
        
        householdMembers = hm;
        totalUsage = tu;
        dailyUsage = du;
        waterScore = ws;
    }
}
