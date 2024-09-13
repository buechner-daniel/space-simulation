package visuals;

import javax.swing.JFrame;

public class Window extends JFrame {
    public static final int WIDTH = 500;
    public static final int HEIGHT = 500;

    private Animation animation;

    public Window() {
        super();

        this.animation = new Animation();

        // SETUP
        this.setVisible(true);
        this.setTitle("Space Simulation");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(this.animation);
        this.setSize(WIDTH, HEIGHT);
    }

    public static void main(String[] args) {
        new Window();
    }

}
