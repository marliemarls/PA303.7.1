import java.util.Scanner;

public class Task11 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many favorite things do you have? ");
        int howMany = scan.nextInt();
        String [] arr = new String[howMany];
        while(howMany > 0) {
            System.out.println("Enter in your items: ");
            String input1 = scan.next();

            howMany--;
        }

    }
}
