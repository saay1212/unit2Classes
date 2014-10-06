import java.util.Scanner;
public class Rectangle
{public static void main(String[] args)
    {Scanner scan=new Scanner(System.in);
    double width,height;
    System.out.println("Enter a width for the rectangle");
    width=scan.nextDouble();
    System.out.println("Enter a height for the rectangle");
    height=scan.nextDouble();
    double perimeter=width+width+height+height;
    double area=width*height;
    double diagonal=Math.sqrt(Math.pow(height,2)+Math.pow(width,2));
    System.out.println("The perimeter is "+perimeter+"\nThe area is "+area+"\nThe diagonal is "+diagonal);}}
    