package face;

import java.applet.Applet;
import java.awt.Graphics;

public class Face extends Applet {
    public void paint(Graphics g) {
        g.drawOval(100,100,200,200); // face
        g.drawArc(150,150,100,50,0,-180); // smile
        g.fillOval(170,120,15,15); // left eye
        g.fillOval(230,120,15,15); // right eye
    }
}
