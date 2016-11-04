
public class MyPoint {

    private int x;
    private int y;

    public MyPoint() {
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int[] getXY() {
        int[] out = new int[2];
        out[0] = this.x;
        out[1] = this.y;
        return out;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "X: " + this.x + "Y: " + this.y;
    }

    public double distance(int x2, int y2) {
        double diffx = this.x - x2;
        double diffy = this.y - y2;
        return (Math.sqrt(diffx*diffx + diffy*diffy));

    }

    public double distance(MyPoint myPoint) {
        double diffx = this.x - myPoint.getX();
        double diffy = this.y - myPoint.getY();

        return (Math.sqrt(diffx*diffx + diffy*diffy));
    }

    public double distance() {
        double diffx = this.x - 0;
        double diffy = this.y - 0;
        return (Math.sqrt(diffx*diffx + diffy*diffy));
    }

}
