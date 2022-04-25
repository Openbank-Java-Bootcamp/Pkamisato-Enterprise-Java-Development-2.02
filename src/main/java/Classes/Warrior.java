package Classes;

public class Warrior extends Player{
    private int stamina;

    public Warrior(String name, int health, int strength, int lives, int stamina) {
        super(name, health, strength, lives);
        this.stamina = stamina;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    @Override
    public void specialBehaviour() {
        this.stamina+=1;
        setStrength(getStrength()*2);
    }
}
