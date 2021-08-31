/**
 * Program Name:  cellphone.java
 * Purpose:
 * @author:       Chakradhar Tallapally,0925239
 * Date:          Jul. 16, 2020  
 */

public class cellphone
{
	private String make;
	private String model;
	private int capacity;
	
	public cellphone()
	{
		this.make = "Samsung";
		this.model = "Galaxy Pixel2";
		this.capacity = 32;
	}
	 public cellphone(String make, String model)
	 {
		 this.make = getMake();
		 this.model = getModel();
		 this.capacity= getCapacity();
		 
	 }
	public cellphone(String make, String model, int capacity) 
	{
		this.capacity = capacity;
		this.make = make;
		this.model = model;
		
	}
	   public String getMake()
	   {
		   return this.make;
		  }
	   public String getModel()
	   {
		   return this.model;
		  
	   }
	   public int getCapacity()
	   {
		   return this.capacity;
	   }
	   public String setMake(String mymake)
	   {
		   return this.make = mymake;
	   }
	   public String setModel(String mymodel)
	   {
		   return this.model = mymodel;
	   }
	
	   }


	   
	// End of Main Method
// End of class