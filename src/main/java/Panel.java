import javax.swing.*;
import java.awt.*;


public class Panel extends JPanel {

    private Figura figura;

    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     */
    public void paint(Graphics g) {
        if (figura != null)
            figura.pintar(g);
    }


    public void setFigura(Figura figura) {
        this.figura = figura;
    }
}