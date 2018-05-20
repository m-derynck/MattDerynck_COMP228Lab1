package exercise3;

import javafx.geometry.Point2D;

public class GameObject {

    //Properties
    private Point2D center;
    private double velocity;
    private double rotation;
    //Can be enum if more states are required.
    private boolean objectState;

    //Property Getters
    public Point2D getCenter() {
        return center;
    }

    public double getRotation() {
        return rotation;
    }

    public boolean getObjectState() {
        return objectState;
    }

    public double getVelocity() {
        return velocity;
    }

    //Default constructor
    public GameObject(){}
    //Main constructor
    public GameObject(Point2D center, double velocity, double rotation, boolean objectState) {
        this.center = center;
        this.velocity = velocity;
        this.rotation = rotation;
        this.objectState = objectState;
    }

    //Returns the game object information in a fancy string.
    public String getGameObject() {
        String state = (getObjectState() ? "Alive" : "Dead");
        return String.format("GameObject%nState: %s%nCenter: %s%nVelocity: %.2f%nRotation: %.2f", state, getCenter(), getVelocity(), getRotation());
    }
}
