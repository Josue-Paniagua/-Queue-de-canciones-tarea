package queueHandler;



import umg.edu.gt.data_structure.queue.manual.QueueLinked;

public class MAIN {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueLinked<Song> highPriority = new QueueLinked<>();
		QueueLinked<Song> normalPriority = new QueueLinked<>();
		
		int TotalSongPlay = 0;
		int TotalMin = 0;
		Song s1 = (new Song("Cancion A", "Artista A", 5,1));
		Song s2 = (new Song("Cancion B", "Artista B", 6,2));
		Song s3 = (new Song("Cancion C", "Artista C", 7,1));
		
		
		if (s1.getPriority()==1) 
			highPriority.enqueue(s1);
		else 
			normalPriority.enqueue(s1);
		if (s2.getPriority() == 1)
		    highPriority.enqueue(s2);
		else
		    normalPriority.enqueue(s2);

		if (s3.getPriority() == 1)
		    highPriority.enqueue(s3);
		else
		    normalPriority.enqueue(s3);
	
		
		System.out.println("High size: " + highPriority.size());
		System.out.println("Normal size: " + normalPriority.size());
		System.out.print("[LOG] Starting Playlsit ... ");
		
		while (!highPriority.isEmpty() || !normalPriority.isEmpty()) {
			
			Song current;
			 if (!highPriority.isEmpty())
				  current = highPriority.dequeue();
			 else 
				 current = normalPriority.dequeue();
			
			System.out.print("\n [LOG] Now Playing : " + current.getTitle() +
					"---"+ current.getArtist() + "(" + current.getDuration() +" s ) ");
			
			for (int i = 1; i <= current.getDuration(); i ++) 
			{
				System.out.print("\n[LOG] Playin :" + current.getTitle()
				+ "|" + i + "/s actual   "+current.getDuration() + "/s totales ");
				
				try {
					
					Thread.sleep(1000);
				} catch(InterruptedException e ) {
					e.printStackTrace();
				}
				
		}
			System.out.print("\n -[LOG]Song Finished : " + current.getTitle());

			TotalSongPlay++;
			TotalMin += current.getDuration();
			
	
		}
		
		System.out.print("\n[LOG] Playlsit Finished ");
		
		System.out.print("\nTotal de canciones reproducidas : " + TotalSongPlay);
		
		System.out.print("\n Tiempo total acumulado reproducido : " + TotalMin + "  Segundos " );

	}
	


}
