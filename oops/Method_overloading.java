class Method_overloading{
  void addition(int a,int b){
      int sum=a+b;
      System.out.println("Sum of two numbers = "+sum);
  }
  void addition(int a,int b,int c){
    int sum=a+b+c;
    System.out.println("Sum of three numbers ="+sum);
  }
  public static void main(String args[]){
    OverloadingTest1 ovl=new OverloadingTest1();
    ovl.addition(2,5,10);
    ovl.addition(15,10);
  }
}
