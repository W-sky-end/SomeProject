public class Main {
    public static void main(String[] args) {


    }
    public static void attack () {
        System.out.println("Player attacked enemy");
    }
    public static String attack (String name) {
        return "Player attacked" + name;
    }
    public static void attack (String name , int damage) {
        System.out.println("Player attacked" + name + " " + damage + " damage");
    }
}



