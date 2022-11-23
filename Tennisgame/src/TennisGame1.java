
public class TennisGame1 implements TennisGame {
    
    private int player1_score = 0;
    private int player2_score = 0;
    private boolean isEnd = false;
    
    public TennisGame1() {

    }

    public void wonPoint(String playerName) {
        if (playerName == "player1")
            player1_score += 1;
        else
            player2_score += 1;
    }

    public String getLiteralScore() {
        if (isSameScore())
        {
            return getLiteralScoreWithSame();
        }
        if (isAfterDeuce())
        {
            return getLiteralScoreAfterDeuce();
        }
        else
        {
            return getDefaultLiteralScore();
        }
    }

    private boolean isAfterDeuce() {
        return player1_score >= 4 || player2_score >= 4;
    }

    private boolean isSameScore() {
        return player1_score == player2_score;
    }

    private String getDefaultLiteralScore() {
        return getDefaultLiteralScoreForEach(player1_score)+"-"+ getDefaultLiteralScoreForEach(player2_score);
    }

    private String getDefaultLiteralScoreForEach(int score) {
        switch(score)
        {
            case 0:
                return "Love";
            case 1:
                return "Fifteen";
            case 2:
                return "Thirty";
            default:
                return "Forty";
        }
    }

    private String getLiteralScoreWithSame() {
        switch (player1_score)
        {
            case 0:
                return  "Love-All";
            case 1:
                return  "Fifteen-All";
            case 2:
                return  "Thirty-All";
            default:
                return  "Deuce";
        }
    }

    private String getLiteralScoreAfterDeuce() {
        int minusResult = player1_score - player2_score;

        if (minusResult==1) return "Advantage player1";
        else if (minusResult ==-1) return "Advantage player2";
        else if (minusResult>=2) return "Win for player1";
        else if (minusResult<=-2) return "Win for player2";
        else return "Deuce";
    }

    public boolean isEnd() {
        int score_diff = player1_score - player2_score;
        isEnd = (isAfterDeuce() && Math.abs(score_diff) >= 2) ||
                !isAfterDeuce() && Math.abs(score_diff) >= 4;

        return isEnd;
    }

}
