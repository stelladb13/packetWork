package Circle;
public class CircleTest {
    public static void main(String []args){
        Circle circletest = new Circle(3);
        System.out.println("Circumference: " + circletest.getC());
        System.out.println("Area: " + circletest.getArea());
        circletest.changeR(1);
        System.out.println("Changed Area: " + circletest.getArea());

    }
    
}
