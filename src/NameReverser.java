import java.util.Scanner;

public class NameReverser {
    public static void main(String[] args) {
        System.out.println("Welcome to name reverser software");
        while (true) {

            Scanner input = new Scanner(System.in);
            System.out.println("Enter Your Name: enter 'exit' to close app");
            // collect input
            String name = input.nextLine();

            if(name.equalsIgnoreCase("exit")) {
                System.out.println("Thanks for using our app. Goodbye");
                break;
            }
            // placeholder for the reversed name characters
            char[] reverseNameArray = new char[name.length()];

            int i = name.length() - 1;
            int j = 0;

            while (i >= 0) {
                reverseNameArray[j] = name.charAt(i);
                i--;
                j++;
            }
            String reversedName = new String(reverseNameArray);
            System.out.println("Name successfully reversed: " + name + "  ==>> " + reversedName);

        }

    }
}
