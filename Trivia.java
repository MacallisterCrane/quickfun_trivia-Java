import java.util.Scanner;

public class Trivia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the Trivia Quiz! Here are 3 upcoming questions.");
        int score = 0;

        System.out.println("Which country held the 2016 Summer Olympics?");
        System.out.println("a) China");
        System.out.println("b) Ireland");
        System.out.println("c) Brazil");
        System.out.println("d) Italy");
        String guess1 = scan.nextLine();
        switch (guess1) {
            case "c":
                score += 5;
                break;
            default:
            System.out.println("That's not a valid answer! The question has been counted against you");
                break;
        }

        System.out.println("What is the white wizard's name in Lord of the Rings?");
        System.out.println("a) Gimli");
        System.out.println("b) Gamet");
        System.out.println("c) Dumbledore");
        System.out.println("d) Gandalf"); // Fixed the typo here
        String guess2 = scan.nextLine();
        switch (guess2) { // Use guess2 instead of guess1
            case "d":
                score += 5;
                break;
            default:
            System.out.println("That's not a valid answer! The question has been counted against you"); break;
        }

        System.out.println("What is the rarest blood type?");
        System.out.println("a) O");
        System.out.println("b) A");
        System.out.println("c) B");
        System.out.println("d) AB-");
        String guess3 = scan.nextLine();
        switch (guess3) {
            case "d":
                score += 5;
                break;
            default:
            System.out.println("That's not a valid answer! The question has been counted against you"); break;
        }

        System.out.println("Your final score is " + score + "/15");
        if (score > 10) {
            System.out.println("Wow! Perfect score! You know your trivia!");
        } else if (score > 5 && score < 15) {
            System.out.println("Not too bad. That's 2/3!");
        } else {
            System.out.println("Yikes. That's not a very good score.");
        }

        scan.close();
    }
}