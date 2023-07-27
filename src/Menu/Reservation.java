package Menu;
import Resources.*;
 import java.util.*;
public class Reservation {
    private static Scanner scan;
    private String arrivalDate;
    private String departureDate;
    private float customizePrice;
    private boolean Rstatus;

    public Reservation(){
        scan = new Scanner(System.in);
    }

    public static void Initialize(){
        System.out.println("Welcome to the Hotel Menu");

        while(true){
            System.out.println("\nPlease enter a selction from below: ");
            System.out.println("1. Feature 1");
            System.out.println("2. Feature 2");
            System.out.println("3. Exit");

            int choice = getInput();
            switch (choice){
                case 1:
                    FeatureClass.feature1();
                    break;
                case 2:
                    FeatureClass.feature2();
                    break;
                case 3:
                    System.out.println("Exiting the Program");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");

            }
        }
    }

    private static int getInput() {
        while(!scan.hasNextInt()){
            System.out.println("Invalid input. Please enter a number");
            scan.nextInt();
        }
        return scan.nextInt();
    }

    public void newReservation(){}

    public void modifyReservation(){}

    public void destroyReservation(){}

}
