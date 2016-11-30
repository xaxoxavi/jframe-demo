import java.awt.*;

/**
 * @author Xavi Torrens
 */
public class Rectangulo implements Figura {

    private int x = 100;
    private int y = 100;
    private int ancho = 100;
    private int alto = 75;



    public void pintar(Graphics graphics) {

        graphics.drawRect(x,y,ancho,alto);

    }
}
