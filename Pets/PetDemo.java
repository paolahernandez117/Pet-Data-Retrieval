import java.util.Scanner;
public class PetDemo {
    public static void main(String[] args) {
      
        System.out.println(" Welcome to Miami Animal Clinic\n");
        System.out.println("----------------------------------\n");
      
        Pet usersPet = new Pet ("Jane Doe");
        System.out.println("My records on your pet are incomplete.");
        System.out.println("Here is what they currently say:");
        System.out.println(usersPet);

        System.out.println("Let's update the data\n");
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter the pet's name:");
        String name = keyboard.nextLine();
        System.out.println("Please enter the pet's age:");
        int age = keyboard.nextInt();
        System.out.println("Please enter the pet's weight:");
        double weight = keyboard.nextDouble();
        usersPet.set(name,age,weight);
        System.out.println("Records got updated!\n");
        System.out.println("My records now say:");
        System.out.println(usersPet);
    }

}
