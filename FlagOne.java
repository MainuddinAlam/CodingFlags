package a04;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 * A program to draw and show the Belgian flag in a FlagFrame.
 *
 * @author Mainuddin Alam Irteja (A00446752)
 */
public class FlagOne extends JPanel {

// flag drawing constants
    private static final int WIDTH = 900;
    private static final int HEIGHT = WIDTH * 13 / 15;
    private static final double[] PROPORTIONS = {100 / 3, 100 / 3, 100 / 3};

    /**
     * Create a JPanel of the correct size for a German flag.
     */
    public FlagOne() {
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setName("Belgium");
    }

    /**
     * Paint the flag.
     *
     * @param g the paintbrush for this JPanel
     */
    @Override
    public void paintComponent(Graphics g) {

        // creating and setting variables
        double blackWidth, redWidth, redLeft, flagWidth;
        Color yellow = new Color(253, 218, 36);
        Color red = new Color(239, 51, 64);

        // calculate the edges of the black and red stripes
        flagWidth = PROPORTIONS[0] + PROPORTIONS[1] + PROPORTIONS[2];
        blackWidth = (double) PROPORTIONS[0] / flagWidth;
        redWidth = (double) PROPORTIONS[2] / flagWidth;
        redLeft = 1 - redWidth;

        // fill the center with yellow
        g.setColor(yellow);
        g.fillRect(0, 0, WIDTH, HEIGHT);

        // fill the left part with black
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, (int) (WIDTH * blackWidth), HEIGHT);

        // fill the right part with red
        g.setColor(red);
        g.fillRect((int) (WIDTH * redLeft), 0, (int) (WIDTH * redWidth),
                HEIGHT);
    }

    /**
     * Create and show the FlagFrame with this flag in it.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FlagFrame flag1 = new FlagFrame(new FlagOne());
        flag1.setVisible(true);
        flag1.setSize(WIDTH, HEIGHT);
    }

}
