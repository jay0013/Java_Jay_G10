package com.tnsif.daythirteen.multithreading;

//To define methods present in Thread Class
public class ThreadMethodDemo {

	public static void main(String[] args) {
		ThreadClass t1 = new ThreadClass(5,"First"); //object of ThreadClass one
		ThreadClass t2 = new ThreadClass(8,"Second");//object of ThreadClass two
		System.out.println("Current Thread: "+Thread.currentThread());// return the current thread
		
		t1.start();
		t2.start();
		
		Thread.currentThread().setName("Parent Thread"); //assign the name to current thread
		Thread.currentThread().setPriority(Thread.NORM_PRIORITY);
		System.out.println("Current Thread: "+Thread.currentThread());
		
		try{
			t1.join();//wait current thread until the t1 is dead
			t2.join();//wait current thread until the t2 is dead or time period is over
		}
		
		catch(Exception e) {
			System.out.println("Thread is Interrupted");
		}
		
		System.out.println("----------End of Main-----------");

	}

}
