package visuals;

import javax.swing.JPanel;
import javax.swing.Timer;

import physics.Planet;
import physics.Vector;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Graphics;

public class Animation extends JPanel implements ActionListener {

    Planet[] planets;
    private final int DELAY = 10;
    private Timer timer;

    public Animation() {
        planets = new Planet[] { new Planet(new Vector(50, 50), 50) };
        timer = new Timer(DELAY, this);
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // paint planets
        for (Planet planet : this.planets) {
            this.paintPlanet(g, planet);
        }
    }

    private void paintPlanet(Graphics g, Planet p) {
        g.setColor(p.getColor());
        g.fillOval(p.getPosition().getX(), p.getPosition().getY(), p.getDiameter(), p.getDiameter());
    }

    // gets called with ever timer iteration
    @Override
    public void actionPerformed(ActionEvent e) {
        this.planets[0].getPosition().add(new Vector(1, 0));
        repaint();
    }
}
