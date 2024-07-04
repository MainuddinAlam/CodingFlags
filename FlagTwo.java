package a04;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 * A program to draw and show my creative flag in a FlagFrame.
 *
 * @author Mainuddin Alam Irteja (A00446752)
 */
public class FlagTwo extends JPanel {

    // flag drawing constants
    private static final int WIDTH = 900;
    private static final int HEIGHT = WIDTH * 3 / 5;
    private static final int ARC_REQ1 = -250;
    private static final int ARC_REQ2 = 690;

    /**
     * Create a JPanel of the correct size for a German flag.
     */
    public FlagTwo() {
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setName("My Flag");
    }

    /**
     * Paint the flag.
     *
     * @param g the paintbrush for this JPanel
     */
    @Override
    public void paintComponent(Graphics g) {

        // creating variables
        int oneThird = HEIGHT / 3;
        int twoThird = 2 * HEIGHT / 3;
        int quarterWid = WIDTH / 3;
        int[] xCoordinate = {quarterWid, WIDTH / 2, 2 * quarterWid};
        int[] yCoordinate = {twoThird, oneThird, twoThird};
        Color yellow = new Color(255, 238, 0);
        Color red = new Color(219, 0, 44);

        // fill the color of the rectangle 
        g.setColor(yellow);
        g.fillRect(0, 0, WIDTH, HEIGHT);
        g.setColor(red);
        g.fillRect(0, 0, WIDTH, oneThird);
        g.setColor(red);
        g.fillRect(0, HEIGHT - oneThird, WIDTH, oneThird);

        // fill the color of the arcs
        g.setColor(Color.ORANGE);
        g.fillArc(ARC_REQ1, 0, WIDTH / 2, HEIGHT, -90, 180);
        g.fillArc(ARC_REQ2, 0, WIDTH / 2, HEIGHT, 90, 180);

        // fill the color of the triangle
        g.setColor(Color.BLACK);
        g.fillPolygon(xCoordinate, yCoordinate, xCoordinate.length);
    }

    /**
     * Create and show the FlagFrame with this flag in it.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FlagFrame flag2 = new FlagFrame(new FlagTwo());
        flag2.setVisible(true);

    }

}
