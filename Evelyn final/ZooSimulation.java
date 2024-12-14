import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ZooSimulation {
    private static ArrayList<Animal> zooAnimals = new ArrayList<>();
    private static Environment environment = new Environment("Forest");

    public static void main(String[] args) {
        initializeZoo();

        System.out.println("Initial Zoo State:");
        printZooState();

        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\nChoose an action:");
            System.out.println("1. View Zoo");
            System.out.println("2. Trigger Random Event");
            System.out.println("3. Save Zoo State");
            System.out.println("4. Load Zoo State");
            System.out.println("5. Exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    printZooState();
                    break;
                case 2:
                    randomEvent();
                    break;
                case 3:
                    saveZooToFile("zoo_state.txt");
                    break;
                case 4:
                    loadZooFromFile("zoo_state.txt");
                    break;
                case 5:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice, try again.");
            }
        }

        scanner.close();
    }

    private static void initializeZoo() {
        zooAnimals.add(new Lion("Leo", 100, 30));
        zooAnimals.add(new Elephant("Ellie", 120, 10));
        zooAnimals.add(new Monkey("Momo", 60, 0));
        zooAnimals.add(new Zebra("Zara", 80, 25));
    }

    private static void printZooState() {
        for (Animal animal : zooAnimals) {
            System.out.println(animal);
        }
    }

    private static void randomEvent() {
        int event = (int) (Math.random() * 3);
        switch (event) {
            case 0:
                System.out.println("A storm hits the zoo!");
                for (Animal animal : zooAnimals) {
                    animal.takeDamage(20);
                }
                break;
            case 1:
                System.out.println("Visitors feed the animals!");
                for (Animal animal : zooAnimals) {
                    animal.eat();
                }
                break;
            case 2:
                System.out.println("Animals are playing together!");
                break;
        }
    }

    private static void saveZooToFile(String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (Animal animal : zooAnimals) {
                writer.write(animal.toString());
                writer.newLine();
            }
            System.out.println("Zoo state saved to " + filename);
        } catch (IOException e) {
            System.out.println("Error saving zoo state: " + e.getMessage());
        }
    }

    private static void loadZooFromFile(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            zooAnimals.clear();
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            System.out.println("Zoo state loaded from " + filename);
        } catch (IOException e) {
            System.out.println("Error loading zoo state: " + e.getMessage());
        }
    }
}

