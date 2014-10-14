import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;

public class Building
{
    private int xLeft;
    private int yTop;
    
    public Building(int x, int y)
    {xLeft=x;
     yTop=y;}
     
    public void draw(Graphics2D g2)
    {
        Rectangle body=new Rectangle(xLeft,yTop,100,400);
        Rectangle window1=new Rectangle(xLeft+20,yTop+20,50,50);
        Rectangle window2=new Rectangle(xLeft+20,yTop+30,50,50);
        Rectangle window3=new Rectangle(xLeft+20,yTop+100,50,50);
        Rectangle window4=new Rectangle(xLeft+20,yTop+110,50,50);
        Rectangle window5=new Rectangle(xLeft+20,yTop+180,50,50);
        Rectangle window6=new Rectangle(xLeft+20,yTop+190,50,50);
        Rectangle window7=new Rectangle(xLeft+20,yTop+260,50,50);
        Rectangle window8=new Rectangle(xLeft+20,yTop+270,50,50);
        Rectangle door=new Rectangle(xLeft+25,350,40,60);
        Color beast=new Color(255,130,20);
        Color beast1=new Color(82,255,246);
        g2.setColor(beast1);
        g2.draw(body);
        g2.fill(body);
        g2.setColor(Color.BLUE);
        g2.draw(window1);
        g2.fill(window1);
        g2.draw(window3);
        g2.fill(window3);
        g2.draw(window5);
        g2.fill(window5);
        g2.draw(window7);
        g2.fill(window7);
        g2.setColor(Color.RED);
        g2.draw(window2);
        g2.fill(window2);
        g2.draw(window4);
        g2.fill(window4);
        g2.draw(window6);
        g2.fill(window6);
        g2.draw(window8);
        g2.fill(window8);
        g2.setColor(beast);
        g2.draw(door);
        g2.fill(door);
        ;}}
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
