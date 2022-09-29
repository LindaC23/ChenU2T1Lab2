import java.util.Scanner;

public class ChatBotRunner {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        ChatBot benjamin = new ChatBot("Benjamin", 51);

        System.out.print("Enter your name: ");
        String userName = myScanner.nextLine();
        System.out.print("Enter your favorite number: ");
        int userFavNum = myScanner.nextInt();
        System.out.print("Enter a value (in feet) that you would like to be converted to meters: ");
        int userNum = myScanner.nextInt();
        System.out.print("Enter a value to add to 5 and 1: ");
        int userAdd = myScanner.nextInt();

        benjamin.greeting(userName);
        benjamin.friends();
        benjamin.weather();
        benjamin.favoriteNumber(userFavNum);

        System.out.println("There are " + benjamin.convertFeetToMeters(userNum) + " meters in " + userNum + " feet");
        System.out.println("The sum of 5, 1, and " + userAdd + " is " + benjamin.addNumbers(5, 1, userAdd));
        System.out.println("The product of 2 and 3 is " + benjamin.multiplyNumbers(2, 3));
        System.out.println(benjamin.goodbye());




    }
}
