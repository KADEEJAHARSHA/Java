import java.awt.*;
import java.applet.*;
public class Appletdemo extends Applet
{
public void init()
{
setBackground(Color.yellow);
setForeground(Color.yellow);
}
public void paint(Graphics g)
{
g.drawString("welcome",100,200);
}
}
/* <applet code=Appletdemo width=400 height=500>
</applet> */
