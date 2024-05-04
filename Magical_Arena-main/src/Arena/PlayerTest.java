package Arena;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PlayerTest {

    @Test
    public void testPlayerCreation() {
        Player player = new Player(100, 10, 5);
        
        assertEquals(100, player.getHealth(), "Health should be initialized correctly");
        assertEquals(10, player.getStrength(), "Strength should be initialized correctly");
        assertEquals(5, player.getAttack(), "Attack should be initialized correctly");
    }
}
