package physics;

import java.awt.Color;

public class Planet {
    private Vector position;
    private int diameter;
    private int weight;
    private Color color;

    public Planet(Vector position, int diameter) {
        this.position = position;
        this.diameter = diameter;
    }

    /////////////////////////
    // GETTERS AND SETTERS //
    /////////////////////////

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Vector getPosition() {
        return position;
    }

    public void setPosition(Vector position) {
        this.position = position;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

}
