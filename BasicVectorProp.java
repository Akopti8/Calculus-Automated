/**
 * In this class I will be automating the following tasks that might prove useful later on 
 * 1. Finding the magnitude of a vector 
 * 2. find the angle between them
 * 3. finding the projection of a vector on another vector 
 * 4. finding the cross product
 * @author akopti
 *
 */
public class BasicVectorProp 
{

	//data 
	public static double U[]= new double[3];
	public static double V[]= new double[3];
	
	//methods
	
	public static double mag(double[] vector)
	{
		return(Math.sqrt((Math.pow(vector[0],2) + Math.pow(vector[1], 2) + Math.pow(vector[2], 2))));
	}

	public static double dotProduct(double[] a, double[] b)
	{
		return((a[0]*b[0])+(a[1]*b[1])+(a[2]*b[2]));
	}
	public static double angleBet(double [] a, double [] b)
	{
		return(Math.acos((dotProduct(a,b))/(mag(a)*mag(b))));
	}
	public static double[] projection(double[] a, double[] b)
	{
		double cons = (dotProduct(a,b)/Math.pow(mag(b),2));
		for(int i =0; i<a.length;i++)
		{
			b[i] *= cons;
		}
		return b;
	}
	public static double[] crossProduct( double[] a, double[] b)
	{
		double[] temp = new double[3];
		temp[0]= (a[1]*b[2]) - (a[2]*b[1]);
		temp[1]= (a[2]*b[0]) - (a[0]*b[2]);
		temp[2]= (a[0]*b[1]) - (a[1]*b[0]);
		
		return(temp);
	}
	public static void printArr(double [] a)
	{
		for(int i=0; i<a.length;i++)
		{
			if(i!=2) 
			{
				System.out.print(a[i] + ", ");
			}
			else
			{
				System.out.print(a[i] + ".");
			}
		}
		System.out.println();
		System.out.println("---------");
	}
	//to test these I will find the cross product of two vectors
	//and will see if the resuls match wolfram alpha's
	public static void main(String [] args)
	{
		double [] U = {1,2,4};
		double [] V = {1,2,3};
		printArr(crossProduct(U,V));
	}
}

