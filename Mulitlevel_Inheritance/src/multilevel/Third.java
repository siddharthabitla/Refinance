package multilevel;

public class Third extends Second {
  
  public void fn1() {
    System.out.println("This is public from Third class.");
  }
  
  void fn2() {
    System.out.println("This is default from Third class");
  }
  
  protected void fn4() {
    System.out.println("This is protected from Third class");
  }

  public static void main(String[] args) {
    Second t = new Third();
    
    t.fn1();
    t.fn2();
    t.fn4();
  }  // main()

}  // Third