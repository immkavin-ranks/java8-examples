package IndianFlagApplet;

import java.applet.Applet;
import java.awt.*;

public class IndianFlagApplet extends Applet {
    public void paint(Graphics g) {
        int width = 600;
        int height = 400;
        setSize(width, height);

        g.setColor(new Color(255, 153, 51)); // Saffron color
        g.fillRect(0, 0, width, height/3);

        g.setColor(Color.white);
        g.fillRect(0, height/3, width, height/3);

        g.setColor(new Color(19, 136, 8)); // Green color
        g.fillRect(0, 2*height/3, width, height/3);

        g.setColor(new Color(0, 0, 128)); // Navy Blue color
        int centerX = width / 2;
        int centerY = height / 2;
        int radius = width / 10;
        g.drawOval(centerX - radius, centerY - radius, 2 * radius, 2 * radius);

        for (int i = 0; i < 24; i++) {
            double angle = i * 15 * Math.PI / 180;
            int x1 = (int) (centerX + radius * Math.cos(angle));
            int y1 = (int) (centerY + radius * Math.sin(angle));
            g.drawLine(x1, y1, centerX, centerY);
        }
    }
}
