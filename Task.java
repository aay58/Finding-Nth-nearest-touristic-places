
public class Task {
	 
	   private int priority,x,y,distance;	  
	    private boolean feeOrDis;	 
		private int generated;
	 
	    /** Constructor **/
	    public Task( int priority,int x,int y,int distance,boolean cont,int generated)
	    {
	      //  this.job = job;
	    	this.x = x;
	    	this.y = y;
	    	this.distance = distance;	    							
	        this.priority = priority;
	        feeOrDis=cont;
	        this.generated=generated;
	    }
	    public int getgenerated() {
	 			return generated;
	 		}
	 		public void setgenerated(int generated) {
	 			this.generated = generated;
	 		}
	 		public int getPriority() {
	 			return priority;
	 		}
	 		public int getX() {
	 			return x;
	 		}
	 		public int getY() {
	 			return y;
	 		}
	 		public int getDistance() {
	 			return distance;
	 		}
	 		public boolean isFeeOrDis() {
	 			return feeOrDis;
	 		}
	        
}
