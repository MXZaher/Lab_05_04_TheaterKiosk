import java.util.Scanner;

public class Kiosk {
    public static void main(String[] args) {
        System.out.print("What is your age?: ");
        Scanner in = new Scanner(System.in);
        int age = in.nextInt();
        if(age >= 21)
        {
            System.out.print("Here is your wristband");
        }
    }
}
