import java.util.Scanner;

public class Game {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter hero name: ");
        String name = input.nextLine();

        System.out.println(name + " was hiking through the ends of the snowy plains. \nThen " + name + " heard a scream coming from a nearby cabin. \nSomeone was calling for help!" + "\nAs " + name +  "plogged in the snow to save the person in need, they suddenly he saw a santa's evil twin. What should he do?");
        
        System.out.println("Choose Action A or B");
        System.out.println("Option A: Save the person ");
        System.out.println("Option B: Run away");
        System.out.println("What is your choice? ");

        String Choice1 = input.nextLine();

        boolean playAgain = true; 

        while (playAgain) {
            int health = 100; 
            System.out.println("Commence Holiday Adeventure!");
            System.out.println(name + "'s health: " + health);

            if (Choice1.equalsIgnoreCase("A")) {
                System.out.println(name + " ploggs into the snowy cabin to save the person in danger!");
                health -= 90;

                System.out.println("A cold wind chills " + name + " after fighting evil santa" + ". \nHealth now: " + health);

                System.out.println("Do you:");
                System.out.println("A: Drink hot cocoa");
                System.out.println("B: Keep going");

                String Choice2 = input.nextLine();

                if (Choice2.equalsIgnoreCase("A")) {
                    health += 100;
                    System.out.println("The cocoa warms " + name + "! \nHealth: " + health);

                } else {
                    health -= 5;
                    System.out.println(name + " pushes on non-stop and gets weaker. \nHealth: " + health);
                }

                System.out.println("After hours of walking through the snowy plains, you suddenley stumble upon what looks like 1000 evil elves ready to fight you and avenge evil santa!");
                System.out.println("A: Fight them all");
                System.out.println("B: Hide inside an abandoned igloo");

                String Choice3 = input.nextLine();

                if (Choice3.equalsIgnoreCase("A")) {
                    health -= 109;
                    System.out.println(name + " defeats the army of elves and gets severely hurt, but it doesn't matter because " + name + " is the GOAT." +  "\nHealth: " + health);
                } else {
                    System.out.println(name + " hides safely until help arrives!");
                    health -= 110;
                    System.out.println("You died a slow and freezing death instead :( \nHealth: " + health);
                }

                } else {
                System.out.println(name + " runs away into the snow.");
                health -= 100;
                System.out.println("Many have died in the snowy plains, and you are now included in that list! \nHealth: " + health);
            }

            if (health > 0) {
                System.out.println(name + " survives the holiday adventure!");
            } else {
                System.out.println(name + " has fallen... the holidays are ruined.");
            }

            System.out.println("\nDo you want to play again? (Y/N)");
            String again = input.nextLine();

            if (again.equalsIgnoreCase("Y")) {
                System.out.println("\nChoose again: A or B");
                Choice1 = input.nextLine();
            } else {
                playAgain = false;
                System.out.println("Thanks for playing, " + name + "! Happy Holidays!");

            }

        }


    }
}





