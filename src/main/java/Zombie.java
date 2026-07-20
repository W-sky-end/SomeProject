import java.util.Random;

public class Zombie extends Monster {
    private boolean resurrected = false;

    public Zombie(String name, int hp, int damage) {
        super(name, hp, damage);
    }

    public void resurrection() {
        Random rand = new Random();
        int r = rand.nextInt(3);
        if (getHp() <= 0) {
            if (!resurrected) {
                if (r == 2) {
                    heal(getMaxHP() * 30 / 100);
                    System.out.println("Zombie staying again");
                }
            }
        }
    }
}
