public class Player {
    private String name;
    private int health;
    private int strength;
    private int attack;

    public Player(String name, int health, int strength, int attack) {
        this.name = name;
        this.health = health;
        this.strength = strength;
        this.attack = attack;
    }

    public boolean isAlive() {
        return this.health > 0;
    }

    public void takeDamage(int damage) {
        this.health -= damage;
        if (this.health < 0) {
            this.health = 0;
        }
    }

    public int attackDamage(int diceRoll) {
        return this.attack * diceRoll;
    }

    public int defenseStrength(int diceRoll) {
        return this.strength * diceRoll;
    }

    public int getHealth() {
        return health;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
