public class winRecorder {

    // Variables to store the names of up to four players
    private String player1;
    private String player2;
    private String player3;
    private String player4;

    /**
     * Creates addPlayer to add players in the first available spot
     * @param playerName is the players name and there can only be 4 players
     */
    public void addPlayer(String playerName) 
    {
        if (player1 == null) 
        {
            player1 = playerName;
        } else if (player2 == null) 
        {
            player2 = playerName;
        } else if (player3 == null) 
        {
            player3 = playerName;
        } else if (player4 == null) 
        {
            player4 = playerName;
        } else 
        {
            System.out.println("Cannot add more than 4 players.");
        }
    }

    /**
     * Create hasEnoughPlayers to check if there are at least two players in the game
     * @return true there are at least 2 players or more in the game, otherwise returns false
     */
    public boolean hasEnoughPlayers() {
        int count = 0;
        if (player1 != null) 
        {
            count++;
        }
        
        if (player2 != null) 
        {
            count++;
        }
        
        if (player3 != null) 
        {
            count++;
        }
        
        if (player4 != null) 
        {
            count++;
        }
        
        return count >= 2;
    }

    /**
     * Creates recordWin to record a win if there are enough players in the game
     */
    public void recordWin() {
        if (hasEnoughPlayers()) 
        {
            System.out.println("Win recorded!");
        } else 
        {
            System.out.println("Not enough players to record a win.");
        }
    }
}
