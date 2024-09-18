package params;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class ParameterizedApplet extends Applet {
    private String message;
    private Color textColor;

    public void init() {
        // Read parameters
        message = getParameter("message");
        if (message == null) {
            message = "Hello, World!"; // Default message
        }

        String bgColor = getParameter("bgColor");
        Color backgroundColor = (bgColor != null) ? Color.decode(bgColor) : Color.WHITE;

        String txtColor = getParameter("textColor");
        textColor = (txtColor != null) ? Color.decode(txtColor) : Color.BLACK;

        // Set background color
        setBackground(backgroundColor);
    }

    public void paint(Graphics g) {
        // Set text color and draw the message
        g.setColor(textColor);
        g.drawString(message, 50, 25);
    }
}