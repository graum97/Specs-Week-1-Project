public class Mars {
    public static void main(String[] args) throws InterruptedException {
        // Mars Adventure Game Part 1
        //Create a string variable named ColonyName, and set it equal to your desired name
        String ColonyName = "Maras";
        //Create an int variable named ShipPopulation, and set it equal to 300
        int ShipPopulation = 300;
        //Create a double variable named ShipFood, and set it equal to 4000.00
        double ShipFood = 4000.00;
        //Create a boolean variable named Landing, and set it equal to true
        boolean Landing = true;
        //Calculate how much food is left after the landing process
        //The landing process takes two days
        //Equation: food = food - (population * .75)
        ShipFood = ShipFood - (ShipPopulation * 0.75);
        ShipFood = ShipFood - (ShipPopulation * 0.75);
        //Print the Amount of food that is left after landing
        System.out.println(ShipFood);
        //An extra crate of food is found increasing ShipFood by 50%
        ShipFood = ShipFood + (ShipFood * 0.50);
        //Five babies were born, thus increasing the ShipPopulation
        ShipPopulation = ShipPopulation + 5;
        //The ship will land on the hill
        String LandingLocation = "The Hill";
        //Create an if-else statement to test if LandingLocation is equal to "The Plain" (ignoring case)
        if (LandingLocation.equalsIgnoreCase("The Plain")) {
            System.out.println("Bbzzz Landing on the Plain");
        } else {
            System.out.println("ERROR!!! Flight plan already set. Landing on the Plain.");
        }
        //Call a function called LandingCheck that has a parameter of 100, returns boolean, & set it equal to landing
        Landing = LandingCheck(100);

        //Mars Adventure Game Part 2
        //Run the Guessing Game by calling a new guessing game constructor
        new GuessingGame();

        //Mars Adventure Game Part 3
        //Run the Mars Expedition by calling a new Mars expedition constructor
        new MarsExpedition();

        //Mars Adventure Game Part 4
        //Run the Findings Lists by calling a new Findings Lists constructor
        new FindingsLists();
    }


    //Create a public static function called Landing Check that has an int parameter called Loops
    public static boolean LandingCheck(int Loops) throws InterruptedException {
        for (int i = 0; i <= Loops; i++) {
            //Create a for loop that starts at i = 0, loops until it's equal to Loops, and increments by 1 each time
            if (((i % 3) == 0) && ((i % 5) == 0)) {
                //if divisible by 3 and 5, print "Keep center"
                System.out.println("Keep Center");
            } else if ((i % 5) == 0) {
                //if divisible by 5, print "Right"
                System.out.println("Right");
            } else if ((i % 3) == 0) {
                //if divisible by 3, print "Left"
                System.out.println("Left");
            } else {
                //Otherwise, print "Calculating"
                System.out.println("Calculating");
            }

            //Thread.sleep(250) slows the console down by 250 milliseconds
            Thread.sleep(250);
        }
//        if (Thread.interrupted())  // Clears interrupted status!
//            throw new InterruptedException();
        System.out.println("Landed");

        return false;
    }
}