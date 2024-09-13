package visuals;

import javax.swing.JPanel;
import javax.swing.Timer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Graphics;

public class Animation extends JPanel implements ActionListener {

    private final int DELAY = 10;
    private Timer timer;

    public Animation() {
        timer = new Timer(DELAY, this);
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
    }

    // gets called with ever timer iteration
    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }
}
