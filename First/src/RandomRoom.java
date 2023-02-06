import java.util.ArrayList;
import java.util.Scanner;

public class RandomRoom {


    private ArrayList<String> listRoom = new ArrayList<>();
    private ArrayList<String> listActivity = new ArrayList<>();
    private ArrayList<String> listRoomSpecific = new ArrayList<>();


    Scanner scan = new Scanner(System.in);

    Points points = new Points();



    public void menuRandom () {

        boolean exit = true;

        System.out.println("Welcome to Random Cleaning Activity!");
        System.out.println("You will get a random cleaning activity. Please choose: ");

        while (exit) {


            System.out.println("\n1. Random activity.");
            System.out.println("2. Random room-specific activity.");
            System.out.println("3. Random room and activity.");
            System.out.println("4. Add a random object. ");
            System.out.println("5. Help.");
            System.out.println("6. Go back to start.");

            int answer = scan.nextInt();
            scan.nextLine();


            switch (answer) {
                case 1:
                    int min = 0;
                    int max = listActivity.size();

                    int randomInt = (int)Math.floor(Math.random()*(max-min));
                    System.out.println("\nYour activity is: ");
                    System.out.println(listActivity.get(randomInt));
                    System.out.println("(Type anything when you are done and press enter)");
                    scan.next();

                    points.addPoints(5);
                    System.out.println("\n\t 5 points added to you score, keep it up!");

                    break;

                case 2:
                    int min2 = 0;
                    int max2 = listRoomSpecific.size();

                    int randomInt2 = (int)Math.floor(Math.random()*(max2-min2)+min2);
                    System.out.println("\nYour activity is: ");
                    System.out.println(listActivity.get(randomInt2));
                    System.out.println("(Type anything when you are done and press enter)");
                    scan.next();

                    points.addPoints(5);
                    System.out.println("\n\t5 points added to you score, keep it up!");

                    break;

                case 3:
                    int min3 = 0;
                    int max3 = listRoom.size();

                    int min4 = 0;
                    int max4 = listActivity.size();

                    int randomInt3 = (int)Math.floor(Math.random()*(max3-min3)+min3);
                    System.out.println("\nYour room is: ");
                    System.out.println(listRoom.get(randomInt3));

                    int randomInt4 = (int)Math.floor(Math.random()*(max4-min4)+min4);
                    System.out.println("\nYour activity is: ");
                    System.out.println(listActivity.get(randomInt4));
                    System.out.println("(Type anything when you are done and press enter)");
                    scan.next();

                    points.addPoints(5);
                    System.out.println("\n\t5 points added to you score, keep it up!");

                    break;

                case 4:
                    addRandom();
                    break;

                case 5:
                    System.out.println("HELP");
                    break;

                case 6:
                    exit = false;


            }

        }

    }

    public void addRandom () {

        boolean exit = true;

        while (exit) {
            System.out.println("\nWhat do you want to add?");
            System.out.println("1. Add activity.");
            System.out.println("2. Add room-specific activity.");
            System.out.println("3. Add room.");
            System.out.println("4. Go back.");
            int answer = scan.nextInt();
            scan.nextLine();

            switch (answer) {
                case 1:
                    System.out.println("Add: ");
                    listActivity.add(scan.nextLine());
                    System.out.println("List of activities are now:");
                    for (int i = 0; i < listActivity.size(); i++) {
                        System.out.println(listActivity.get(i));
                    }
                    break;
                case 2:
                    System.out.println("Add: ");
                    listRoomSpecific.add(scan.nextLine());
                    System.out.println("List of room specific activities are now:");
                    for (int i = 0; i < listRoomSpecific.size(); i++) {
                        System.out.println(listRoomSpecific.get(i));
                    }
                    break;
                case 3:
                    System.out.println("Add: ");
                    listRoom.add(scan.nextLine());
                    System.out.println("List of rooms are now: ");
                    for (int i = 0; i < listRoom.size(); i++) {
                        System.out.println(listRoom.get(i));
                    }
                    break;
                case 4:
                    exit = false;
            }


        }

    }

    public void initializeRandom() {
        //ROOMS
        listRoom.add("Living room");
        listRoom.add("Kitchen");
        listRoom.add("Bedroom");
        listRoom.add("Bathroom");
        listRoom.add("Hallway");
        listRoom.add("Kids room");

        //ACTIVITY
        listActivity.add("Vacuum");
        listActivity.add("Put dishes in kitchen");
        listActivity.add("Sweep floor");
        listActivity.add("Put dirty clothes in hamper");
        listActivity.add("Put clean clothes in a pile, then in the wardrobe");
        listActivity.add("Dust");

        //ROOM SPECIFIC ACTIVITIES
        listRoomSpecific.add("Make the bed");
        listRoomSpecific.add("Do the dishes");
        listRoomSpecific.add("Clean the toilet");
        listRoomSpecific.add("Clean the shower/tub");
        listRoomSpecific.add("Clean the sink in bathroom");
        listRoomSpecific.add("Clean the sink in the kitchen");
        listRoomSpecific.add("Clean kitchen counter tops");


    }

    public ArrayList<String> getListRoom() {
        return listRoom;
    }

    public void setListRoom(ArrayList<String> listRoom) {
        this.listRoom = listRoom;
    }

    public ArrayList<String> getListActivity() {
        return listActivity;
    }

    public void setListActivity(ArrayList<String> listActivity) {
        this.listActivity = listActivity;
    }

    public ArrayList<String> getListRoomSpecific() {
        return listRoomSpecific;
    }

    public void setListRoomSpecific(ArrayList<String> listRoomSpecific) {
        this.listRoomSpecific = listRoomSpecific;
    }
}
