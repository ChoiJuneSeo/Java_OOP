import java.security.cert.PolicyNode;

public class Week10 {
    public static void main(String[] args)
    {
        // Parent p = new Parent("parent");
        // Child c = new Child("child",0);
        // String cName = c.getName();
        // c.setValue(9999);
        // int cVal = c.getValue();
        // System.out.println(cName);
        // System.out.println(cVal);
        // System.out.printf("c instanceof c %s\n",c instanceof Child);
        // System.out.printf("c instanceof p %s\n",c instanceof Parent);
        // System.out.printf("p instanceof p %s\n",p instanceof Parent);
        // System.out.printf("p instanceof c %s\n",p instanceof Child);

         CoffeeBean c = new CoffeeBean();
         // System.out.println("c의 클래스는: " + c.getClass());
//
         Arabica a = new Arabica();
         // System.out.println("a의 클래스는: " + a.getClass());
//
         Robusta r = new Robusta();
         // System.out.println("r의 클래스는: " + r.getClass());
         // a.print();
         // a.print("overload");
         // CoffeeBean ca = new Arabica();
         // ca.print();
//        ca.print("불가능");

        Arabica a1 = new Arabica();
        // a1.print("instant quality");
        // a1.setSpecies("Arabica");
        // a1.print("instant quality");
//
        Rectangle myRect = new Rectangle(20.0, 10.0);
        // System.out.println(myRect.getHeight()); // 10.0 출력
        Pyramid p = new Pyramid();
        // p.printHeight(); // Rectangle height: 10.0 출력

        SeaTurtle st = new SeaTurtle();
        // System.out.println("다리 개수: "+st.limbs);
        // System.out.println("다리 개수: "+st.getLimbs());

        Point myPoint = new Point(10,10);
        Circle myCircle = new Circle(myPoint, 5);

        Circle myCircle2 = new Circle(10,10, 5);
        double myArea = myCircle.getArea();
        double myCircumference = myCircle.getCircumference();

        System.out.printf("원 면적: %.2f\n", myArea);
        System.out.printf("원 둘레: %.2f\n", myCircumference);
    }
}

class Parent {
    private String name;
    public Parent()
    {
        System.out.println("Default Parent Constructor");
        name = null;
    }
    public Parent(String n)
    {
        System.out.println("Parant constructor");
        name = n;
    }

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
}
class Child extends Parent {
    private int value;
    public Child(String n, int v)
    {
        // super(n);
        System.out.println("Child constructor");
        value = v;
    }

    public int getValue() {return value;}
    public void setValue(int value) {this.value = value;}
}
class CoffeeBean{
    String species = "Coffee";
    void print(){System.out.println(species);}
    protected void setSpecies(String s){species = s;}
}
class Arabica extends CoffeeBean {
    @Override
    void print(){
        super.print();
        System.out.println("Arabica coffee...");
    }
    void print(String s)
    {
        System.out.printf("%s: %s\n",species,s);
    }
}
class Robusta extends CoffeeBean{String species = "Robusta";}
class Rectangle {
    protected double width;
    protected double height;
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double getWidth() { return width; }
    public double getHeight() { return height; }
}
class Pyramid {
    Rectangle myRect = new Rectangle(20.0, 10.0);
    void printHeight() {
        System.out.println("Rectangle height: " + myRect.height);
    }
}

class Turtle {
    protected int limbs = 4;
    protected String food;
    public void setFood(String f) { this.food = f; }
    public void eat() { System.out.println("Turtle eats " + food); }
    public int getLimbs() { return this.limbs; }

}

class SeaTurtle extends Turtle {
    public void swim() { System.out.println("A sea turtle swims..."); }
}

class LandTurtle extends Turtle {
    public void walk() { System.out.println("A land turtle walks..."); }
}
class Point
{
    private int x,y;
    public Point(){}
    public Point(int _x, int _y)
    {
        x = _x;
        y=  _y;
    }

    public int getX() {return x;}
    public int getY() {return y;}
    @Override
    public String toString() {
        String msg = "(" + x + " , " + y + ")";
        return msg;
    }
}
class Circle
{
    private Point point;
    private double radius;

    public Circle(){}
    public Circle(Point p, int r)
    {
        point = p;
        radius = r;
    }
    public Circle (int x, int y, int r)
    {
        point = new Point(x,y);
        radius = r;
    }
    public double getRadius(){return radius;}
    public double getCircumference(){return 2 * Math.PI *radius;}
    public double getArea(){return Math.PI * radius * radius;}
}
