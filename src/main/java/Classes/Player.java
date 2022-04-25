package Classes;

public abstract class Player {
    private String name;
    private int health;
    private int strength;
    private int lives;
    private int maxHealth;

    public Player(String name, int health, int strength, int lives) {
        this.name = name;
        this.health = health;
        this.maxHealth = health;
        this.strength = strength;
        this.lives = lives;
    }

    public abstract void specialBehaviour();

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", strength=" + strength +
                ", lives=" + lives +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }
}
