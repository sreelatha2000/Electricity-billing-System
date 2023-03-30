import java.util.Scanner;
class  ElectricityBillingSystem
{
	public static void main(String[] args) 
	{   
	   	Scanner scan =new Scanner (System.in);
        int status =0;
		double charge;
		int customerId=1828;
		System.out.println("Plese enter your name");
        String name =scan.nextLine();
        System.out.println("_____________________________________________________________________________________________________");

        System.out.println("****Welcome to the APCPDCL online elctricity billing system****");
		System.out.println("_____________________________________________________________________________________________________  ");
		do
		{
        System.out.println("please enter your password");
        int password=scan.nextInt();
		System.out.println("_____________________________________________________________________________________________________");
	
			if (customerId==password)
		    {
				System.out.println("press 1 for check the Your Details");
		        System.out.println("press 2 for check the Deadline for bill payment");
		        System.out.println("press 3 for check the Meter Location");
		        System.out.println("press 4 for check the Meter Type");
		        System.out.println("press 5 for check the Phase Code");
		        System.out.println("press 6 for check the Bill Type");
				int choice =scan.nextInt();
		        if (choice==1)
		        {
		            System.out.println("Name : "+name);
                    int meterNumber=383630;
			        System.out.println("Meter Number : "+meterNumber);
		            String address="Krishna";
                    System.out.println("Adress : "+address);
		        	String state="Andhra Pradesh";
                    System.out.println("state : "+state);
			        String city="machilipatnam";
                    System.out.println("City : "+city);
		            String email= name+"@gmail.com";
                    System.out.println("email : "+email);
			        int phone=900089;
                    System.out.println("Phone : "+phone);
		        }
	        	else if (choice==2)
	         	{
			       String deadline="january 18";
			       System.out.println("Dead line : "+deadline);
		        }
		        else if (choice==3)
		        {
			       String meterLocation="inside";
			       System.out.println("Meter Location : "+meterLocation);
		        }
		        else if (choice==4)
		        {
			       String meterType="Electric Meter";
		           System.out.println("Meter Type : "+meterType);
		        }
	           	else if (choice==5)
		        {
			       int phaseCode=033;
			       System.out.println("Phase Code : "+phaseCode);
	         	}
		        else if (choice==6)
		        {
			       String billType="Normal";
			       System.out.println("Bill Type : "+billType);
		        }
		        else
	         	{
		        	System.out.println("incorrect number you have entered");
	        	} 
				
		            System.out.println("_________________________________________________________________________________________");
		
         
              System.out.println("Plese enter your meter count in units");
			  int count=scan.nextInt();

		      if (count<500 )
		      {
		     	 charge= 1.00;
				double amount = charge*count;
				double meterRent=47.00;
				System.out.println("Meter Rent: "+meterRent+" rupees ");
				double serviceCharge=22.00;
				System.out.println("Service Charge: "+serviceCharge+" rupees ");
				double serviceTax=57.00;
				System.out.println("Service Tax: "+serviceTax+" rupees ");
				double swachBharatCess=6.00;
				System.out.println("Swacch Bharat Cess: "+swachBharatCess+" rupees ");
			    System.out.println("Charges for Units Consumed :"+amount);
				double totalCharges=amount+meterRent+serviceCharge+serviceTax+swachBharatCess;
				System.out.println("Total Charge "+totalCharges);
		      }
	          else if (count>=500  && count<600)
	          {
		        charge= 1.80;
                 double amount = charge*count;
				 double meterRent=47.00;
				System.out.println("Meter Rent: "+meterRent+" rupees ");
				double serviceCharge=22.00;
				System.out.println("Service Charge: "+serviceCharge+" rupees ");
				double serviceTax=57.00;
				System.out.println("Service Tax: "+serviceTax+" rupees ");
				double swachBharatCess=6.00;
				System.out.println("Swacch Bharat Cess: "+swachBharatCess+" rupees ");
			    System.out.println("Charges for Units Consumed :"+amount);
				double totalCharges=amount+meterRent+serviceCharge+serviceTax+swachBharatCess;
				System.out.println("Total Charge "+totalCharges);
	          }
	          else if (count>=600 && count<800)
		      {
		        charge= 2.00;
			    double amount = charge*count;
				 double meterRent=47.00;
				System.out.println("Meter Rent: "+meterRent+" rupees ");
				double serviceCharge=22.00;
				System.out.println("Service Charge: "+serviceCharge+" rupees ");
				double serviceTax=57.00;
				System.out.println("Service Tax: "+serviceTax+" rupees ");
				double swachBharatCess=6.00;
				System.out.println("Swacch Bharat Cess: "+swachBharatCess+" rupees ");
			    System.out.println("Charges for Units Consumed :"+amount);
				double totalCharges=amount+meterRent+serviceCharge+serviceTax+swachBharatCess;
				System.out.println("Total Charge "+totalCharges);
	          }
		      else 
		      {
		     	charge=3.00;
			    double  amount = charge*count;
				double meterRent=47.00;
				System.out.println("Meter Rent: "+meterRent+" rupees ");
				double serviceCharge=22.00;
				System.out.println("Service Charge: "+serviceCharge+" rupees ");
				double serviceTax=57.00;
				System.out.println("Service Tax: "+serviceTax+" rupees ");
				double swachBharatCess=6.00;
				System.out.println("Swacch Bharat Cess: "+swachBharatCess+" rupees ");
			    System.out.println("Charges for Units Consumed :"+amount);
				double totalCharges=amount+meterRent+serviceCharge+serviceTax+swachBharatCess;
				System.out.println("Total Charge "+totalCharges);
				}
			}
	   
		    else
		    {
			    System.out.println("incorrect password ");
		    }

        System.out.println("_____________________________________________________________________________________________________");


		System.out.println("Do you wish to continue press 1");
		System.out.println("Do you wish to stop press 0");
		status = scan.nextInt();
        
		}
		while (status==1);
		System.out.println("_____________________________________________________________________________________________________");

		{
		System.out.println("thank you");


		}
     }
}


	

	




		

             
			  
		



