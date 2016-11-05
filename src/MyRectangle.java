
public class MyRectangle {

    private MyPoint topLeft;
    private MyPoint bottomRight;

    public MyRectangle(MyPoint p1, MyPoint p2) {
        this.topLeft = p1;
        this.bottomRight = p2;
    }

    public MyRectangle(int x1, int y1, int x2, int y2) {
        this.topLeft = new MyPoint(x1, y1);
        this.bottomRight = new MyPoint(x2, y2);
    }

    public String toString() {
        return "Top-left corner: " + this.topLeft + "\nBottom-right corner: " + this.bottomRight;
    }

    public double getPerimiter() {
        double s1 = 2 * topLeft.distance(topLeft.getX(),bottomRight.getY());
        double s2 = 2 * bottomRight.distance(bottomRight.getY(), topLeft.getY());
        return (s1+s2);
                
    }

}
