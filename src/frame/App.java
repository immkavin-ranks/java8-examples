package frame;

import java.applet.Applet;
import java.awt.*;

public class App extends Applet {
    Frame f;
    public void init() {
        f = new NewFrame();
        f.setSize(300, 300);
        f.setVisible(true);
    }

    public void paint(Graphics g) {
        g.drawString("Applet", 100, 100);
        showStatus(
            "Frame: " + f.getWidth() + "x" + f.getHeight()
        );
    }
}

class NewFrame extends Frame {
    public void paint(Graphics g) {
        g.drawString("Frame", 100, 100);
    }
}
