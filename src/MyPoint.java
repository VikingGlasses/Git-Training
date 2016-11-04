
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
        return (x2 - this.x) * (x2 - this.x) + (y2 - this.y) * (y2 - this.y);

    }

    public double distance(MyPoint myPoint) {
        return (myPoint.getX() - this.x) * (myPoint.getX() - this.x)
                + (myPoint.getY() - this.y) * (myPoint.getY() - this.y);
    }
    
    public double distance(){
        return (0 - this.x) * (0 - this.x) + (0 - this.y) * (0 - this.y);
    }

}
