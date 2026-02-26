package umg.edu.gt.data_structure.queue;



import umg.edu.gt.data_structure.queue.manual.QueueLinked;


public class Main {
	
	
	public static void main(String[] args) {
		
      

        QueueLinked<Integer> queue = new QueueLinked<>();
        queue.enqueue(10);
        queue.enqueue(20);
        //queue.enqueuePriority(50);
        queue.enqueue(30);

        System.out.println(queue.peek());   // 10
        System.out.println(queue.dequeue()); // 10
        System.out.println(queue.dequeue()); // 20
        System.out.println(queue.size());    // 1
        System.out.print(queue.peek());    }

}
