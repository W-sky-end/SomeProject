public class Main {
    public static void main(String[] args) {
        int health = 100;
        int damage = 35;

        System.out.println("Player's Health: " + health + " ,monster kick player and take a damage: " + damage + "\nPlayer's Health: " +
                (health - damage) );
    }
}
