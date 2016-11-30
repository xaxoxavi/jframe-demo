import javax.swing.*;
import java.lang.reflect.InvocationTargetException;

/**
 * @author Xavi Torrens
 */
public class Main {

    public static void main(String[] args) {

        final Panel panel = new Panel();

        Runnable guiThread = (new Runnable() {
            public void run() {
                JFrame frame;

                //Create and set up the window.
                frame = new JFrame("FrameDemo");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                frame.setBounds(100, 100, 800, 600);
                frame.getContentPane().add(panel);

                //Display the window.
                frame.setVisible(true);
            }
        });


        try {
            SwingUtilities.invokeAndWait(guiThread);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }






        panel.setFigura(new Circulo());
        panel.setVisible(true);
        panel.repaint();

        System.out.print("Repaint");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        panel.setFigura(null);
        panel.setVisible(false);
        panel.repaint();

        //leer de scanner
        Figura figura = new Rectangulo();

        panel.setFigura(figura);
        panel.setVisible(true);
        panel.repaint();
    }
}
