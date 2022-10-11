import java.util.Scanner;

public class MarsExpedition {
    //Create a public constructor function with the same name
    public MarsExpedition() {
        //Create a new Scanner variable named input, will be used to store the user input
        Scanner input = new Scanner(System.in);
        System.out.println("Expedition prep program starting...");
        System.out.println("Booting up...");
        System.out.println("...");
        System.out.println("...");
        System.out.println("...");
        System.out.println("Ready");
        System.out.println("Hello user. What is your name?");
        //Create a new string variable called name that's equal to input.nextLine()
        String name = input.nextLine();
        System.out.println("Hi, " + name + " --- Welcome to the Expedition prep program.\n" +
                "Are you ready to head out into the new world?\n" +
                "Type Y or N");
        //Create a new string variable called excited which equals input.nextLine()
        String excited = input.nextLine();
        if (excited.equalsIgnoreCase("Y")) {
            System.out.println("I knew you would say that. You are team leader for a reason.");
        } else {
            System.out.println("To bad you are team leader. You have to go.");
        }
        System.out.println("How many people do you want on your expedition team? (Input an int number)");
        //Create a new int variable named teamSize and set it equal to input.nextInt()
        int teamSize = input.nextInt();
        //Use input.nextLine() to correct the location of the scanner after using nextInt()
        input.nextLine();
        //Use an if statement to check if teamSize is greater than 2
        if (teamSize > 2) {
            System.out.println("That's way to many people. We can only send 2 more members");
            //Set teamSize equal to 2
            teamSize = 2;
        } else if (teamSize < 2) {
            System.out.println("That's not enough people. We need you and 2 more members.");
            //Set teamSize equal to 2
            teamSize = 2;
        } else if (teamSize == 2) {
            System.out.println("That's a perfect sized team. Good job.");
        }
        System.out.println("You are allowed to bring one weapon with you. You know, just incase. What do you bring?");
        //Create a String variable called weapon and set it equal to input.nextInt()
        String weapon = input.nextLine();
        System.out.println("Nice choice, you will be bringing a " + weapon + " with you");
        System.out.println("You have the choice of 3 vehicles" +
                "\nA: A Mars Rover" +
                "\nB: A Chevy Silverado" +
                "\nC: A Honda Civic");
        //Create a String variable named vehicleChoice and set it equal to input.nextLine()
        String vehicleChoice = input.nextLine();
        //Use an if statement to check if vehicleChoice is equal to A ignoring case
        if (vehicleChoice.equalsIgnoreCase("A")) {
            //Create a new String variable called vehicle and set it equal to "Mars Roover"
            vehicleChoice = "a Mars Roover";
        } else if (vehicleChoice.equalsIgnoreCase("B")) {
            //Create a new String variable called vehicle and set it equal to "Chevy Silverado"
            vehicleChoice = "a Chevy Silverado";
        } else if (vehicleChoice.equalsIgnoreCase("C")) {
            //Create a new String variable called vehicle and set it equal to "Honda Civic"
            vehicleChoice = "a Honda Civic";
        } else {
            //Create a new String variable called vehicle and set it equal to "your feet"
            vehicleChoice = "your feet";
        }
        System.out.println("Your expedition team is now ready" +
                "\nLed by " + name + " with " + teamSize + " teammates." +
                "\nTo explore the surface of Mars using " + vehicleChoice + "." +
                "\nExploration team heads out in" +
                "\n5...." +
                "\n4...." +
                "\n3...." +
                "\n2...." +
                "\n1...." +
                "\nGO GO GO!");
        }
}
