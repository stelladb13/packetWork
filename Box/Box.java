package Box;
public class Box{
    private double len, width;
    public Box(double a,double b){
        width = a;
        len = b;
    }public double getArea(){return (len*width);
    }public double getPerimeter(){
        double p = 2.0*(len+width);
        return p;
    }public void bigger(double f){
        len = f*len;
        width = f*width;}
    }
