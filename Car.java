/**
 * Lab 10 Car class
 * @author Sarah Steverson
 *
 */
public class Car extends Vehicle
{

	private int numDoors;
	private int numPass;
	
	public Car(String aMake, String aModel, String aPlate, int numDoors, int numPass)
	{
		super(aMake, aModel, aPlate);
		this.numDoors = numDoors;
		this.numPass = numPass;
	}
	
	public int getNumDoors()
	{
		return this.numDoors;
	}
	
	public int getNumPass()
	{
		return this.numPass;
	}
	
	@Override
	public String toString() 
	{
		String result = "";
		result = String.format("%d-door %s %s with license %s", this.numDoors,
			super.getMake(), super.getModel(), super.getPlate());
		return result;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		if (!(obj instanceof Car))
		{
			return false;
		}
		
		Car other = (Car) obj;
		if (this.numDoors==(other.getNumDoors()) && this.numPass == (other.getNumPass()))
		{
			return super.equals(obj);
		}
		return false;
	}
	
	public Car copy()
	{
		String theMake = this.getMake();
		String theModel = this.getModel();
		String thePlate = this.getPlate();
		int numDoors = this.getNumDoors();
		int numPass = this.getNumPass();
		
		Car theCopy = new Car(theMake, theModel, thePlate, numDoors, numPass);
		return theCopy;
	}
	
}