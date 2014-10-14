import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;

public class Background
{
    public Background()
    {}
    public void draw(Graphics2D g2)
    {
        Rectangle back=new Rectangle(0,0,800,600);
        g2.setColor(Color.BLACK);
        g2.draw(back);
        g2.fill(back);}}
    