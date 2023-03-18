import java.util.Scanner;

public class Asker {
    public static double getActivity() {
        Scanner scan = new Scanner(System.in);
        System.out.println("To get your activity level, measured from 1.2 to 1.9, please answer a few questions. " +
                "Answer all of these by typing an integer (values are given in questions).\n\t" +
                "1. How many times a week do you work out?(enter number from 0 to 7");
        int frequency = scan.nextInt() / 10;
        System.out.println("\n\t2. How would you describe your training load? From 1 - don't feel it " +
                "at all to 6 - draining, hard workouts");
        int load = scan.nextInt() / 10;
        System.out.println("\n\t3. How would you describe your daily activity level? From 1 - \"sitting job/" +
                "laying on bed with no strolls\" to 6 - \"active job, 10k+ steps a day\"");
        int dailyActivity = scan.nextInt() / 10;
        scan.close();
        return frequency + load + dailyActivity;

    }
    public static void askForAction() {
        Scanner scan = new Scanner(System.in);
        System.out.println("""
                What would you like to do?
                \t1.Change personal info
                \t2.Get stats
                Enter your choice(integer):""");
        int choice = scan.nextInt();
        switch (choice) {
            case 1 -> askInfo();
            case 2 -> askStats();
            default -> {
                System.out.println("Wrong value.");
                askForAction();
            }
        }
        scan.close();
    }
    public static void askInfo() {
        Scanner scan = new Scanner(System.in);
        System.out.println("""
                What kind of personal info would you like to change?
                \t1.Reset weight
                \t2.Reset height
                \t3.Reset calories norm
                \t4.Add or delete pharmacy
                \t5.Go to 'training' menu
                Enter your choice(integer):""");
        int choice = scan.nextInt();
//        switch (choice) {
//            case 1 -> System.out.print("Enter weight value: ");
//            case 2 -> askStats();
//            default -> {
//                System.out.println("Wrong value.");
//                askForAction();
//            }
//        }
    }
    public static void askStats() {
        System.out.println("What kind of stats would you like to get?");
    }
}
