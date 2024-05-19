import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Creation Account game in Java!");
        String exitOrNot;
        do {
            System.out.print("Enter a day of creation (1-7): ");
            int dayInput = scanner.nextInt();

            if (dayInput >= 1 && dayInput < 7) {

                Day selectedDay = Day.CreationWeek.getDay(dayInput);

                if (selectedDay != null) {
                    System.out.println(selectedDay.getDetails());
                    System.out.println("Would you like to see the verse for reference? (Y/N)");
                    String getReference = scanner.next();
                    if (getReference.equalsIgnoreCase("Y")) {
                        System.out.println(selectedDay.getVerse());
                    } else if (getReference.equalsIgnoreCase("N")) {
                        System.out.println("Okay then. Have a good day");
                    } else {
                        System.out.println("Please enter a valid response");
                    }

                } else {
                    System.out.println("Invalid day input");
                }
            } else {
                System.out.println("Invalid input. Enter a day between 1 and 7");
            }
            System.out.println("Exit? Y/N");
            exitOrNot = scanner.next();
        } while(exitOrNot.equalsIgnoreCase("N"));
        System.out.println("Thanks for playing!");
        scanner.close();
    }
}
