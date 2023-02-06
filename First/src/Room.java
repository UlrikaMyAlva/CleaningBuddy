import java.util.ArrayList;
import java.util.Scanner;

public class Room {


    Scanner scan = new Scanner(System.in);

    private ArrayList <String> listRoom1 = new ArrayList<>(); //Living Room
    private ArrayList <String> listRoom2 = new ArrayList<>(); //Kitchen
    private ArrayList <String> listRoom3 = new ArrayList<>(); //Bedroom
    private ArrayList <String> listRoom4 = new ArrayList<>(); //Bathroom
    private ArrayList <String> listRoom5 = new ArrayList<>(); //Hallway
    private ArrayList <String> listRoom6 = new ArrayList<>(); //Custom

    Points points = new Points();

    //This is only the names of the rooms, to make it possible to change the name of the rooms for the user
    private String room1 = "Living Room";
    private String room2 = "Kitchen";
    private String room3 = "Bedroom";
    private String room4 = "Bathroom";
    private String room5 = "Hallway";
    private String room6 = "Custom Room"; //By default: Custom //YOu need to change this.


    public void menuRoom () {

        boolean exit = true;

        System.out.println("Welcome to Clean a room!");
        System.out.println("You will get a room to clean. Please choose: ");

        while (exit) {
            System.out.println("1. Choose a room to clean.");
            System.out.println("2. Choose a room to modify.");
            System.out.println("3. Go back to start menu.");
            System.out.println("4. Help.");

            int answer = scan.nextInt();

            switch (answer) {
                case 1:
                    cleanRoom();
                    break;
                case 2:
                    modifyRoom();
                    break;
                case 3:
                    exit = false;
                    break;
                case 4:
                    System.out.println("Welcome to help!");
                    System.out.println("In Choose a room to clean, your will get a to do list for that room.");
                    System.out.println("If you want to modify that room, please choose Choose a room to modify.");
                    System.out.println("To go back to the start menu, please choose 3.");
                    System.out.println("Thank you for using CleanBuddy!");
                    break;

            }

        }

    }

    public void cleanRoom () {
        boolean exit = true;

        while (exit) {
            System.out.println("\n Please choose a room to clean: ");
            System.out.println("1." + getRoom1()); //By default: Living Room
            System.out.println("2." + getRoom2()); //By default: Kitchen
            System.out.println("3." + getRoom3()); //By default: Bedroom
            System.out.println("4." + getRoom4()); //By default: Bathroom
            System.out.println("5." + getRoom5()); //By default: Hallway
            System.out.println("6." + getRoom6()); //By default: Custom room
            System.out.println("7. Go Back.");
            System.out.println("(Press Enter when you finished a task)");

            int answer = scan.nextInt();
            scan.nextLine();
            switch (answer) {
                //LIVING ROOM
                case 1:
                    //Every task in the list is iterated upon
                    for (int i = 0; i < listRoom1.size(); i++) {
                        System.out.println("Task " + (i + 1));
                        System.out.println(listRoom1.get(i));
                        scan.nextLine();
                    }
                    System.out.println("Your done! Good job!");
                    System.out.println("\n");
                    points.addPoints(10);
                    System.out.println("\n\t 10 points added to you score, keep it up!");
                    break;
                //KITCHEN
                case 2:
                    for (int i = 0; i < listRoom2.size(); i++) {
                        System.out.println("Task " + (i + 1));
                        System.out.println(listRoom2.get(i));
                        scan.nextLine();
                    }
                    System.out.println("Your done! Good job!");
                    System.out.println("\n");
                    points.addPoints(10);
                    System.out.println("\n\t 10 points added to you score, keep it up!");
                    break;
                //BEDROOM
                case 3:
                    for (int i = 0; i < listRoom3.size(); i++) {
                        System.out.println("Task " + (i + 1) + ". Press Enter when you finished task!");
                        System.out.println(listRoom3.get(i));
                        scan.nextLine();
                    }
                    System.out.println("Your done! Good job!");
                    System.out.println("\n");
                    points.addPoints(10);
                    System.out.println("\n\t 10 points added to you score, keep it up!");
                    break;
                //BATHROOM
                case 4:
                    for (int i = 0; i < listRoom4.size(); i++) {
                        //outAll = listRoom4.get(i);
                        System.out.println("Task " + (i + 1) + ". Press Enter when you finished task!");
                        System.out.println(listRoom4.get(i));
                        scan.nextLine();
                    }
                    System.out.println("Your done! Good job!");
                    System.out.println("\n");
                    points.addPoints(10);
                    System.out.println("\n\t 10 points added to you score, keep it up!");
                    break;
                //HALLWAY
                case 5:
                    for (int i = 0; i < listRoom5.size(); i++) {
                        System.out.println("Task " + (i + 1) + ". Press Enter when you finished task!");
                        System.out.println(listRoom5.get(i));
                        scan.nextLine();
                    }
                    System.out.println("Your done! Good job!");
                    System.out.println("\n");
                    points.addPoints(10);
                    System.out.println("\n\t 10 points added to you score, keep it up!");
                    break;
                //CUSTOM ROOM
                case 6:
                    for (int i = 0; i < listRoom6.size(); i++) {
                        System.out.println("Task " + (i + 1) + ". Press Enter when you finished task!");
                        System.out.println(listRoom6.get(i));
                        scan.nextLine();
                    }
                    System.out.println("Your done! Good job!");
                    System.out.println("\n");
                    points.addPoints(10);
                    System.out.println("\n\t10 points added to you score, keep it up!");
                    break;
                //EXIT
                case 7:
                    exit = false;


            }
        }
    }

    //Here the list is wiped, so the user can make their own lists. The user can change the name of the room if they want to.
    public void modifyRoom () {

        boolean exit = true;

        while (exit) {
            System.out.println("What room do you want to modify?: ");
            System.out.println("1." + getRoom1());
            System.out.println("2." + getRoom2());
            System.out.println("3." + getRoom3());
            System.out.println("4." + getRoom4());
            System.out.println("5." + getRoom5());
            System.out.println("6." + getRoom6());
            System.out.println("7.Go back.");

            int answer = scan.nextInt();
            scan.nextLine();

            switch (answer) {
                //LIVING ROOM
                case 1:
                    System.out.println("Do you want to change the name of the room? Room " + getRoom1() + " 1. Yes, 2. No");
                    answer = scan.nextInt();
                    scan.nextLine();

                    if (answer == 1) {
                        String newName = changeName(getRoom1());
                        setRoom1(newName);
                        System.out.println("The name is now: " + getRoom1());
                    }
                    else {
                        System.out.println("Name is: " + getRoom1());
                    }
                    System.out.println("Time to add activities to your room!");
                    listRoom1.clear();
                    System.out.println(getRoom1() + " list is now empty.");
                    listRoom1 = modifyActions(listRoom1);
                    break;

                //KITCHEN
                case 2:
                    System.out.println("Do you want to change the name of the room? Room " + getRoom2() + " 1. Yes, 2. No");
                    answer = scan.nextInt();
                    scan.nextLine();

                    if (answer == 1) {
                        String newName = changeName(getRoom2());
                        setRoom2(newName);
                        System.out.println("The name is now: " + getRoom2());
                    }
                    else {
                        System.out.println("Name is" + getRoom2());
                    }

                    System.out.println("Time to add activities to your room!");
                    listRoom2.clear();
                    System.out.println(getRoom2() + " list is now empty.");
                    listRoom2 = modifyActions(listRoom2);
                    break;

                //BEDROOM
                case 3:
                    System.out.println("Do you want to change the name of the room? Room " + getRoom3() + " 1. Yes, 2. No");
                    answer = scan.nextInt();
                    scan.nextLine();

                    if (answer == 1) {
                        String newName = changeName(getRoom3());
                        setRoom3(newName);
                        System.out.println("The name is now: " + getRoom3());
                    }
                    else {
                        System.out.println("Name is" + getRoom3());
                    }

                    System.out.println("Time to add activities to your room!");
                    listRoom3.clear();
                    System.out.println(getRoom3() + " list is now empty.");
                    listRoom3 = modifyActions(listRoom3);
                    break;

                //BATHROOM
                case 4:
                    System.out.println("Do you want to change the name of the room? Room " + getRoom4() + " 1. Yes, 2. No");
                    answer = scan.nextInt();
                    scan.nextLine();

                    if (answer == 1) {
                        String newName = changeName(getRoom4());
                        setRoom4(newName);
                        System.out.println("The name is now: " + getRoom4());
                    }
                    else {
                        System.out.println("Name is" + getRoom4());
                    }

                    System.out.println("Time to add activities to your room!");
                    listRoom4.clear();
                    System.out.println(getRoom4() + " list is now empty.");
                    listRoom4 = modifyActions(listRoom4);
                    break;

                //HALLWAY
                case 5:
                    System.out.println("Do you want to change the name of the room? Room " + getRoom5() + " 1. Yes, 2. No");
                    answer = scan.nextInt();
                    scan.nextLine();

                    if (answer == 1) {
                        String newName = changeName(getRoom5());
                        setRoom5(newName);
                        System.out.println("The name is now: " + getRoom5());
                    }
                    else {
                        System.out.println("Name is" + getRoom5());
                    }

                    System.out.println("Time to add activities to your room!");
                    listRoom5.clear();
                    System.out.println(getRoom5() + " list is now empty.");
                    listRoom5 = modifyActions(listRoom5);
                    break;

                //CUSTOM ROOM
                case 6:
                    System.out.println("Do you want to change the name of the room? Room " + getRoom6() + " 1. Yes, 2. No");
                    answer = scan.nextInt();
                    scan.nextLine();

                    if (answer == 1) {
                        String newName = changeName(getRoom6());
                        setRoom6(newName);
                        System.out.println("The name is now: " + getRoom6());
                    }
                    else {
                        System.out.println("Name is" + getRoom6());
                    }

                    System.out.println("Time to add activities to your room!");
                    listRoom6.clear();
                    System.out.println(getRoom6() + " list is now empty.");
                    listRoom6 = modifyActions(listRoom6);
                    break;

                //EXIT
                case 7:
                    exit = false;
                    break;
            }


        }

    }

    //Method receives the name of the room, and returns the new name.
    public String changeName (String name) {
        System.out.println("What do you want change " + name + " to?");
        String newName = scan.nextLine();
        return newName;
    }

    //The method receives the list, puts it in a temporary list and clears it.
    //Then the user can add as many steps as they want.
    //The temporary list is then returned and put in the selected list.
    public ArrayList<String> modifyActions (ArrayList<String> temp) {
        int step = 0;
        boolean exit = true;
        temp.clear();
        System.out.println("Please add your actions. Type EXIT when you are finished.");
        do {
            System.out.println("Step " + step);
            step++;
            String action = scan.nextLine();

            if (action.equals("EXIT")) {
                exit = false;
            }
            else {
                temp.add(action);
            }

        } while (exit);

        return temp;
    }

    public void initializeRooms () {
        //Living room
        listRoom1.add("Clean floor from thrash.");
        listRoom1.add("Dirty clothes in hamper, clean clothes in wardrobe.");
        listRoom1.add("Put dishes in kitchen.");
        listRoom1.add("Clean spaces from trash.");
        listRoom1.add("Put objects in right places.");
        listRoom1.add("Dust furniture.");
        listRoom1.add("Vacuum floor.");
        listRoom1.add("Mop floor.");

        //Kitchen
        listRoom2.add("Clean floor from thrash.");
        listRoom2.add("Clean counters from thrash.");
        listRoom2.add("Do the dishes.");
        listRoom2.add("Throw away old food from the fridge.");
        listRoom2.add("Go out with the trash.");
        listRoom2.add("Wipe counters.");
        listRoom2.add("Clean oven.");
        listRoom2.add("Vacuum floor.");
        listRoom2.add("Mop floor.");

        //Bedroom
        listRoom3.add("Dirty clothes in hamper.");
        listRoom3.add("Clean clothes in dresser.");
        listRoom3.add("Dirty dishes in dishwasher.");
        listRoom3.add("Clear the floor");
        listRoom3.add("Clean of desk and nightstand.");
        listRoom3.add("Make bed");
        listRoom3.add("Take out trash");
        listRoom3.add("Vacuum");
        listRoom3.add("Mop floor");

        //Bathroom
        listRoom4.add("Clear of counter.");
        listRoom4.add("Wipe outside of toilet.");
        listRoom4.add("Scrub inside of toilet");
        listRoom4.add("Clean shower/tub");
        listRoom4.add("Clean mirrors");
        listRoom4.add("Clean floor");
        listRoom4.add("Clean sink");
        listRoom4.add("Put out clean towels");
        listRoom4.add("Mop floor");

        //Hallway
        listRoom5.add("Shoes on shoe-rack");
        listRoom5.add("Clothes on hanger/in wardrobe.");
        listRoom5.add("Trash in bin");
        listRoom5.add("Clean of counters.");
        listRoom5.add("Vacuum.");
        listRoom5.add("Mop floor");


        //Custom room
        listRoom6.add("Clean surfaces from thrash and objects.");
        listRoom6.add("Dust furniture");
        listRoom6.add("Vacuum");
        listRoom6.add("Mop");


    }


    public String getRoom1() {
        return room1;
    }

    public void setRoom1(String room1) {
        this.room1 = room1;
    }

    public String getRoom2() {
        return room2;
    }

    public void setRoom2(String room2) {
        this.room2 = room2;
    }

    public String getRoom3() {
        return room3;
    }

    public void setRoom3(String room3) {
        this.room3 = room3;
    }

    public String getRoom4() {
        return room4;
    }

    public void setRoom4(String room4) {
        this.room4 = room4;
    }

    public String getRoom5() {
        return room5;
    }

    public void setRoom5(String room5) {
        this.room5 = room5;
    }

    public String getRoom6() {
        return room6;
    }

    public void setRoom6(String room6) {
        this.room6 = room6;
    }

    public ArrayList<String> getListRoom1() {
        return listRoom1;
    }

    public void setListRoom1(ArrayList<String> listRoom) {
        this.listRoom1 = listRoom;
    }

    public ArrayList<String> getListRoom2() {
        return listRoom2;
    }

    public void setListRoom2(ArrayList<String> listRoom) {
        this.listRoom2 = listRoom;
    }

    public ArrayList<String> getListRoom3() {
        return listRoom3;
    }

    public void setListRoom3(ArrayList<String> listRoom) {
        this.listRoom3 = listRoom;
    }

    public ArrayList<String> getListRoom4() {
        return listRoom4;
    }

    public void setListRoom4(ArrayList<String> listRoom) {
        this.listRoom4 = listRoom;
    }

    public ArrayList<String> getListRoom5() {
        return listRoom5;
    }

    public void setListRoom5(ArrayList<String> listRoom) {
        this.listRoom5 = listRoom;
    }

    public ArrayList<String> getListRoom6() {
        return listRoom6;
    }

    public void setListRoom6(ArrayList<String> listRoom) {
        this.listRoom6 = listRoom;
    }

}
