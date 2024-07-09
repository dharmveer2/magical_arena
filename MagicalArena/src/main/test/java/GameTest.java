import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GameTest {

    @Test
    public void testPlayerHealthReduction() {
        Player playerA = new Player("Player A", 50, 5, 10);
        Player playerB = new Player("Player B", 100, 10, 5);

        Game game = new Game(playerA, playerB);
        game.start();

        assertTrue(!playerA.isAlive() || !playerB.isAlive(), "One of the players should be dead");
    }
}
