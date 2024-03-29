package _03_Threaded_Reverse_Greeting;

public class ThreadedReverseGreeting {
   //Write a program that creates a thread (Thread 1) that creates another thread (Thread 2); 
  //Thread 2 creates Thread 3; and so on, up to Thread 50. 
  //Each thread should print "Hello from Thread <num>!", 
  //but you should structure your program such that the threads print their greetings in reverse order.
	
	/* HINT: You will most likely need to do this with recursion */
	public static void main(String[] args) {
		Thread[] tt = new Thread[51];
threadLoops(tt);
	}
	static void threadLoops(Thread[] t1) {
		for (int i = t1.length-1; i >= 1; i--) {
			t1[i] = new Thread(()-> new Thread());
			t1[i].setName("Hello from thread"+i);
			System.out.println(t1[i].getName());
		}
		
	}
}
