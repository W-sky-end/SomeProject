    import java.util.Scanner;

    public class Main {

            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

                Zombie zombie = new Zombie("Walker",100,5);
                Player testGuy = new Player("Guy",100);
                Weapon sword = new Weapon("Sword",10);

                testGuy.takeDamage(zombie);
                testGuy.setWeapon(sword);

                testGuy.heal(10);

                testGuy.printInfo();

                System.out.println("Name: " + sword.getName() + "\nDamage: " + sword.getDamage());

                boolean run = true;
                System.out.println("Choose from the following options:\n1.Zombie");
                int n = sc.nextInt();
                while (run) {
                    switch (n){
                        case 1:
                            testGuy.takeDamage(zombie);
                            zombie.takeDamage(testGuy);
                            zombie.alive();
                            if (!testGuy.alive()) {
                                System.out.println("You lose");
                                run = false;
                            }
                            if (!zombie.alive()) {
                                System.out.println("Zombie is dead");
                                run = false;
                                }
                            }
                            break;
                    }
                }



        }
