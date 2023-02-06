import java.awt.*;
import java.util.*;


public class CleaningGame {


    private int score;

    private ArrayList<String> RandomChore = new ArrayList<>();


    Scanner scan = new Scanner(System.in);
    Points points = new Points();



    public void gameMenu () {

        boolean exit = true;

        while (exit) {

            System.out.println("Lets play a game!");
            System.out.println("1. Timed cleaning");
            System.out.println("2. Fast cleaning");
            System.out.println("3. Back to start menu");

            int answer = scan.nextInt();

            switch (answer) {
                case 1:
                    timedCleaning();
                    break;

                case 2:
                    fastCleaning();
                    break;

                case 3:
                    exit = false;
                    break;

            }

        }
    }

    public void timedCleaning () {

        boolean exit = true;

        while (exit) {


            System.out.println("How long do you want to clean?");
            System.out.println("Min: ");
            int minutes = scan.nextInt();
            System.out.println("Start cleaning! The program will tell you when you are done!");

            //Counts the time in milli-seconds. The While loop is interrupted when time is passed in minutes.
            long startTime = System.currentTimeMillis();
            long elapsedTime = 0L;

            while (elapsedTime < minutes*60*1000) {
                elapsedTime = (new Date().getTime() - startTime);
            }

            Toolkit.getDefaultToolkit().beep();
            System.out.println("BEEP!");
            System.out.println("Good job!");
            System.out.println("\n");

            points.addPoints(minutes);
            System.out.println(minutes + " points added to you score, keep it up!");


            System.out.println("Press enter to continue.");
            scan.nextLine();

            exit = false;

        }

    }

    public void fastCleaning() {
        System.out.println("In fast cleaning, you should pick up clutter and trash as fast as you can!");
        System.out.println("Throw away the trash, and place the clutter on its right place.");
        System.out.println("You will have 2 minutes clean. Count the amount of clutter and trash you manage to clean!" +
                "You will enter your score. Try to beat your high-score!");
        System.out.println("The time starts NOW!");

        long startTime = System.currentTimeMillis();
        long elapsedTime = 0L;

        while (elapsedTime < 2*60*1000) {
            elapsedTime = (new Date().getTime() - startTime);
        }

        Toolkit.getDefaultToolkit().beep();
        System.out.println("Good job!");
        System.out.println("How many things did you clean?");
        int tempScore = scan.nextInt();

        if (tempScore > getScore()) {
            System.out.println("You beat the high score!");
            System.out.println("Old high score: " + getScore());
            System.out.println("New high score: " + tempScore);
            points.addPoints(7);
            System.out.println("7 points added to you daily score, keep it up!");
            setScore(tempScore);
        }
        else {
            System.out.println("Good job!");
            System.out.println("Your score is: " + tempScore);
            System.out.println("The high score is: " + getScore());
            points.addPoints(3);
            System.out.println("3 points added to you daily score, keep it up!\n");
        }




    }


    public void initializeScore () {
        setScore(0);
        RandomChore.add("Putting dishes in kitchen");
        RandomChore.add("Putting dirty clothes in hamper");
        RandomChore.add("Putting clean clothes in wardrobe");
        RandomChore.add("Putting trash in bin");
    }


    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }


    public ArrayList<String> getRandomChore() {
        return RandomChore;
    }

    public void setRandomChore(ArrayList<String> RandomChore) {
        this.RandomChore = RandomChore;
    }
}
