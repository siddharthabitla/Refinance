package multilevel;

public class Second extends First {
  
  public void fn1() {
    System.out.println("This is public from Second class.");
  }
  
  void fn2() {
    System.out.println("This is default from Second class");
  }
  
  protected void fn4() {
    System.out.println("This is protected from Second class");
  }
  
  public static void main(String[] args) {
    Second s = new Second();
    
    s.fn1();
    s.fn2();
    s.fn4();
  }  // main()

}  // Second