import java.applet.Applet;
import java.awt.Graphics;
/*
<applet code="ShapeApplet" width=400 height=300>
</applet>
*/
public class ShapeApplet extends Applet {
public void paint(Graphics g) {
g.drawLine(20, 30, 180, 30);
g.drawRect(50, 60, 100, 50);
g.drawOval(200, 60, 80, 80);
}
}
