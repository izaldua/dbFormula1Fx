package test;

import business_logic.BlFacade;
import business_logic.BlFacadeImpl;

public class Main {
    public static void main(String[] args) {
        BlFacade bl = new BlFacadeImpl();
        bl.getPilotsByNationality("Spanish").forEach(System.out::println);
//        dataManager.storePilot("Lewis Hamilton", "British", 380);
//        dataManager.storePilot("Valtteri Bottas", "Finnish", 280);
//        dataManager.storePilot("Max Verstappen", "Dutch", 250);
//        dataManager.storePilot("Charles Leclerc", "Monegasque", 200);
//        dataManager.storePilot("Lando Norris", "British", 100);
//       dataManager.storePilot("Carlos Sainz", "Spanish", 100);
//        dataManager.storePilot("Pierre Gasly", "French", 50);
//        dataManager.storePilot("Fernando Alonso", "Spanish", 400);
//        dataManager.storePilot("Sebastian Vettel", "German", 300);
//        dataManager.storePilot("Daniel Ricciardo", "Australian", 200);
//        dataManager.storePilot("Esteban Ocon", "French", 100);
//        dataManager.storePilot("Sergio Perez", "Mexican", 100);
//        dataManager.storePilot("Lance Stroll", "Canadian", 50);
//        dataManager.storePilot("Kimi Raikkonen", "Finnish", 400);
//        dataManager.storePilot("Antonio Giovinazzi", "Italian", 50);

        /*
        //Print all the pilots in the db using function getAllPilots() jumping line after each pilot
        for (Pilot pilot : dataManager.getAllPilots()) {
            System.out.println(pilot);
        }

        System.out.println("");
        System.out.println("");

        //Print all french pilots in the db using function getPilotsByNationality() jumping line after each pilot
        for (Pilot pilot : dataManager.getPilotsByNationality("French")) {
            System.out.println(pilot);
        }

        System.out.println("");
        System.out.println("");

        //Print all the pilots in the db with more than 200 points using function getPilotsByPoints() jumping line after each pilot
        for(Pilot pilot : dataManager.getPilotsByPoints(200)) {
        	System.out.println(pilot);
        }

        System.out.println("");
        System.out.println("");

        //Ask the user for a pilot name and delete it from the db using function deletePilotByName()
        Scanner console = new Scanner(System.in);
        System.out.print("Enter the pilot name you want to delete: ");
        String input = console.nextLine();
        dataManager.deletePilotByName(input);

        System.out.println("");
        System.out.println("");

        System.out.println("What pilot do you want to update: ");
        String pilotName = console.nextLine();
        System.out.println("How many points to add: ");
        int points = console.nextInt();
        dataManager.addPointsToPilot(points, pilotName);

        System.out.println("");
        System.out.println("");

        for(Pilot pilot : dataManager.getPilotsByPoints(200)) {
            System.out.println(pilot);
        }

        System.out.println("");
        System.out.println("");

        // Hacer que funcione el pilotGetByName

        */
    }
}