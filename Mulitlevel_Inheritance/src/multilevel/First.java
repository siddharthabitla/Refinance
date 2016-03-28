package multilevel;

public class First {
  
  public void fn1() {
    System.out.println("This is public from First class.");
  }
  
  void fn2() {
    System.out.println("This is default from First class");
  }
  
  private void fn3() {
    System.out.println("This is private from First class");
  }
  
  protected void fn4() {
    System.out.println("This is protected from First class");
  }
  
  public static void main(String[] args) {
    First f = new First();
    
    f.fn1();
    f.fn2();
    f.fn3();
    f.fn4();
  }  // main()

}  // First