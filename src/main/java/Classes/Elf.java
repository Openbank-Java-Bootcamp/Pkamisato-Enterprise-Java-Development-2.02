package Classes;

public class Elf extends Player{
    private int elvenMagic;

    public Elf(String name, int health, int strength, int lives, int elvenMagic) {
        super(name, health, strength, lives);
        this.elvenMagic = elvenMagic;
    }



    public int getElvenMagic() {
        return elvenMagic;
    }

    public void setElvenMagic(int elvenMagic) {
        this.elvenMagic = elvenMagic;
    }

    @Override
    public void specialBehaviour() {
        this.elvenMagic+=10;
        setHealth(getHealth()*3);
    }
}
