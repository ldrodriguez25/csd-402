/**
 * Luis Rodriguez
 * CSD-402
 * Module 7
 *
 * This class represents a fan with different speed settings,
 * an on/off status, a radius, and a color.
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
        this.speed = STOPPED;
        this.on = false;
        this.radius = 6;
        this.color = "white";
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
        return this.speed;
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
        return this.on;
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
        return this.radius;
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
        return this.color;
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
        return "Fan speed: " + this.speed
                + ", on: " + this.on
                + ", radius: " + this.radius
                + ", color: " + this.color;
    }
}
