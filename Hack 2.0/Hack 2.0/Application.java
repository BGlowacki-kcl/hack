
public class Application
{
    User currentUser;
    Leaderboard leaderboard;
    Challenges challenges;
    UsageInput usageInput;
    Tips tips;
    
    public Application(User user)
    {
        currentUser = user;
        leaderboard = new Leaderboard();
        challenges = new Challenges();
        usageInput = new UsageInput();
        tips = new Tips();
    }
    
    
    
}
