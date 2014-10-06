import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.Color;


/**
 * Class that creates instances of the classes that comprise the cityscape and delegates drawing the
 *  cityscape to these object.
 * 
 * @author @gcschmit
 * @version 18 July 2014
 */
public class CityscapeComponent extends JComponent
{
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
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        Building building1=new Building(10,10);
        Building building2=new Building(110,10);
        building1.draw(g2);
        building2.draw(g2);
        Ground ground=new Ground();
        ground.draw(g2);
        Sun sun=new Sun();
        sun.draw(g2);
        g2.setBackground(Color.GREEN);// create instances of classes and invoke the draw method on each
        // ...
        
        
    }

}
