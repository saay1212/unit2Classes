import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.Color; 
import java.awt.geom.Point2D;
import java.awt.geom.Line2D; 
/**
 * Write a description of class Target here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Target
{
    /** description of instance variable x (add comment for each instance variable) */
    private int xcenter;
    private int ycenter; 

    /**
     * Default constructor for objects of class Target
     */
    public Target(int x,int y)
    {
        xcenter=x;
        ycenter=y;
        
    }

    /**
     * An example of a method - replace this comment with your own
     *    that describes the operation of the method
     *
     * @pre        preconditions for the method
     *            (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    y    description of parameter y
     * @return    description of the return value
     */
    public void draw(Graphics2D g2)
    {
        Ellipse2D.Double circle1= new Ellipse2D.Double(xcenter,ycenter,25,25);
        Ellipse2D.Double circle2= new Ellipse2D.Double(xcenter,ycenter,50,50);
        Ellipse2D.Double circle3= new Ellipse2D.Double(xcenter,ycenter,75,75);
        Ellipse2D.Double circle4= new Ellipse2D.Double(xcenter,ycenter,100,100);
        Ellipse2D.Double circle5= new Ellipse2D.Double(xcenter,ycenter,125,125);
        
        // put your code here
       g2.draw(circle1);
       g2.draw(circle2);
       g2.draw(circle3);
       g2.draw(circle4);
       g2.draw(circle5);
    }

}
