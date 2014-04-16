
/**
 * Write a description of class PointMover here.
 * 
 * @Sean Roper
 * @15 Apr 2014
 */
import javafx.geometry.Point2D;

public class PointMover
{
    public static void main(String [] args)
    {
        System.out.print("\f");
        Point2D point = new Point2D(0, 0);
        System.out.println(move(point, 1, 2));
        Point2D point2 = new Point2D(1, 2);
        System.out.println(move(point2, 10, 100));
    }

    public static Point2D move(Point2D orig, int x, int y){
        Point2D New = new Point2D(orig.getX()+ x, orig.getY() + y);
        return New;
    }
}
