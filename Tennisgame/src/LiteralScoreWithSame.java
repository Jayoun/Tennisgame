public class LiteralScoreWithSame extends LiteralScore{
    private static LiteralScore literalScore;
    private LiteralScoreWithSame(int player1_score, int player2_score) {
        super(player1_score, player2_score);
    }

    public static LiteralScore getInstance(int player1_score, int player2_score) {
        if(literalScore == null)
            literalScore = new LiteralScoreWithSame(player1_score,player2_score );

        literalScore.setPlayersScore(player1_score,player2_score );
        return literalScore;
    }

    @Override
    public String getLiteralScore() {
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
}
