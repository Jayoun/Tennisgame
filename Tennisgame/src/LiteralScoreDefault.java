public class LiteralScoreDefault extends LiteralScore{
    public static final String LOVE = "Love";
    public static final String FIFTEEN = "Fifteen";
    public static final String THIRTY = "Thirty";
    public static final String FORTY = "Forty";
    private static LiteralScore literalScore;

    private LiteralScoreDefault() {
        super();
        literalScore = this;
    }

    public static LiteralScore getInstance(int player1_score, int player2_score) {
        if(literalScore == null)
            literalScore = new LiteralScoreDefault();

        literalScore.setPlayersScore(player1_score,player2_score );
        return literalScore;
    }

    @Override
    public String getLiteralScore() {
        return getDefaultLiteralScoreForEach(player1_score)+"-"+ getDefaultLiteralScoreForEach(player2_score);
    }

    private String getDefaultLiteralScoreForEach(int score) {
        switch(score)
        {
            case 0:
                return LOVE;
            case 1:
                return FIFTEEN;
            case 2:
                return THIRTY;
            default:
                return FORTY;
        }
    }
}
