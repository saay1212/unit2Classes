import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;

public class Building2
{
    private int xLeft;
    private int yTop;
    
    public Building2(int x, int y)
    {xLeft=x;
     yTop=y;}
     
    public void draw(Graphics2D g2)
    {
        Rectangle body=new Rectangle(xLeft,yTop,300,100);
        Color beast1=new Color(82,25,26);
        Rectangle window=new Rectangle(xLeft+20,yTop+10,30,30);
        Rectangle window1=new Rectangle(xLeft+60,yTop+10,30,30);
        Rectangle window2=new Rectangle(xLeft+100,yTop+10,30,30);
        Rectangle window3=new Rectangle(xLeft+140,yTop+10,30,30);
        Rectangle window4=new Rectangle(xLeft+180,yTop+10,30,30);
        Rectangle window5=new Rectangle(xLeft+220,yTop+10,30,30);
        Rectangle window6=new Rectangle(xLeft+260,yTop+10,30,30);
        Rectangle door=new Rectangle(xLeft+75,yTop+50,150,50);
        Color beast2=new Color(167,55,96);
        g2.setColor(beast1);
        g2.draw(body);
        g2.fill(body);
        g2.setColor(beast2);
        g2.draw(window);
        g2.fill(window);
        g2.draw(window1);
        g2.fill(window1);
        g2.draw(window2);
        g2.fill(window2);
        g2.draw(window3);
        g2.fill(window3);
        g2.draw(window4);
        g2.fill(window4);
        g2.draw(window5);
        g2.fill(window5);
        g2.draw(window6);
        g2.fill(window6);
        g2.draw(door);
        g2.fill(door);
    }}
        