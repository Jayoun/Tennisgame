public class LiteralScoreDefault extends LiteralScore{
    private static LiteralScore literalScore;

    private LiteralScoreDefault(int player1_score, int player2_score) {
        super(player1_score, player2_score);
    }

    public static LiteralScore getInstance(int player1_score, int player2_score) {
        if(literalScore == null)
            literalScore = new LiteralScoreDefault(player1_score,player2_score );
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
                return "Love";
            case 1:
                return "Fifteen";
            case 2:
                return "Thirty";
            default:
                return "Forty";
        }
    }
}
