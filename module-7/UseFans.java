import java.util.ArrayList;
import java.util.Collection;

/**
 * Luis Rodriguez
 * CSD-402
 * Module 7
 *
 * This program creates a collection of Fan objects and demonstrates
 * displaying individual Fan objects and a collection of Fan objects
 * without using the Fan toString() method.
 */
public class UseFans {

    /**
     * Displays information for a collection of Fan objects.
     *
     * @param fans the collection of Fan objects to display
     */
    public static void displayFans(Collection<Fan> fans) {
        System.out.println("Fan Collection:");

        for (Fan fan : fans) {
            displayFan(fan);
            System.out.println();
        }
    }

    /**
     * Displays information for one Fan object without using toString().
     *
     * @param fan the Fan object to display
     */
    public static void displayFan(Fan fan) {
        System.out.println("Speed: " + fan.getSpeed());
        System.out.println("On: " + fan.getOn());
        System.out.println("Radius: " + fan.getRadius());
        System.out.println("Color: " + fan.getColor());
    }

    /**
     * Tests the Fan class and display methods.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {

        // Create a collection of Fan instances.
        Collection<Fan> fans = new ArrayList<>();

        // Create Fan instances.
        Fan fan1 = new Fan();
        Fan fan2 = new Fan(Fan.SLOW, true, 8, "blue");
        Fan fan3 = new Fan(Fan.FAST, true, 10, "black");

        // Add the Fan instances to the collection.
        fans.add(fan1);
        fans.add(fan2);
        fans.add(fan3);

        // Display a single Fan.
        System.out.println("Displaying One Fan:");
        displayFan(fan1);

        System.out.println();

        // Display all Fans in the collection.
        displayFans(fans);
    }
}
