package homework_week9_Nikunja;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 10. Write a programme that tells you which line passes through particular stations.
 * Just use Zone 1 stations name.
 */
public class P10TrainStationZone {

    public void addStationsToTheList() {


        String a[] = new String[10];
        ArrayList<String> zone1 = new ArrayList<>();
        zone1.add("Virar");
        zone1.add("NallaSopara");
        zone1.add("Vasai");
        zone1.add("Bhayander");
        zone1.add("Mira Road");
        zone1.add("Dahisar");
        zone1.add("Borivali");
        zone1.add("Kandivali");
        zone1.add("Malad");
        zone1.add("Andheri");
        zone1.add("Bandra");
        zone1.add("Matunga");
        zone1.add("Mumbai Central");
        zone1.add("Dadar");
        zone1.add("Churchgate");

        Scanner scanner = new Scanner(System.in);

        char program = 'Y';
        while (program == 'Y') {

            System.out.println("Enter any Station name : ");

            String station = new String();
            station = scanner.next();


            if (zone1.contains(station)) {
                System.out.println(station + " is from western Line passing through Zone 1");
            } else {
                System.out.println(station + " is not from western Line");
            }

            System.out.println("Do you want to check any other Station. Press 'Y' or 'N'");
            program = scanner.next().charAt(0);

        }
            scanner.close();
        }


    public static void main(String[] args) {
        P10TrainStationZone object = new P10TrainStationZone();
        object.addStationsToTheList();
    }
}
