package multithreading;

class threadDemo1 extends Thread 
{
    public void run()
    {
       for(int i=0;i<10;i++)
       {
           System.out.println("Thread1");
       }
    }
}

class threadDemo2 extends Thread 
{
    public void run()
    {
            System.out.println("Before Join");
            System.out.println("After Join");
    }
}

class joinMethod 
{
    public static void main(String args[])
    {
        threadDemo2 t2=new threadDemo2();
        t2.setPriority(Thread.MAX_PRIORITY);
        t2.start();
        
        threadDemo1 t1=new threadDemo1();
        t1.setPriority(Thread.MIN_PRIORITY);
        t1.start();
     
    }
}
