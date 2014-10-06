import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;

public class Sun
{
    public Sun()
    {}
    public void draw(Graphics2D g2)
    {Ellipse2D.Double sun=new Ellipse2D.Double(500,50,60,60);
     g2.setColor(Color.YELLOW);
     g2.draw(sun);
     g2.fill(sun);
    }}