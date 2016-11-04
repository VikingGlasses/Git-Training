
public class MyCircle {

    private MyPoint center;
    private int radius = 1;
    

    public MyCircle(int x, int y, int radius) {
        center = new MyPoint(x, y);
        this.radius = radius;        
    }

    public MyCircle(MyPoint center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public MyCircle() {
        center = new MyPoint(0, 0);
        this.radius = 1;
    }

    public int getRadius() {
        return radius;
    }
    

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public MyPoint getCenter() {
        return center;
    }

    public void setCenter(MyPoint center) {
        this.center = center;
    }
    
    public int getCenterX(){
        return this.center.getX();
    }
    
    public void setCenterX(int x){
        this.center.setX(x);
    }
    
    public int getCenterY(){
        return this.center.getY();
        
    }
    
    public void setCenterY(int y){
        this.center.setY(y);
    }
    
    public int[] getCenterXY(){
        int[] out = new int[2];
        out[0] = this.center.getX();
        out[1] = this.center.getY();
        return out;
    }
    
    public void setCenterXY(int x, int y){
        this.center.setXY(x, y);
    }

    public String toString() {
        return "MyCircle " + this.radius + " " + center.toString();
    }
    
    public double getArea(){
        return (radius*radius*Math.PI);
    }
    public double getCircumference(){
        return (radius+radius) * Math.PI;
    }
    public double distance(MyCircle another){
        return this.center.distance(another.center);
        // hej
        
    }
}
