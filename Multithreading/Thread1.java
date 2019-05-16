public class Main
{
 public static void main(String ar[])
 {
  MyThread t = new MyThread();
  t.start();
  for(int i = 0 ; i < 10 ; i++)
   {
     System.out.println("Main Thread") ;
   }
  }
 }
 //-------------------------Child Thread Started here ----------------------
 public class MyThread extends Thread
 {
  public void run()
  {
    System.out.println("Child Thread") ;
   }
  }
