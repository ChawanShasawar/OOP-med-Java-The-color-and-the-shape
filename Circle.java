public class Circle extends Shape {
    public double radius;


    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
        
    }

    @Override
    public double getArea(){
        return 3.14 *radius *radius;
    }

  
    
    
}
