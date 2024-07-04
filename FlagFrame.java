package a04;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * A JFrame to hold and display a flag.
 *
 * @author Mainuddin Alam Irteja (A00446752)
 */
public class FlagFrame extends JFrame {
    
    /**
     * Create the frame for the flag.
     *
     * @param theFlag the flag to display
     */
    public FlagFrame(JPanel theFlag) {
        super(theFlag.getName());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(theFlag);
        pack();
    }
    
}
