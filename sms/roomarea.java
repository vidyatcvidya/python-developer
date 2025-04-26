class room
{
	double length;
	double breadth;
	void getdata(double v,double s)
	{
		length=v;
		breadth=s;
	}
}
class roomarea
{
	public static void main(String args[])
	{
		room v=new room();
		v.length=10.5;
		v.breadth=3.5;
		System.out.println("the area of room="+v.length*v.breadth);
	}
}