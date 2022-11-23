public class LiteralScoreAfterDeuce extends LiteralScore{
    private static LiteralScore literalScore;

    private LiteralScoreAfterDeuce(int player1_score, int player2_score) {
        super(player1_score, player2_score);
        literalScore = this;
    }

    public static LiteralScore getInstance(int player1_score, int player2_score) {
        if(literalScore == null)
            literalScore = new LiteralScoreAfterDeuce(player1_score,player2_score );
        literalScore.setPlayersScore(player1_score,player2_score );
        return literalScore;
    }

    @Override
    public String getLiteralScore() {
        int minusResult = player1_score - player2_score;

        if (minusResult==1) return "Advantage player1";
        else if (minusResult ==-1) return "Advantage player2";
        else if (minusResult>=2) return "Win for player1";
        else if (minusResult<=-2) return "Win for player2";
        else return "Deuce";
    }
}
