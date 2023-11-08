public class App{
    public static void main(String[] args) {

        Circle circle = new Circle("Green", 3);
        Rectangle rectangle = new Rectangle("Yellow", 5, 7);

        System.out.println("The circles color is " + circle.color + " " + "and the radius is " + circle.getArea());
        System.out.println("The rectangles color is " + rectangle.color+ " " + "and its perimeter is " + " " + rectangle.getArea());

        

        
    }
}