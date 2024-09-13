package physics;

public class Vector {
    private int x;
    private int y;

    public Vector(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void scale(double scalar) {
        this.x = (int) (this.x * scalar);
    }

    public void add(Vector other) {
        this.x += other.x;
        this.y += other.y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Vector [x=" + x + ", y=" + y + "]";
    }

}