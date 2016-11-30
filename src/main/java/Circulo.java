import java.awt.*;

/**
 * @author Xavi Torrens
 */
public class Circulo implements Figura {

    private int x = 50;
    private int y = 50;
    private int radius = 50;

    public void pintar(Graphics graphics) {

        graphics.drawOval(x,y,radius*2,radius*2);

    }
}
