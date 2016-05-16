package demo;

public class Test {

  public static void main(String[] args) {
    Area s = new Square(15);
    Area t = new Triangle(10, 15);
    Area c = new Circle(31.57);
    Area r = new Rectangle(12, 10);

    Area[] arr = {s, t, c, r};
    for (Area x: arr) {
      x.welcome();
      x.param();
      x.calArea();
      x.newline();
    }  // for
    
  }  // main()

}  // Test