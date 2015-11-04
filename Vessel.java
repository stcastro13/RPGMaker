package cs202practicemidterm;


public abstract class Vessel 
{
	protected int volume;
	protected int amountSpilled;
	protected double radius;			
	public Vessel() 
	{
	}

	public abstract int getVolumeInCC();
	{
	}

	public void drink()
	{
		System.out.println("Glug glug glug goes "+ Vessel.this.getVolumeInCC() + " CCS of your favorite beverage");
	}
	public int getAmountSpilled(double amountPoured)
	{
		int amountSpilled;
		if(amountPoured <= volume)
		{
			amountSpilled = 0;
		}
		else
		{
			amountSpilled = (int) (amountPoured-volume);
		}
		return amountSpilled;
	}
	
	public void fill(double amountPoured)
	{
		if(volume >= amountPoured)
		{
			System.out.println(amountPoured + "CCs poured into the vessel");
		}
		else if(amountPoured> volume)
		{
			System.out.println(amountPoured +" CCs poured into the vessel;"+ Vessel.this.getAmountSpilled(amountPoured)+ "CCs spilled");
		}
		
	}
	

}
