package addition;

import java.applet.Applet;
import java.awt.*;

public class Addition extends Applet {
    int v1, v2, c;
    String sum;

    public void init() {
        v1 = Integer.parseInt(getParameter("v1"));
        v2 = Integer.parseInt(getParameter("v2"));
        c = v1 + v2;
        sum = "Result = " + c;
    }

    public void paint(Graphics g) {
        g.drawString(sum, 50, 50);
    }
}
