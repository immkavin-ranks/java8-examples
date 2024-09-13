package hello;

import java.applet.Applet;
import java.awt.*;

public class Hello extends Applet {
    String msg = "";
    public void init() {
        msg = "hello";
    }
    public void start() {
        System.out.println("test");
    }
    public void paint(Graphics g) {
        g.drawString(msg + " , world", 100, 100);
    }
}
