import java.util.Scanner;

public class Main {

    /*

    DELPROV 2 - PROGRAMMERINGSPROJEKT

    AUTHOR:
    Ulrika Eriksson, 2022-06-25

    DESCRIPTION:

    Welcome to CLeaning Buddy!

    Cleaning Buddy is a program that helps you to clean, by giving you structured cleaning activities.
    This program can help people with executive dysfunction, if you struggle with mental health, have
    ADHD or autism.

    In this program you can clean something random, get a to-do list to clean a room or do a cleaning game. You can
    edit some of the features. Points are collected, try to reach you daily goal!

    Clean safe!


     */



    public static void main(String[] args) {


        //Creates everything the Main needs
        Scanner scan = new Scanner(System.in);
        boolean exit = true;

        Room room = new Room();
        RandomRoom random = new RandomRoom();
        CleaningGame game = new CleaningGame();
        Points points = new Points();

        //lists are created in methods, with 'add'.
        room.initializeRooms();
        random.initializeRandom();
        game.initializeScore();


        //Start of the program
        System.out.println("\n");
        System.out.println("Welcome to Cleaning Buddy! Please choose what you want to " +
                "do in the menu: ");
        System.out.println("\n");

        do {

            System.out.println("1. Clean a room.");
            System.out.println("2. Random Cleaning Activity.");
            System.out.println("3. Play a game.");
            System.out.println("4. Set daily goal and see points. Your daily goal is now " + points.getDailyGoal() + " points.");
            System.out.println("5. Exit.");
            System.out.println("6. Help.");

            int answer = scan.nextInt();

            //Takes you to the different classes
            switch (answer) {
                case 1:
                    room.menuRoom();
                    break;

                case 2:
                    random.menuRandom();
                    break;

                case 3:
                    game.gameMenu();
                    break;

                case 4:
                    points.menuPoints();
                    break;

                case 5:
                    exit = false;
                    break;

                case 6:
                    System.out.println("Welcome to cleaningBuddy! The only app you need to keep your home clean!");
                    System.out.println("There is tonnes of activities to make cleaning easier.");
                    System.out.println("This app is designed for people with executive dysfunction, for example if you're in depression, have autism or adhd.");
                    System.out.println("\n");
                    System.out.println("You can choose a room to clean. You can make your own lists with rooms, with activities.");
                    System.out.println("You can choose a to clean something random, if you don't know what to clean.");
                    System.out.println("You can play a cleaning game, to try making cleaning a bit more fun!");
                    System.out.println("You can also check you cleaning-points. Try to reach your daily goal or compete with yourself.");

            }



        } while (exit);



    }
}