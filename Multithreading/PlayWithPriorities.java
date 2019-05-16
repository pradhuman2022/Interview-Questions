public class PlayWithPriorities {
    public static void main(String ar[])
    {
        System.out.println(Thread.currentThread().getPriority());
        MyThread t = new MyThread() ;
    //    t.start() ;
        System.out.println(t.getPriority()) ;
        t.setPriority(10);
        t.start() ;
        for(int i = 0 ; i < 10 ; i++)
        System.out.println("Main thread") ;
        System.out.println(t.getPriority()) ;
        //System.out.println(Thread.MIN_PRIORITY+" "+Thread.MAX_PRIORITY+" "+Thread.NORM_PRIORITY) ;
    }
}
class MyThread extends Thread
{
  public void run()
  {
      for(int i = 0 ; i < 10 ; i++)
      System.out.println("Child Thread");
  }
}
