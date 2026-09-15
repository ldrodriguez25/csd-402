/**
 * Luis Rodriguez
 * CSD-402
 * Module 6
 *
 * This program defines a Fan class with different speed settings,
 * an on/off status, a radius, and a color. The program also tests
 * the Fan class using a default constructor and an argument constructor.
 */
public class Fan {

    // Constants for the different fan speeds.
    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    // Fan fields.
    private int speed;
    private Boolean on;
    private double radius;
    private String color;

    /**
     * No-argument constructor.
     * Sets all fields to their default values.
     */
    public Fan() {
        speed = STOPPED;
        on = false;
        radius = 6;
        color = "white";
    }

    /**
     * Constructor that sets all Fan fields.
     *
     * @param speed the speed of the fan
     * @param on whether the fan is on or off
     * @param radius the radius of the fan
     * @param color the color of the fan
     */
    public Fan(int speed, Boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    /**
     * Gets the fan speed.
     *
     * @return the current fan speed
     */
    public int getSpeed() {
        return speed;
    }

    /**
     * Sets the fan speed.
     *
     * @param speed the new fan speed
     */
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    /**
     * Gets the on/off status of the fan.
     *
     * @return true if the fan is on, false if it is off
     */
    public Boolean getOn() {
        return on;
    }

    /**
     * Sets the on/off status of the fan.
     *
     * @param on the new on/off status
     */
    public void setOn(Boolean on) {
        this.on = on;
    }

    /**
     * Gets the fan radius.
     *
     * @return the radius of the fan
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Sets the fan radius.
     *
     * @param radius the new radius
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * Gets the fan color.
     *
     * @return the color of the fan
     */
    public String getColor() {
        return color;
    }

    /**
     * Sets the fan color.
     *
     * @param color the new fan color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Returns a description of the fan's current state.
     *
     * @return a String describing the fan
     */
    @Override
    public String toString() {
        return "Fan speed: " + speed
                + ", on: " + on
                + ", radius: " + radius
                + ", color: " + color;
    }

    /**
     * Tests the functionality of the Fan class.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {

        // Create a fan using the default constructor.
        Fan fan1 = new Fan();

        // Create a fan using the argument constructor.
        Fan fan2 = new Fan(FAST, true, 10, "blue");

        // Display the default fan.
        System.out.println("Fan 1 - Default Constructor:");
        System.out.println(fan1);

        // Display the fan created with the argument constructor.
        System.out.println("\nFan 2 - Argument Constructor:");
        System.out.println(fan2);

        // Test setter methods on Fan 1.
        fan1.setSpeed(MEDIUM);
        fan1.setOn(true);
        fan1.setRadius(8);
        fan1.setColor("black");

        System.out.println("\nFan 1 After Using Setters:");
        System.out.println(fan1);

        // Test getter methods.
        System.out.println("\nFan 1 Getter Values:");
        System.out.println("Speed: " + fan1.getSpeed());
        System.out.println("On: " + fan1.getOn());
        System.out.println("Radius: " + fan1.getRadius());
        System.out.println("Color: " + fan1.getColor());
    }
}
