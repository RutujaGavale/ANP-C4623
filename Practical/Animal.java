//inheritance example
package corejava;

class Animal
{
	//method
	public void display()
    {
	System.out.println("Inside parent class");	
	}
	
    
}
//child class
class Dog extends Animal

{
     public void sound()
     {
	  System.out.println("Barks....");
     }
	
}
class puppy extends Dog
{
	public void run()
	{
		System.out.println("he runs by small steps..");
	}
}
class Test
{
	public static void main(String []args) 
	{
		puppy d=new puppy();//creating object
		d.display();
		d.sound();
		d.run();
		
	}
}
