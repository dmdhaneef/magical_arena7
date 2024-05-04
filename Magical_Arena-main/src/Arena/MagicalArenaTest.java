package Arena;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MagicalArenaTest {

    @Test
    public void testGetMatchResult_PlayerAWins() {
        Player playerA = new Player(100, 10, 5);
        Player playerB = new Player(50, 5, 10);

        String result = MagicalArena.getMatchResult(playerA, playerB);

        assertEquals("Player A wins!", result);
    }

    @Test
    public void testGetMatchResult_PlayerBWins() {
        Player playerA = new Player(50, 5, 10);
        Player playerB = new Player(100, 10, 5);

        String result = MagicalArena.getMatchResult(playerA, playerB);

        assertEquals("Player B wins!", result);
    }

    @Test
    public void testGetMatchResult_Draw() {
        Player playerA = new Player(50, 10, 10);
        Player playerB = new Player(50, 10, 10);

        String result = MagicalArena.getMatchResult(playerA, playerB);

        assertEquals("It's a draw!", result);
    }
    
    @Test
    public void testGetMatchResult_PlayerAWithHigherHealth_Wins() {
        Player playerA = new Player(100, 10, 5);
        Player playerB = new Player(50, 10, 10);

        String result = MagicalArena.getMatchResult(playerA, playerB);

        assertEquals("Player A wins!", result);
    }
    
    @Test
    public void testGetMatchResult_PlayerBWithHigherHealth_Wins() {
        Player playerA = new Player(50, 10, 10);
        Player playerB = new Player(100, 10, 5);

        String result = MagicalArena.getMatchResult(playerA, playerB);

        assertEquals("Player B wins!", result);
    }

    @Test
    public void testGetMatchResult_PlayerAAndBWithSameHealth_Draw() {
        Player playerA = new Player(50, 10, 10);
        Player playerB = new Player(50, 10, 10);

        String result = MagicalArena.getMatchResult(playerA, playerB);

        assertEquals("It's a draw!", result);
    }
}
