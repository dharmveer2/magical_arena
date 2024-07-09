import java.util.Random;

public class Game {
    private Player playerA;
    private Player playerB;
    private Random random;

    public Game(Player playerA, Player playerB) {
        this.playerA = playerA;
        this.playerB = playerB;
        this.random = new Random();
    }

    private int rollDice() {
        return random.nextInt(6) + 1;
    }

    public void start() {
        System.out.println("Game Start!");
        System.out.println("Player A: " + playerA);
        System.out.println("Player B: " + playerB);

        while (playerA.isAlive() && playerB.isAlive()) {
            if (playerA.getHealth() <= playerB.getHealth()) {
                takeTurn(playerA, playerB);
            } else {
                takeTurn(playerB, playerA);
            }
        }

        if (!playerA.isAlive()) {
            System.out.println(playerA + " has been defeated!");
        } else {
            System.out.println(playerB + " has been defeated!");
        }
    }

    private void takeTurn(Player attacker, Player defender) {
        int attackRoll = rollDice();
        int defenseRoll = rollDice();

        int attackDamage = attacker.attackDamage(attackRoll);
        int defenseStrength = defender.defenseStrength(defenseRoll);

        int netDamage = Math.max(0, attackDamage - defenseStrength);
        defender.takeDamage(netDamage);

        System.out.println(attacker + " rolls a " + attackRoll + " and attacks with " + attackDamage + " damage.");
        System.out.println(defender + " rolls a " + defenseRoll + " and defends with " + defenseStrength + " strength.");
        System.out.println(attacker + " attacks " + defender + " for " + netDamage + " damage!");
        System.out.println("Player A Health: " + playerA.getHealth() + ", Player B Health: " + playerB.getHealth());
        System.out.println();
    }
}
