public abstract class LiteralScore {

    protected int player1_score;
    protected int player2_score;

    public LiteralScore(int player1_score, int player2_score) {
        this.player1_score = player1_score;
        this.player2_score = player2_score;
    }

    public void setPlayersScore(int player1_score,int player2_score ){
        this.player1_score = player1_score;
        this.player2_score = player2_score;
    }

    public abstract String getLiteralScore();
}
