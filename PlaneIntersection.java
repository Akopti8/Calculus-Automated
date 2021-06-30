/**
 * planes intersect in a line 
 * 1. I will first of all take the coefficients of the two planes' equation 
 * 2. I will find the cross product of both vectors that came out of the equation 
 * 3. the product of the cross product will be used to construct the equation of the line 
 * 4. I will then find the gaussian elimination of the vector consiting of the coefficients 
 * 5. the product will the coefficients of my new line 
 * 
 * @author Anton Kopti
 *
 */
import java.util.*;
public class PlaneIntersection extends BasicVectorProp
{
	//data
	public  Scanner sc = new Scanner(System.in);
	public double [][] planes;
	
	//constructors
	public PlaneIntersection()
	{
		planes = new double[2][4];
		this.insertVal();
	}
	
	
	
	//methods 
	public void insertVal()
	{
		for(int i=0;i<2;i++)
		{
			if(i==0)
			{
				System.out.println("insert the coefficients of your equation, include the value after the equal sign");
			}
			else
			{
				System.out.println("insert the coefficients of your second equation in teh same manner");
			}
			for (int j=0;j<4;j++)
			{
				planes[i][j]= sc.nextDouble();
			}
		}
	}
	
	public void findEqu()
	{
		
		double [] newArr= crossProduct(planes[0],planes[1]); //this method was taken from the parent class
		double [][] rowRed = rref(planes);
		double x = 0,y=0,z = 0;
		if(rowRed[1][1]!=1)
		{
			x=rowRed[0][3];
			y=0;
			z=rowRed[1][3];
		}
		else if(rowRed[0][2]!=1||rowRed[1][2]!=1)
		{
			x=rowRed[0][3];
			y=rowRed[1][3];
			z=0;
		}
		System.out.println("x=" + x + " + " +newArr[0]+"t");
		System.out.println();
		System.out.println("y=" + y + " + " +newArr[1]+"t");
		System.out.println();
		System.out.println("z=" + z + " + " +newArr[2]+"t");
	}
	
	//end methods
	
	
	//main
	public static void main(String args[])
	{
		PlaneIntersection PI = new PlaneIntersection();
		PI.findEqu();
	}
}
