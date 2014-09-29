import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
/**
 * Draws Ellipse 
 * 
 * @author (Saayujh Ramanathan) 
 * @version (a version number or a date)
 */
public class TargetComponent extends JComponent
{
    /** description of instance variable x (add comment for each instance variable) */
    private int x;

    /**
     * Default constructor for objects of class TargetComponent
     */
    public void paintComponent(Graphics g)
    {Graphics2D g2=(Graphics2D)g; 
     Target target1=new Target(50,50);
     target1.draw(g2);
       
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
    public int sampleMethod(int y)
    {
        // put your code here
        return x+y;
    }

}
