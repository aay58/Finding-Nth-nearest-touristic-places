public class PriorityQueue {
	 private Task[] heap; 
	    private int heapSize, capacity;	 
	    /** Constructor **/
	    public PriorityQueue(int capacity)
	    {    
	        this.capacity = capacity + 1;
	        heap = new Task[this.capacity];
	        heapSize = 0;
	    }
	    /** function to insert task **/
	    public void insert(int priority,int x,int y,int distance,boolean bool,int generated)
	    {
	    	
	        Task newJob = new Task( priority,x,y,distance,bool,generated);	     
	        heap[++heapSize] = newJob;
	        int pos = heapSize;
	        int pos2=heapSize;
	        
	        while (pos != 1 && newJob.getPriority() < heap[pos/2].getPriority())
	        {	        	
	            heap[pos] = heap[pos/2];
	            pos /=2;
	            pos2=2*pos;
	            if(pos2!=heapSize)
	            	controlRightPlace(pos2+1);
	            controlRightPlace(pos2);
	        }
	        heap[pos] = newJob;
	        if(pos!=1)
	        	controlRightPlace(pos);
	        
	      
	    }
	    public void controlRightPlace(int i)
	    {
	    	for(int j=i/2;j<i;j++)
	    	{
	    		if(heap[i].getPriority()<heap[j].getPriority())
	    		{
	    			Task swap=heap[i];
	    			heap[i]=heap[j];
	    			heap[j]=swap;
	    		}
	    	}
	    }	 
	    /** function to remove task **/
	    public Task remove()
	    {	      
	        Task item,min;
	        item = heap[1];
	        heap[1]=heap[heapSize];
	        heap[heapSize]=item;
	        min=heap[heapSize--];
	        sink(1);
	        heap[heapSize+1]=null;//delete smallest element
	        print(min);
	        return min;
	    }
	    public void sink(int k) {
	    	Task swap;
	        while (2*k <= heapSize) {
	            int j = 2*k;
	            if (j < heapSize) 
	            {	
	            	if(heap[j].getPriority()>heap[j+1].getPriority())
	            		j++;
	            }
	            if(heap[k].getPriority()<heap[j].getPriority())
	            	break;
	            swap=heap[k];
	            heap[k]=heap[j];
	            heap[j]=swap;
	            
	            k = j;
	        }
	    }
	    public void print(Task min)
	    {
	    	
	    	if(min.isFeeOrDis()==false)//if priority queue is visit fee
	    	{
	    		System.out.println(min.getgenerated()+ " generated coordinate is "+ min.getDistance());
	    		System.out.println("Coordinates of touristic place is ( " +min.getX()+" , " + min.getY()+ " ) ,"+" location fee is "+ min.getPriority());
	    	}
	    	else//if priority queue is distance
	    	{
	    		System.out.println(min.getgenerated()+" generated coordinate is "+ min.getPriority());
	    		System.out.println("Coordinates of touristic place is ( " +min.getX()+" , " + min.getY()+ " ) ,"+" location fee is "+ min.getDistance() );
	    	}
	    }
	   	   
	   

}
