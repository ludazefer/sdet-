package bacics;

public class Cities {

	public static void main(String[] args) {
       String[] cities= { "New York","San Francisco","Miami","Dalass"};
       System.out.println(cities[0]);
       
       System.out.println("***************************");
       String[] states=new String[5];       
       states[0]="California";
       states[1]="Ohio";
       states[2]="New Jersey";
       states[3]="Texas";
       states[4]="Utah";
       int i=0;
       do { System.out.println(states[i]);
       		i=i+1;       				
       }while(i<5);
       int n=0;
       while(n<=4) {
    	   System.out.println("STATE "+ states[n]);
    	   n=n+1;
       }

       
	}

}
