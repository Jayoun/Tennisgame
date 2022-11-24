public class LiteralScoreWithSame extends LiteralScore{
    public static final String LOVE_ALL = "Love-All";
    public static final String FIFTEEN_ALL = "Fifteen-All";
    public static final String THIRTY_ALL = "Thirty-All";
    public static final String DEUCE = "Deuce";
    private static LiteralScore literalScore;
    private LiteralScoreWithSame() {
        super();
        literalScore = this;
    }

    public static LiteralScore getInstance(int player1_score, int player2_score) {
        if(literalScore == null)
            literalScore = new LiteralScoreWithSame();

        literalScore.setPlayersScore(player1_score,player2_score );
        return literalScore;
    }

    @Override
    public String getLiteralScore() {
        switch (player1_score)
        {
            case SCORE_LOVE:
                return LOVE_ALL;
            case SCORE_FIFTEEN:
                return FIFTEEN_ALL;
            case SCORE_THIRTY:
                return THIRTY_ALL;
            default:
                return DEUCE;
        }
    }
}

