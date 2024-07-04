package a04;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 * A program to draw and show the South African flag in a FlagFrame.
 *
 * @author Mainuddin Alam Irteja (A00446752)
 */
public class FlagThree extends JPanel {

    // flag drawing constants
    private static final int HEIGHT = 600;
    private static final int WIDTH = HEIGHT * 3 / 2;
    private static final double[] WID_PROPORTIONS1 = {12, 8, 100 / 3, 140 / 3};
    private static final int[] WID_PROPORTIONS2 = {30, 8, 14, 48};
    private static final double[] HEI_PROPORTIONS1
            = {100 / 3, 20 / 3, 20, 20 / 3,
                100 / 3};
    private static final int[] HEI_PROPORTIONS2 = {12, 8, 60, 12, 8};
    private static final int PERCENT = 100;

    /**
     * Create a JPanel of the correct size for a South African flag.
     */
    public FlagThree() {
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setName("South Africa");
    }

    /**
     * Paint the flag.
     *
     * @param g the paintbrush for this JPanel
     */
    @Override
    public void paintComponent(Graphics g) {

        // creating variables and color objects
        double flagHeight1, flagHeight2, flagHeight3, flagHeight4,
                flagHeight5, flagHeight6, flagHeight7, flagHeight8,
                flagHeight9, flagWidth1, flagWidth2,
                flagWidth3, flagWidth4, flagWidth5;
        Color green = new Color(0, 122, 77);
        Color gold = new Color(255, 182, 18);
        Color red = new Color(222, 56, 49);
        Color blue = new Color(0, 35, 149);

        // trapezium part of South Africa
        flagWidth1 = ((WIDTH * (WID_PROPORTIONS1[0] + WID_PROPORTIONS1[1])
                / PERCENT));
        flagWidth2 = ((WIDTH * (WID_PROPORTIONS1[0] + WID_PROPORTIONS1[1]
                + WID_PROPORTIONS1[2]) / PERCENT));
        flagWidth3 = ((WIDTH * WID_PROPORTIONS1[0]) / PERCENT);
        flagHeight1 = ((HEIGHT * HEI_PROPORTIONS1[0]) / PERCENT);
        flagHeight2 = ((HEIGHT * (PERCENT - HEI_PROPORTIONS1[4])) / PERCENT);
        flagHeight3 = ((HEIGHT * (HEI_PROPORTIONS1[0] + HEI_PROPORTIONS1[1]))
                / PERCENT);
        flagHeight4 = ((HEIGHT * (PERCENT - HEI_PROPORTIONS1[3]
                - HEI_PROPORTIONS1[4])) / PERCENT);
        int[] trapeziumWid1 = {(int) flagWidth1, (int) flagWidth2,
            WIDTH, WIDTH};
        int[] trapeziumWid2 = {(int) flagWidth3, (int) flagWidth2, WIDTH,
            WIDTH};
        int[] trapeziumH1 = {0, (int) flagHeight1, (int) flagHeight1, 0};
        int[] trapeziumH2 = {HEIGHT, (int) flagHeight2, (int) flagHeight2,
            HEIGHT};
        int[] trapeziumH3 = {0, (int) flagHeight3, (int) flagHeight3, 0};
        int[] trapeziumH4 = {HEIGHT, (int) flagHeight4, (int) flagHeight4,
            HEIGHT};

        // triangle part of South Africa
        flagWidth4 = ((WIDTH * WID_PROPORTIONS2[0]) / PERCENT);
        flagWidth5 = ((WIDTH * (WID_PROPORTIONS2[0] + WID_PROPORTIONS2[1]))
                / PERCENT);

        flagHeight5 = ((HEIGHT * HEI_PROPORTIONS2[0]) / PERCENT);
        flagHeight6 = ((HEIGHT * (HEI_PROPORTIONS2[0] + HEI_PROPORTIONS2[1]))
                / PERCENT);
        flagHeight7 = ((HEIGHT * (PERCENT - HEI_PROPORTIONS2[4])) / PERCENT);
        flagHeight8 = ((HEIGHT * (PERCENT - HEI_PROPORTIONS2[3]
                - HEI_PROPORTIONS2[4])) / PERCENT);
        flagHeight9 = (HEIGHT / 2);
        int[] triangle1Wid = {0, (int) flagWidth5, 0};
        int[] triangle2Wid = {0, (int) flagWidth4, 0};
        int[] triangle1H = {(int) flagHeight5, (int) flagHeight9,
            (int) flagHeight7};
        int[] triangle2H = {(int) flagHeight6, (int) flagHeight9,
            (int) flagHeight8};

        // fill the colours
        g.setColor(green);
        g.fillRect(0, 0, WIDTH, HEIGHT);
        g.setColor(Color.WHITE);
        g.fillPolygon(trapeziumWid2, trapeziumH3, trapeziumWid2.length);
        g.fillPolygon(trapeziumWid2, trapeziumH4, trapeziumWid2.length);
        g.setColor(red);
        g.fillPolygon(trapeziumWid1, trapeziumH1, trapeziumWid1.length);
        g.setColor(blue);
        g.fillPolygon(trapeziumWid1, trapeziumH2, trapeziumWid1.length);
        g.setColor(gold);
        g.fillPolygon(triangle1Wid, triangle1H, triangle1Wid.length);
        g.setColor(Color.BLACK);
        g.fillPolygon(triangle2Wid, triangle2H, triangle2Wid.length);
    }

    /**
     * Create and show the FlagFrame with this flag in it.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FlagFrame flag3 = new FlagFrame(new FlagThree());
        flag3.setVisible(true);
    }

}
