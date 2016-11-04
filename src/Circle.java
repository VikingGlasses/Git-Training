
public class Circle {
    private double radius;
    private String colour;
    
    //addding constructors, with default if there is no set value
    public Circle(){
        radius = 1.0;
        colour = "green";
    }
    public Circle(double radius){
        this.radius = radius;
        colour = "green";
    }
    public Circle(String colour, double radius){
        this.colour = colour;
        this.radius = radius;
    }
    
    //setters
    public void setRadius(double radius){
        this.radius =  radius;
    }
    public void setColour(String colour){
        this.colour = colour;
    }
    //getters
    public double getRadius(){
        return radius;
    }
    public String getColour(){
        return colour;
    }
    
    public double getArea(){
        double area = radius*radius* Math.PI;
        return area;
    }
    
    //toStringmetod
    public String toString(){
        String output = "The radius of you circle is: "+ radius
                        + "\n The colour of your circle is: " + colour;
        return output;
    }
    

    
    
}