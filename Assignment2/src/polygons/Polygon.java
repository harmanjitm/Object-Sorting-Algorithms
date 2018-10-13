package polygons;

public abstract class Polygon implements Comparable<Polygon>
{
	
	private double	height;
	private char 	compareType;
	
	
	public Polygon(double height, char compareType)
	{
		this.height 		= height;
		this.compareType 	= compareType;
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public char getCompareType() {
		return compareType;
	}
	
	public void setCompareType(char compareType) {
		this.compareType = compareType;
	}
	
	public abstract double calcBaseArea();
	
	public abstract double calcVolume();
	
	@Override
	public int compareTo(Polygon p)
	{
		int returnValue = 0;
		if(p.getCompareType() == 'h')
		{
			
		}
		else if(p.getCompareType() == 'v')
		{
			
		}
		else if(p.getCompareType() == 'a')
		{
			
		}
		else
		{
			returnValue = 0;
		}
		return returnValue;
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
}
