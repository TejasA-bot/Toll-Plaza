import java.util.*;

	public class toll 
	{
		public static void main(String[] args) throws InterruptedException 	
		{
			int a=0,b=0,c=0,d=0, Bike=10, Car=20, Bus=25, Truck=35, n=0,amt=0,tt=0,local=0,
					outside=0,tb=0,tc=0,ts=0,tr=0,op = 0;
			  
			while(true)
			{
	            System.out.println("\n\t **** Welcome to Toll plaza **** ");
	            System.out.println("\n\t 1. Local Vechical ");
	            System.out.println("\t 2. Outside Vechical  ");
	            System.out.println("\t 3. Exit ");
	            System.out.println("\t Enter Your Choise");
	            Scanner sc=new Scanner(System.in);
	           
	            try {
	            		op=sc.nextInt();
	            	}
	            catch (InputMismatchException e)
	            	{
						System.out.println("Inpute Mismatch Exception has occured" +e.getMessage());
	            	}
	            switch (op) {
	                case 1:
	                System.out.println("\n\t No charges for local vechical");
	                local=local+1;
	                break;
	                case 2:
	                
	                    System.out.println("\n\t *** Select Vechical *** ");
	                    System.out.println("\n\t 1. Bike ..... 10.00 Rs/- ");
	                    System.out.println("\n\t 2. Car ..... 20.00 Rs/- ");
	                    System.out.println("\n\t 3. Bus ..... 25.00 Rs/- ");
	                    System.out.println("\n\t 4. Truck ..... 35.00 Rs/- ");
	                    System.out.println("\n\t Enter your choise = ");
	                    try 
	                    {
	                    	n=sc.nextInt();
	                    }
	                    catch (InputMismatchException e2)
	                    {
	    					System.out.println("Inpute Mismatch Exception has occured" +e2.getMessage());
	    	            }
	                    if(n==1)
	                    {
	                        System.out.println("\n\t Vechical type:- Bike \n\t please pay "+Bike+" Rs/-");
	                        tb++;
	                        Thread.sleep(2000);
	                        System.out.println("\n\tThank you...!");
	                        Thread.sleep(1000);
	                    }
	                   else if(n==2)
	                   {
	                         System.out.println("\n\t Vechical type:- Car \n\t please pay "+Car+" Rs/-");
	                        tc++;
	                        Thread.sleep(2000);
	                        System.out.println("\n\tThank you...!");
	                        Thread.sleep(1000);
	                   }
	                   else if(n==3)
	                   {
	                        System.out.println("\n\t Vechical type:- Bus \n\t please pay "+Bus+" Rs/-");
	                        ts++;
	                        Thread.sleep(2000);
	                        System.out.println("\n\tThank you...!");
	                        Thread.sleep(1000);
	                   }
	                    else if(n==4)
	                    {
	                        System.out.println("\n\t Vechical type:- Truck \n\t please pay "+Truck+" Rs/-");
	                        tr++;
	                        Thread.sleep(2000);
	                        System.out.println("\n\tThank you...!");
	                        Thread.sleep(1000);
	                    }
	                    
	                    outside=tb+tc+ts+tr;
	                    tt=local+outside;
	                   
	                 break;
	                 case 3:
	                	 System.out.println("\n\t Please wait, data is collecting......");
	                	 Thread.sleep(4000);
	                     System.out.println("\n\t **** Total collection **** ");
	                     System.out.println("\n");
	                     a=tb*Bike;
	                     b=tc*Car;
	                     c=ts*Bus;
	                     d=tr*Truck;
	                     amt=a+b+c+d;
	                     System.out.println("\t Total Ammount= " +amt);
	                     System.out.println("\n");
	                     System.out.println("\t **** Total Vechicals ****");
	                     System.out.println("\n");
	                   
	                     System.out.println("\t Total Traffic= " +tt);
	                     System.out.println("\n\t Total Local Vechicals= " +local);
	                     
	                     System.out.println("\n\t Total Outside Vechicals= " +outside);
	                     
	                     System.out.println("\n\t Total no of Bikes= "+tb);
	                     System.out.println("\n\t Total no of Cars= " +tc);
	                     System.out.println("\n\t Total no of Buses= " +ts);
	                     System.out.println("\n\t Total no of Trucks= " +tr);
	                     System.exit(0);
	                     break;
	                     
	                }
	            }
	        }
	    }
	
