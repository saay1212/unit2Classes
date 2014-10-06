import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;
public class Ground
{
    private int xLeft;
    private int yTop;
    
    public Ground()
    {}
     
    public void draw(Graphics2D g2)
    {
        Rectangle body=new Rectangle(0,410,800,190);
        g2.draw(body);
        g2.setColor(Color.GREEN);
        g2.fill(body);}}