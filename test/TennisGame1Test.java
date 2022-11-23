import junit.framework.TestCase;
import org.junit.Before;

public class TennisGame1Test extends TestCase {


    String player1 = "leek";
    String player2 = "lily";

    TennisGame1 game;

    @Before
    public void setUp() {
        game = new TennisGame1();
    }

    public void testWonPoint(String player, String score) {
     game.wonPoint("player1");
        assertEquals("Fifteen-Love", game.getLiteralScore());
        game.wonPoint("player1");
        assertEquals("Thirty-Love", game.getLiteralScore());
        game.wonPoint("player1");
        assertEquals("Forty-Love", game.getLiteralScore());
        game.wonPoint("player1");
        assertEquals("Win for player1", game.getLiteralScore());
    }

    public void testGetLiteralScore_Player1_Win_Continue() {
        game.wonPoint("player1");
        assertEquals("Fifteen-Love", game.getLiteralScore());
        game.wonPoint("player1");
        assertEquals("Thirty-Love", game.getLiteralScore());
        game.wonPoint("player1");
        assertEquals("Forty-Love", game.getLiteralScore());
        game.wonPoint("player1");
        assertEquals("Win for player1", game.getLiteralScore());
    }

    public void testGetLiteralScore_Player2_Win_Continue() {
        game.wonPoint("player2");
        assertEquals("Love-Fifteen", game.getLiteralScore());
        game.wonPoint("player2");
        assertEquals("Love-Thirty", game.getLiteralScore());
        game.wonPoint("player2");
        assertEquals("Love-Forty", game.getLiteralScore());
        game.wonPoint("player2");
        assertEquals("Win for player2", game.getLiteralScore());
    }

    public void testGetLiteralScore_Player1_Win_and_Player2_WinContinue() {

        game.wonPoint("player1");
        assertEquals("Fifteen-Love", game.getLiteralScore());
        game.wonPoint("player2");
        assertEquals("Fifteen-All", game.getLiteralScore());

        game.wonPoint("player1");
        assertEquals("Thirty-Fifteen", game.getLiteralScore());
        game.wonPoint("player2");
        assertEquals("Thirty-All", game.getLiteralScore());

        game.wonPoint("player1");
        assertEquals("Forty-Thirty", game.getLiteralScore());
        game.wonPoint("player2");
        assertEquals("Deuce", game.getLiteralScore());

        game.wonPoint("player1");
        assertEquals("Advantage player1", game.getLiteralScore());
        game.wonPoint("player2");
        assertEquals("Deuce", game.getLiteralScore());

        game.wonPoint("player2");
        assertEquals("Advantage player2", game.getLiteralScore());
        game.wonPoint("player1");
        assertEquals("Deuce", game.getLiteralScore());

        game.wonPoint("player1");
        assertEquals("Advantage player1", game.getLiteralScore());

        game.wonPoint("player1");
        assertEquals("Win for player1", game.getLiteralScore());
    }


    public void testGetLiteralScore_Player2_Win_and_Player1_WinContinue() {
        game.wonPoint("player2");
        assertEquals("Love-Fifteen", game.getLiteralScore());
        game.wonPoint("player1");
        assertEquals("Fifteen-All", game.getLiteralScore());

        game.wonPoint("player2");
        assertEquals("Fifteen-Thirty", game.getLiteralScore());
        game.wonPoint("player1");
        assertEquals("Thirty-All", game.getLiteralScore());

        game.wonPoint("player2");
        assertEquals("Thirty-Forty", game.getLiteralScore());
        game.wonPoint("player1");
        assertEquals("Deuce", game.getLiteralScore());

        game.wonPoint("player2");
        assertEquals("Advantage player2", game.getLiteralScore());
        game.wonPoint("player1");
        assertEquals("Deuce", game.getLiteralScore());

        game.wonPoint("player2");
        assertEquals("Advantage player2", game.getLiteralScore());
        game.wonPoint("player2");
        assertEquals("Win for player2", game.getLiteralScore());
    }

    public void testIsNotEnd() {
        game.wonPoint("player1");
        game.getLiteralScore();
        assertEquals(false,  game.isEnd());
        game.wonPoint("player1");
        game.getLiteralScore();
        assertEquals(false,  game.isEnd());
        game.wonPoint("player1");
        game.getLiteralScore();
        assertEquals(false,  game.isEnd());
    }

    public void testIsEnd() {
        game.wonPoint("player1");
        game.wonPoint("player1");
        game.wonPoint("player1");
        game.wonPoint("player1");
        System.out.println(game.getLiteralScore());
        assertEquals(true,  game.isEnd());
    }

    public void testIsDueceNotEnd() {
        game.wonPoint("player1");
        game.wonPoint("player1");
        game.wonPoint("player1");
        game.wonPoint("player1");
        game.wonPoint("player2");
        game.wonPoint("player2");
        game.wonPoint("player2");
        game.wonPoint("player2");
        System.out.println(game.getLiteralScore());
        assertEquals(false,  game.isEnd());
    }

    public void testIsAdvantageNotEnd() {
        game.wonPoint("player1");
        game.wonPoint("player1");
        game.wonPoint("player1");
        game.wonPoint("player1");
        game.wonPoint("player2");
        game.wonPoint("player2");
        game.wonPoint("player2");
        game.wonPoint("player2");
        game.wonPoint("player1");
        System.out.println(game.getLiteralScore());
        assertEquals(false,  game.isEnd());
    }

    public void testIsEnd_Player1WonafterAdvantageEnd() {
        game.wonPoint("player1");
        game.wonPoint("player1");
        game.wonPoint("player1");
        game.wonPoint("player1");
        game.wonPoint("player2");
        game.wonPoint("player2");
        game.wonPoint("player2");
        game.wonPoint("player2");
        game.wonPoint("player1");
        game.wonPoint("player1");
        System.out.println(game.getLiteralScore());
        assertEquals(true,  game.isEnd());
    }

    public void testIsNotEndWithoutGetLiteralScore() {
        game.wonPoint("player1");
        game.wonPoint("player1");
        game.wonPoint("player1");
        game.wonPoint("player1");
        System.out.println(game.getLiteralScore());
        assertEquals(true,  game.isEnd());
    }
}