import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Manager {
	public void doOperation()
	{
		ArrayList<Integer> distances=new ArrayList();
		ArrayList<Integer> costlist=new ArrayList();
		
		Random randomValue = new Random();
		int x1=randomValue.nextInt(1000)+1;/*For Alice's x coordinate, x1 and x2 are summed, where the position can also be negative.*/
		int x2=randomValue.nextInt(1000)+1;
		int x=generateRandomVal(x1,x2);
		
		int y1=randomValue.nextInt(1000)+1;//For Alice's y coordinate, y1 and y2 are summed
		int y2=randomValue.nextInt(1000)+1;
		int y=generateRandomVal(y1,y2);
		
		for(int i =0; i < 200; i++)//The location of 100 tourist place is determined. 
									//The x and y coordinates are added to the distance arraylist, respectively
		{
		    int  locTouristic1= randomValue.nextInt(1000) + 1;
		    int locTouristic2 = randomValue.nextInt(1000) + 1;
		    int locationPlace=generateRandomVal(locTouristic1,locTouristic2);
		    distances.add(locationPlace);		    
		}
		for(int j=0;j<100;j++)//generate free 
		{			
			int cost=randomValue.nextInt(60)+1;
			costlist.add(cost);
		}
		
		Scanner scan = new Scanner(System.in);
        System.out.print("N: ");           
       int n=scan.nextInt();      
       if(n>100)
       {
    	   System.out.println("ERROR.You entered more than 100.");
    	   System.out.print("N: ");
    	   n=scan.nextInt();
       }     

    	   PriorityQueue pq = new PriorityQueue(100);
    	   int j=0;
    	   for(int i=0;i<costlist.size();i++)
           {            	 
            	double betweenDistance= (x-distances.get(j))*(x-distances.get(j))+((y-distances.get(j+1))*(y-distances.get(j+1)));
            	 
            	 if((int)Math.sqrt(betweenDistance)<=200)//If the distance between them is less than 200, priority order is the fee to visit.
            	 {            		 
            		 pq.insert(costlist.get(i),distances.get(j),distances.get(j+1),(int)Math.sqrt(betweenDistance),false,i);
            		
            	 } 
            	else//If the distance between them is more than 200, priority order is distance.
            	{
            		 pq.insert((int)Math.sqrt(betweenDistance), distances.get(j),distances.get(j+1),costlist.get(i),true,i );
            	 	}
            		 j=j+2;
             }
           
             System.out.println("The booster distances are found!");
             for(int i=0;i<n;i++)
             {
            	System.out.print(i+1 +"th nearest distance calculated with ");
            	pq.remove();
            	System.out.println();
             }     
    	   
       
	}
	public int generateRandomVal(int max , int min)/*generate random value */
	{ 	    
	    int value = -min + (int) (Math.random() * ((max - (-min)) + 1));
	    return value;
	}
	

}
