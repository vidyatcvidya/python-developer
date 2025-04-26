import java.util.*;
class vector_demo
{
	public static void main(String args[])
	{
		Vector list=new Vector();
		int len=args.length;
		for(int i=0;i<len;i++)
		{
			list.addElement(args[i]);
		}
		list.insertElementAt("os",1);
		int s=list.size();
		String array=new String(s);
		list.copyInto(args(s));
		System.out.println("Enter list of Elements");
		{
			for(int i=0;i<len;i++)
			{
				System.out.println(args[i]);
			}
		}
	}
}