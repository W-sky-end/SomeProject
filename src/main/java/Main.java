public class Main {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;


        for (int i = 1; i <= 10; i++) {
            System.out.println(i + ")i = " + i);
        }
        System.out.println("==========NEXT==========");
        for (int i = 0; i <= 20; i+=2) {
            System.out.println(count++ + ")i = " + i);
        }
        count = 0;
        System.out.println("==========NEXT==========");
        for (int i = 0; i <= 5; i++) {
            sum += i;
            System.out.println("Summary :" + sum);
        }
    }
}
