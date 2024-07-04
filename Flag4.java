package a04;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 * A program to draw and show the German flag in a FlagFrame.
 *
 * @author Mark Young (A00000000)
 */
public class Flag4 extends JPanel {
    // flag drawing constants
    private static final int WIDTH = 900;
    private static final int HEIGHT = WIDTH * 3 / 5;

    /**
     * Create a JPanel of the correct size for a German flag.
     */
    public Flag4() {
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setName("Germany");
    }

    /**
     * Paint the flag.
     * 
     * @param g the paintbrush for this JPanel
     */
    @Override
    public void paintComponent(Graphics g) {
        int oneThird = HEIGHT / 3;
        Color gold = new Color(255, 204, 0);

        // fill with red
        g.setColor(Color.RED);
        g.fillRect(0, 0, WIDTH, HEIGHT);

        // draw top third
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, WIDTH, oneThird);

        // draw bottom third
        g.setColor(gold);
        g.fillRect(0, HEIGHT - oneThird, WIDTH, oneThird);
    }
    
    /**
     * Create and show the FlagFrame with this flag in it.
     */
    public static void main(String[] args) {
        FlagFrame f = new FlagFrame(new Flag4());
        f.setVisible(true);
    }

}