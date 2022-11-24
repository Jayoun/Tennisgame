public class LiteralScoreAfterDeuce extends LiteralScore{
    public static final String ADVANTAGE_PLAYER_1 = "Advantage player1";
    public static final String ADVANTAGE_PLAYER_2 = "Advantage player2";
    public static final String WIN_FOR_PLAYER_1 = "Win for player1";
    public static final String WIN_FOR_PLAYER_2 = "Win for player2";
    public static final String DEUCE = "Deuce";
    private static LiteralScore literalScore;

    private LiteralScoreAfterDeuce() {
        super();
        literalScore = this;
    }

    public static LiteralScore getInstance(int player1_score, int player2_score) {
        if(literalScore == null)
            literalScore = new LiteralScoreAfterDeuce();

        literalScore.setPlayersScore(player1_score,player2_score);
        return literalScore;
    }

    @Override
    public String getLiteralScore() {
        int minusResult = player1_score - player2_score;

        if (minusResult==1) return ADVANTAGE_PLAYER_1;
        else if (minusResult ==-1) return ADVANTAGE_PLAYER_2;
        else if (minusResult>=2) return WIN_FOR_PLAYER_1;
        else if (minusResult<=-2) return WIN_FOR_PLAYER_2;
        else return DEUCE;
    }
}
