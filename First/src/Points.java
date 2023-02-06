import java.util.Scanner;

public class Points {


    private int points;
    private int dailyGoal = 15;

    Scanner scan = new Scanner(System.in);



    public void menuPoints () {
        boolean exit = true;

        while (exit) {
            System.out.println("Welcome to your high score section!");
            System.out.println("1. Set Daily goal");
            System.out.println("2. See your total score");
            System.out.println("3. Go back.");

            int answer = scan.nextInt();

            switch (answer) {
                case 1:
                    setDailyGoal();
                    break;

                case 2:
                    System.out.println("Your total points are: " + getPoints());
                    break;

                case 3:
                    exit = false;
                    break;
            }

        }

    }

    public void setDailyGoal () {
        System.out.println("What is your daily goal?");
        dailyGoal = scan.nextInt();
        System.out.println("Your daily goal is set to: " + dailyGoal);
    }

    //Points are added, then the method daily goal checks if you reached your daily goal and prints out of you have.
    public void addPoints(int receivedPoints) {
        points = points + receivedPoints;
        dailyGoal(points);
    }

    public void dailyGoal (int points){
        if (points == dailyGoal || points > dailyGoal) {
            System.out.println("You have reached your daily Goal! Good job! \n");
        }

    }


    public int getPoints() {
        return points;
    }

    public int getDailyGoal() {
        return dailyGoal;
    }

}
