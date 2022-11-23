
public class TennisGame1 implements TennisGame {
    
    protected int player1_score = 0;
    protected int player2_score = 0;

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
            return LiteralScoreWithSame.getInstance(player1_score,player2_score).getLiteralScore();
        }
        else if (isAfterDeuce())
        {
            return LiteralScoreAfterDeuce.getInstance(player1_score,player2_score).getLiteralScore();
        }
        else
        {
            return LiteralScoreDefault.getInstance(player1_score,player2_score).getLiteralScore();
        }
    }

    private boolean isAfterDeuce() {
        return player1_score >= 4 || player2_score >= 4;
    }

    private boolean isSameScore() {
        return player1_score == player2_score;
    }

    public boolean isEnd() {
        int score_diff = player1_score - player2_score;
        return (isAfterDeuce() && Math.abs(score_diff) >= 2) ||
                !isAfterDeuce() && Math.abs(score_diff) >= 4;
    }
}
