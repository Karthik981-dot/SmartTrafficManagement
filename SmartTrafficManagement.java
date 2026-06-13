import java.util.Scanner;

public class SmartTrafficManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== Smart Traffic Management System ===");

        System.out.print("Enter vehicle count on Road A: ");
        int roadA = sc.nextInt();

        System.out.print("Enter vehicle count on Road B: ");
        int roadB = sc.nextInt();

        System.out.print("Enter vehicle count on Road C: ");
        int roadC = sc.nextInt();

        System.out.print("Is there an emergency vehicle? (yes/no): ");
        String emergency = sc.next();

        if(emergency.equalsIgnoreCase("yes")) {
            System.out.println("\nEmergency Vehicle Detected!");
            System.out.println("Signal Priority Granted.");
        }
        else {
            if(roadA >= roadB && roadA >= roadC) {
                System.out.println("\nRoad A gets GREEN signal for 60 seconds.");
            }
            else if(roadB >= roadA && roadB >= roadC) {
                System.out.println("\nRoad B gets GREEN signal for 60 seconds.");
            }
            else {
                System.out.println("\nRoad C gets GREEN signal for 60 seconds.");
            }
        }

        System.out.println("\nTraffic Report");
        System.out.println("Road A Vehicles : " + roadA);
        System.out.println("Road B Vehicles : " + roadB);
        System.out.println("Road C Vehicles : " + roadC);

        int total = roadA + roadB + roadC;
        System.out.println("Total Vehicles  : " + total);

        sc.close();
    }
}