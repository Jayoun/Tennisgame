public abstract class LiteralScore {
    public static final int SCORE_LOVE = 0;
    public static final int SCORE_FIFTEEN = 1;
    public static final int SCORE_THIRTY = 2;

    protected int player1_score;
    protected int player2_score;

    public void setPlayersScore(int player1_score,int player2_score ){
        this.player1_score = player1_score;
        this.player2_score = player2_score;
    }

    public abstract String getLiteralScore();
}
