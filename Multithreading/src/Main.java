import java.lang.Thread;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RunnableDemo R1 = new RunnableDemo("Thread-1");
		R1.start();
		
		RunnableDemo R2 = new RunnableDemo("Thread-2");
		R2.start();
		
		
		
		
		System.out.println(Thread.currentThread().getName());
	    for(int i=0; i<10; i++){
	      new Thread("" + i){
	        public void run(){
	          System.out.println("Thread: " + getName() + " running");
	        }
	      }.start();
	    }
	    
	    
	    
	    
	    NotThreadSafe sharedInstance = new NotThreadSafe();

	    new Thread(new MyRunnable(sharedInstance)).start();
	    new Thread(new MyRunnable(sharedInstance)).start();

	    
	    
	    Counter counter = new Counter();
	      Thread  threadA = new CounterThread(counter);
	      Thread  threadB = new CounterThread(counter);
	
	      threadA.start();
	      threadB.start(); 
	}
}
