package _04_Thread_Pool;

import java.util.concurrent.ConcurrentLinkedQueue;

public class ThreadPool {
Thread[] thread;
ConcurrentLinkedQueue<Task> taskQueue;
	public ThreadPool(int totalThreads) {
		thread = new Thread[totalThreads];
		for (int i = 0; i < thread.length; i++) {
			thread[i] = new Thread(()->new Worker(taskQueue));
			
		}
		taskQueue = new ConcurrentLinkedQueue<Task>();
	}



   void addTask(Task task){
	taskQueue.add(task);
}



	public void start() {
		for (int i = 0; i < thread.length; i++) {
			try {
			
				thread[i].start();
				thread[i].join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
	}

}
